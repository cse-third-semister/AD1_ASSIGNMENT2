import java.util.Scanner;

public class q7 {
	public static int power(int c,int a,int b) {
		if(b==0) {
			return c;
		}
		
		return power(c*a,a,b-1);
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		System.out.println("Enter power");
		int b = sc.nextInt();
		
		
		int d = power(1,a,b);
		System.out.println("power is "+ d);
		
		

	}

}
