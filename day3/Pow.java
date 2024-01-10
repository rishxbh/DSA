package day3;

//Given a double x and integer n,
//calculate x raised to power n. Basically Implement pow(x, n).

public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.0;
		int n = 34;
		double ans = myPow(x,n);
	    System.out.println(ans);
	}
	public static double myPow(double x, int m) {
        double temp=x;
           if(m==0)
           return 1;
           temp=myPow(x,m/2);
           if(m%2==0)
           return temp*temp;
           else 
           {
           if(m > 0)
               return x*temp*temp;
           else
               return (temp*temp)/x;
           }
   }

}
