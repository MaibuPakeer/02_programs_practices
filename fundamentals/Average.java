package fundamentals;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] numbers= {1,2,3,4,5};
 double sum=0;
 for(int num : numbers) {
  sum+=num;
 }
 System.out.println("calulate:"+ sum);
 double average = sum/numbers.length;
 System.out.println("the Average is:" + average);
	}

}
