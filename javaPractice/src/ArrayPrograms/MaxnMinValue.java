package ArrayPrograms;

public class MaxnMinValue {

	public static void main(String[] args) {
		// To find max and min value from an array 
		
		int[] arr= {3,6,1,8,9,22,1,7,11,13,17,20};
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {  /// replace arr[i]<max to get minimum value
				max=arr[i];
			}
		}
		
		System.out.println("maximum value is : "+max);

	}

}
