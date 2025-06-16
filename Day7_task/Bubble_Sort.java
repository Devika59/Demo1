package add_DSA;

import java.util.Arrays;

public class Bubble_Sort {
	public static void Bubblesort( int []sample) {
		System.out.println(Arrays.toString(sample));
		for (int i=1;i<sample.length;i++) {
			
			for(int j=0;j<sample.length-i;j++) {
				
				if(sample[j]>sample[j+1]) {
					
					int temp=sample[j];
					sample[j]=sample[j+1];
					sample[j+1]=temp;
				}		
			}	
			}
		}
		public static void main(String[]args) {
			                                                       
		}                                                                  
                                     

} 
