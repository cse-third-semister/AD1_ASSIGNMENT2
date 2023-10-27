
public class q5 {
	public static int gcd (int a,int b) {
		if(b==0) {
			return a;
		}
		
		return gcd (b,a%b);
		
		
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int n = 2;
		int d = gcd (16,8);
		System.out.println("gcd is " +d);
	

	}

}
