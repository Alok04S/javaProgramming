class Var{

	static void fun(int... a){
		System.out.print("int ");
	}

	static void fun(char... c){
		System.out.print("char ");
	}
	public static void main(String [] args){
		fun('a','d');

		
	}

}