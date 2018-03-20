import java.util.Scanner;

class pattern38{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=9; j++){
				if(j >= i && j <= 8-i && j%2 == i%2){
					
					System.out.print("*");	
				}
				else{
					
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
		
}