package fundamentals;

public class SwapingThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fno=100;int sno=200;int tno=300;
System.out.println("Before swaping:");
System.out.println("FNO: "+fno+"\t"+"SNO: "+sno+"\t"+"TNO: "+tno+"\t");
int temp=fno;
fno=sno;
sno=tno;
tno=temp;
System.out.println("after swaping:");
System.out.println("FNO: "+fno+"\t"+"SNO: "+sno+"\t"+"TNO: "+tno+"\t");
	}

}
