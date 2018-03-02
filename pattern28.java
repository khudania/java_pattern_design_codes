class pattern28{
	public static void main(String args[]){
		int flag, k=0,p;
		for(int i=1; i<=5; i++){
			if(i%2==1) k=k+1;
			else{
				k--;
				k=k+i;
			}
			flag=1;
			p = k;
			for(int j=1; j<=9; j++){
				if(j<=2*i-1){
					if(flag==1){
						System.out.print(p);
						if(i%2==1){
							p++;
							k++;
						}
						else p--;
					}
					else
						System.out.print("*");
					flag = 1-flag;
				}
					
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
	}
		
}