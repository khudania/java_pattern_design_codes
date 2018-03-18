import java.util.Scanner;

class pattern31{
	public static void main(String args[]){
		
		int rows, num, k;
		char alpha;
		System.out.print("Enter Number Of Rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++){
			k=1;
			num=1;
			alpha='A';
			for(int j=1; j<=2*rows-1; j++){
				if(j>=rows+1-i && j<=rows-1+i){
					if(k==1){
						if(i%2==1)
							System.out.print(num++);
						else
							System.out.print(alpha++);
					}
					else
						System.out.print(" ");
					k=1-k;
				}
					
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
	}
		
}