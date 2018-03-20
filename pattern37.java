import java.util.Scanner;

class pattern37{
	public static void main(String args[]){
		
		int rows, k=1;
		System.out.print("Enter Number Of Rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=k; j++){
				
				System.out.print("*");
			}
			k=k+2;			
			System.out.print("\n");
		}
	}
		
}