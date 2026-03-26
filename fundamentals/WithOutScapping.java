package fundamentals; 
public class WithOutScapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		System.out.println("before swapping two numbers :");
		System.out.println("a = "+ a +"  b  is :" +b);
	
//	    a = a^b;}===} X                          
//	    b = a^b;}===} O   
//	    a = a^b;}===} R
		
		 a = a+b;
		 b = a-b;
		 a = a-b;
	    
//	    a = a+b;  100 = 100+300 = 300 
//	    b = a-b;  200 = 300-200 = 100==> b
//	    a = a-b;  300 = 300-100 = 200==> a
	    
	    System.out.println("after swapping two numbers :");
		System.out.println("a ="+ a +" b  is :" +b);
}
}