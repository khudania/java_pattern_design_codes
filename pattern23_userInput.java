import java.util.Scanner;

class pattern23_userInput{
	public static void main(String args[]){
		
		int rows;
		System.out.print("Enter Number Of Rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++){
			int k=1;
			for(int j=1; j<=rows; j++){
				if(j<=i){
					System.out.print(k);
					k=1-k;
					
				}
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
	}
		
}