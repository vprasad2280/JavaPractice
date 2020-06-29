package ImpPrograms;

public class StarPattern2 {

	public static void main(String[] args) {
		/* Program to print below star pattern

		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 */

		for (int i=0;i<5;i++) 
		{
			for(int j=0;j<i;j++) {
				System.out.print("*");

			}
			System.out.println();}


		for (int i=0;i<5;i++) 
		{
			for(int j=5;j>i;j--) {
				System.out.print("*");

			}
			System.out.println();}


	}

}
