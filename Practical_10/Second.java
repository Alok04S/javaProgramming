class Book{
	String name;
	Book(String name) {
	this.name = name;
	System.out.println("This is a book");
	}
}

class Novel extends Book{
	String type;
	Novel(String type, String name){
		super(name);
  		System.out.println("This is novel");
		System.out.println("This is a novel type of book");
	}
	
	public static void main(String []args){
		Novel harryPotter = new Novel("Harry","Potter");
	}

}
