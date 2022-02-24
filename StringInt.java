
public class StringInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String passcount="33";
		String failcount= "50";
		
		int totalcount=(Integer.parseInt(passcount)+Integer.parseInt(failcount));
		
		float percentage= ((float)Integer.parseInt(passcount)/totalcount)*100;

		
		System.out.println(percentage);
		
		

	}

}
