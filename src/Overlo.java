
public class Overlo {
       public int getSum(int a,int b){
    	      int sum=a+b;
    	      return sum;
            }
       public double getSum(double c,double d){
              double mul=c*d;
              return mul;
             }
       public static void main(String args[]){
    	   Overlo o=new Overlo();
    	      int a=10;
    	      int b=20;
    	      double c=10;
    	      double d=2;
    	   System.out.println(o.getSum(a, b));
    	   System.out.println(o.getSum(c, d));
          }
         }
