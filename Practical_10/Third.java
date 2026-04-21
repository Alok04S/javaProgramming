/* 
Multilevel Inheritance 
*/

class Book{
	String name;

	Book(String name){
   	this.name = name;
	System.out.println("This is a book :" + name );
	}	
}

class Novel extends Book {
	String type;
	Novel(String type, String name){
	super(name);
	this.type = type;
	System.out.println("This is novel");
	}
}

class MysteryNovel extends Novel{
	String theme;

	MysteryNovel(String theme, String type , String name ){
	super(type,name);
	this.theme = theme;
	System.out.println("This is mystery novel");
	System.out.println("Theme :" + theme);
	}
	
	public static void main(String []args) {
       	MysteryNovel obj = new MysteryNovel("Detective", "Fiction", "Sherlock Holmes");
	}
}