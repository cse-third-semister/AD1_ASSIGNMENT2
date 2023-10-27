
public class q2 {
	public static int maxarray(int arr[],int max,int a) {
		if(a>=arr.length) {
			return max;
		}
		if(arr[a] > max) {
			return maxarray(arr,arr[a],a+1);
		}
		return maxarray(arr,max,a+1);
		
		
		
		
		
	}
	public static int minarray(int arr[],int min,int a) {
		if(a>=arr.length) {
			return min;
		}
		if(arr[a] < min) {
			return minarray(arr,arr[a],a+1);
		}
		return minarray(arr,min,a+1);
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {5,6,89,1,4,7};
		int a = maxarray(arr,Integer.MIN_VALUE,0);
		int b = minarray(arr,Integer.MAX_VALUE,0);
		System.out.println("max is "  + a + " and min is " + b);
	

	}

}
