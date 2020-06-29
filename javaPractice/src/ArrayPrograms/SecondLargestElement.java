package ArrayPrograms;

public class SecondLargestElement {

	public static void main(String[] args) {
		// To find max and min value from an array 
		
				int[] arr= {4,3,6,1,8,9,22,7,11,13,17,20};
				int temp;
				
				for(int i=1;i<arr.length;i++) {
					
					for(int j=i+1;j<arr.length;j++) {
					if(arr[i]<arr[j]) {  /// replace '<' to '>' to get second smallest number
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
					}
				
				
				for(int i=0;i<arr.length;i++) 
				{
					System.out.print(arr[i]+" ");
					}
				System.out.println("Second largest value is  :" +arr[1]);
				
			}
	
	
}
