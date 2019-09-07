
public class Overl {
	public int getSum(int a,int b){
		int sum=a+b;
		return sum;
	}
	public double getSum(double c,double d){
		double mul=c*d;
		return mul;
	}
	public static void main(String args[]){
	  int a=10;
	  int b=2;
	  double c=10.2;
	  double d=5.2;
	Overl o=new Overl();
	  System.out.println(o.getSum(a,b));
	  System.out.println(o.getSum(c,d));
	}
	}