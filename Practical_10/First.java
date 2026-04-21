class Book {
	String bookCategory;
    	Book(String bookCategory) {
                System.out.println("It is book");
	}	
}

class Novel {
	String novelName;
	Novel(String novelName, String bookCategory) {
		this.novelName = novelName;
		System.out.println("It is Novel");
	}

	public static void main(String []args){
		Novel harryPotter = new Novel("Harry","Potter");
	}
}