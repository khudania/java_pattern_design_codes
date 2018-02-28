class pattern15{
	public static void main(String args[]){
		int k=0, num;
		for(int i=1; i<=9; i++){
			if(i < 6) k++;
			else k--;
			num = 1;
			for(int j=1; j<=5; j++){
				if(j>=6-k){
					System.out.print(num);
					num++;
				}
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
		
}