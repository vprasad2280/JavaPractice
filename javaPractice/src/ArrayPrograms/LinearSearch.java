package ArrayPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		// Linear search from an array
		
		
		int[] arr= {3,6,1,8,9,0,7,11,13,17,3,20,3};
		int item=3;  //number to be searched in an array
		int temp=0;
		int dup=0;
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]==item) {
				System.out.println("The number is found at the index " +i+ " position ");
				temp++;
				dup++;
			}
			
					}
		if (dup>1) {
			System.out.println("Item is exits " +dup+ " times");
		}
		
		if(temp==0) {
			System.out.println("Item is not found the array list");}
		

	}

}
