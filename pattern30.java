import java.util.Scanner;

class pattern30{
	public static void main(String args[]){
		
		int rows;
		System.out.print("Enter Number Of Rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=3*rows; i++){
			for(int j=1; j<=2*rows-1; j++){
				if(i<=rows){
					if(j>=2*rows-i)
						System.out.print("*");
					else
						System.out.print(" ");
				}	
				else if(i<=2*rows){
					int k=0;
					if(j==rows){
						k=1;
						System.out.print("|");
					}
					if(j<=(i-rows-1)){
						k=1;
						System.out.print("*");
					}
					if(j>=i){
						k=1;
						System.out.print("*");
					}
					if(k==0)
						System.out.print(" ");
				}
				else if(i<= 3*rows){
					if(j<=3*rows+1-i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
					
			}	
			System.out.print("\n");
		}
	}
		
}