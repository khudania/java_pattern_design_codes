import java.util.Scanner;

class pattern35{
	public static void main(String args[]){
		
		int rows, flag=1;
		System.out.print("Enter Number Of Rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1, k=0; i<=2*rows-1; i++){
			if(i<rows-k)
				System.out.print(" ");
			else{
				if(flag==1)
					System.out.print("*");
				else
					System.out.print(" ");
				flag=1-flag;
			}
			if(i==rows+k){
				k++;
				System.out.print("\n");
				if(i==2*rows-1)
					break;
				i=0;
				flag=1;
			}
		}
	}
		
}