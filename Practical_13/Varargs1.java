//Amguity......
class Varargs{

	static void fun(int... a){
		System.out.println("int ");
	}

	static void fun(String... c){
		System.out.println("str ");
	}
	public static void main(String [] args){
		fun();
		fun(1,2,3);
		fun('a','b','c');

		
	}

}