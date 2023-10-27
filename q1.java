import java.util.*;
public class q1 {
	public static int sum(int n,int sum) {
		if(n <1) {
			return sum;
		}
		return sum(n-1,sum+n);
		
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		Scanner sc= new Scanner(System.in); 
		System.out.println("enter how many number you want to add"); 
		int n = sc.nextInt();
		int a = sum(n,0);
		System.out.println("sum of all number is " + a);
		
				
		
		

	}

}
