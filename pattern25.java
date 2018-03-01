class pattern25{
	public static void main(String args[]){
		int n=11, m=0, k=1;
		for(int i=1; i<=21; i++){
			if(i<=n) m++;
			else m--;
			k=m-1;
			for(int j=1; j<=21; j++){
				if(j>=n+1-m && j<= n-1+m){
					//if(j<n) k++;
					//else k--;
					
					System.out.print(j<n?k++%10:k--%10);
				}
					
				else
					System.out.print(" ");
			}	
			System.out.print("\n");
		}
	}
		
}