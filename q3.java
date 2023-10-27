
public class q3 {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n * factorial(n-1) ;
		
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int n = 5;
		int a = factorial(n);
		System.out.println("factorial is "+a);
		
		

	}

}
