package trickyproblems;

public class OddlenghtWord {

	public static void main(String[] args) {
		String str1="PROGRAM";
		String[] str2=str1.split("");
//		System.out.println(a/2);
		int n = str2.length*2;
		int k=n-1;
		int z=str2.length;
		for (int i=0;i<str2.length;i++) {
			
			for(int j=0;j <str2.length*2  ;j++)
			{			
				
				if(j<k) {
					System.out.print(" ");
					
				}
				else 	
				{
				
					if(j>=k && j<=k+i)
					{
						System.out.print("*");
					
						
						
					}
					
		
					
			}
			
		}
			k=k-2;
			System.out.println();
	
	
	
	
	
	
	}
	
	
	

}
}
