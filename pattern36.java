class pattern36{
	public static void main(String args[]){
		int k;
		for(int i=1; i<=5; i++){
			k=0;
			for(int j=1; j<=5; j++){
				if(j<=i){
					System.out.print(k+" ");
					k=k+i-1;
				}
					
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
	}
		
}