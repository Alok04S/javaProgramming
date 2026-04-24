import java.util.Scanner;
class IsePattern{

	
	static void space(int spaces){
		if(spaces==0){
			return;
		}
		System.out.print(" ");
		space(spaces-1);
	}
	
	static void star(int stars){
		if(stars==0){
			return;
		}
		System.out.print("*");
		star(stars-1);
	}	
	
	static void pattern(int size){

        int mid=0;
	if(size%2==0){

		 mid=size/2-1;
	}
	else{
		 mid=size/2;
	}


	//upper
		for(int row=0;row<=mid;row++){
		//space(4-2-0)
			space(2*(mid-row));	
		//stars(1-5-9)	
			star(4*row+1);		
			System.out.println();
		}

	if(size%2==0){
	
	//lower
		for(int row=mid;row>=0;row--){
		//space(4-2-0)
			space(2*(mid-row));	
		//stars(1-5-9)	
			star(4*row+1);		
		
		System.out.println();
		}
		
	}

	else{

	//lower
		for(int row=mid-1;row>=0;row--){
		//space(4-2-0)
			space(2*(mid-row));	
		//stars(1-5-9)	
			star(4*row+1);		

		System.out.println();
		}	
	}
	
	}

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size:");
	int size=sc.nextInt();
	sc.nextLine();
	

	pattern(size);	

	}

}