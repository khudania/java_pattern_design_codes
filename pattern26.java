class pattern26{
	public static void main(String args[]){
		for(int i=1; i<=4; i++){
			int k=64+i;
			for(int j=1; j<=4; j++){
				if(j<=i){
					System.out.print((char)k--);
				}
					
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
	}
		
}