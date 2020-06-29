package StringsDemo;

public class Stringbuilderdemo {

	public static void main(String[] args) {

		//String builder methods are non synchronized and hence performance improvement 

		StringBuilder  sb= new StringBuilder("venkat");
		sb.append(" prasad");
		System.out.println(sb);
		System.out.println(sb.capacity());//Default capacity is 16 in length +length of given string  .

		StringBuffer  sb1= new StringBuffer(1000);
		System.out.println(sb1);
		System.out.println(sb1.capacity());//Default capacity is 16 in length .

		System.out.println(sb.length());
		System.out.println(sb.lastIndexOf("d"));
		System.out.println(sb.substring(3,9));
		System.out.println(sb1.length());
		System.out.println(sb.charAt(4));
		System.out.println(sb.delete(2, 4));//start at 2 and ends at (4-1) position  
		System.out.println(sb.deleteCharAt(4));


	}

}
