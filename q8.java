
public class q8 {
	public static int missing(int arr[],int a, int b) {
	    if(a>=arr.length) {
	      return arr[a-1]+1;
	    }
	    if(arr[a]<1) {
	      return missing(arr, a+1,b);
	    }
	    if(arr[a]!=b) {
	     
	      return b;
	    }
	    return missing(arr,a+1,b+1);
	  }
	  public static void main(String[] args){
		  System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
			System.out.println("----------------------------------------------");
		  int arr[] = {-3,-2,-1,0,2,3,4};
			int a = 0;
			int b = missing(arr,a, 1);
			System.out.println("missing number is " + b);
	    
	                          
	  }

}
