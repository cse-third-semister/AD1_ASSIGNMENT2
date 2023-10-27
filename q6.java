
public class q6 {
	public static String toHex(int decimal) {
		  String hex = "";
		  while (decimal > 0) {
		    int remainder = decimal % 16;
		    char hexDigit = (char) ('0' + remainder);
		    if (remainder > 9) {
		      hexDigit = (char) ('A' + remainder - 10);
		    }
		    hex = hexDigit + hex;
		    decimal /= 16;
		  }
		  return hex;
		}
	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int decimal = 256;
		String hexadecimal = toHex(decimal);

		System.out.println("The hexadecimal of 256 is: " + hexadecimal);
	

	}

	

}
