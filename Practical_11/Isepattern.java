class IsePattern{

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
			for(int space=0;space<=2*(mid-row);space++){
				System.out.print(" ");
			}	
		//stars(1-5-9)			
			for(int star=1;star<=4*row+1;star++){
				System.out.print("*");
			}
		System.out.println();
		}

	if(size%2==0){
	
	//lower
		for(int row=mid;row>=0;row--){
		//space
			for(int space=0;space<=2*(mid-row);space++){
				System.out.print(" ");
			}	
		//stars		
			for(int star=1;star<=4*row+1;star++){
				System.out.print("*");
			}
		System.out.println();
		}
		
	}

	else{

	//lower
		for(int row=mid-1;row>=0;row--){
		//space
			for(int space=0;space<=2*(mid-row);space++){
				System.out.print(" ");
			}	
		//stars		
			for(int star=1;star<=4*row+1;star++){
				System.out.print("*");
			}
		System.out.println();
		}	
	}
	
	}

public static void main(String[] args){
	int size=5;
	

	pattern(size);	

	}

}