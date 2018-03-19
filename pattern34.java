import java.util.Scanner;

class pattern34{
	public static void main(String args[]){
		
		int rows, p, k=1;
		System.out.print("Enter Number Of Rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++){
			p=k;
			for(int j=1; j<=i; j++){
			
				System.out.print(p + " ");
				p=p-(rows-i+j);
			}	
			System.out.print("\n");
			k=k+1+rows-i;
		}
	}
		
}