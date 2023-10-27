
public class q4 {
	public static int fibbonaci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1; 
		}
		
		return fibbonaci(n-2) + fibbonaci(n-1);
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int n = 6;
		int a = fibbonaci(n-1) ;
		System.out.println("fibbonaci is "+a);


	}

}