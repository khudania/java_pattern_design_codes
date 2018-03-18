import java.util.Scanner;

class pattern32{
	public static void main(String args[]){
		
		int rows;
		System.out.print("Enter Number Of Rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=rows; j++){
				if(j==i || j==rows+1-i){
					System.out.print("*");
				}
					
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
	}
		
}