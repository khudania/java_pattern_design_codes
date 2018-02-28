class pattern20{
	public static void main(String args[]){
		
		for(int i=1; i<=4; i++){
			char k= 'A';
			for(int j=1; j<=8; j++){
				if(j>=5-i && j<=4+i){
					if(j<5){ 
						System.out.print(k);
						k++;
					}
					else{
						
						if(j==5) 
							k=1;
						System.out.print((int)k);
						k++;
					}
				}
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
		
}