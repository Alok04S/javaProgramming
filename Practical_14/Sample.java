import java.util.Scanner;

interface HostelOps {

    void allotRoom(String name) throws RoomException;

    void vacateRoom(String name);

    default void welcome() {
        privateMsg();
        System.out.println("Welcome to Hostel Management");
    }

    private void privateMsg() {
        System.out.println("------ Hostel System ------");
    }

    static void info() {
        System.out.println("Static Method of Interface");
    }
}

class RoomException extends Exception {
    RoomException(String msg) {
        super(msg);
    }
}

abstract class HostelBase {
    final String hostelName = "ABC Hostel";
    int rooms = 3;

    abstract void showType();
}

class HostelManager extends HostelBase implements HostelOps {

    public void allotRoom(String name) throws RoomException {
        if (rooms == 0) {
            throw new RoomException("No Rooms Available");
        }

        rooms--;
        System.out.println("Room allotted to " + name);
    }

    public void vacateRoom(String name) {
        rooms++;
        System.out.println(name + " vacated room");
    }

    void showType() {
        System.out.println("Boys Hostel");
    }
}

public class Sample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HostelManager h = new HostelManager();
        int ch;

        h.welcome();
        HostelOps.info();

        do {
            System.out.println("\n1.Allot Room");
            System.out.println("2.Vacate Room");
            System.out.println("3.Check Rooms");
            System.out.println("4.Hostel Type");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    try {
                        h.allotRoom(sc.nextLine());
                    } catch (RoomException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter Student Name: ");
                    h.vacateRoom(sc.nextLine());
                    break;

                case 3:
                    System.out.println("Rooms Left: " + h.rooms);
                    break;

                case 4:
                    h.showType();
                    System.out.println("Hostel Name: " + h.hostelName);
                    break;
            }

        } while (ch != 5);

        sc.close();
    }
}