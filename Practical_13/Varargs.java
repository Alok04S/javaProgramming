class Varargs{

	static void fun(int... a){
		System.out.println("int ");
	}

	static void fun(char... c){
		System.out.println("char ");
	}
	public static void main(String [] args){
		fun();		//char
		fun(1,2,3);
		fun('a','b','c');

		
	}

}