package basics;

public class Example_findduplicatesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n[]= {12,39,30,23,12,40,23,39,44};
   int even=0;
   int odd=0;
   for(int i=0; i<n.length;i++) {
	   if (n[i]%2==0) {
		   even++;
		   
	   }
	   else {
		   odd++;
		   
	   }
	   System.out.println("even");
	   System.out.println("odd");
	   
   }
	}

}
