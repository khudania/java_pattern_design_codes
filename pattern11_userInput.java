import java.util.Scanner;

class pattern11_userInput{
	public static void main(String args[]){
		int k = 0, rows;
		System.out.print("Enter Number Of Rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();

		for(int i=1; i<=rows; i++){
			if(rows%2 == 0){
				if(i<=rows/2) k++;
				if(i> rows/2 + 1) k--;
			}
			else{
				if(i<= (rows + 1)/2) k++;
				else k--;
			}
			
			for(int j=1; j<=(rows+1)/2; j++){
				if(j<=k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}