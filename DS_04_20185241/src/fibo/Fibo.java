package fibo;

public class Fibo {
	public static final int MAX_N = 10;
	public static void main(String[] args) {
		for(int i = 0; i <= MAX_N; i++)
			System.out.println(fib(i));
		
		System.out.println("------------------------------");
		
		for(int i = 0; i <= MAX_N; i++)
			System.out.println(fibIter(i));
	}
	
	public static long fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	public static int fibIter(int n) {
		int sum, a1, a2;
		
		a1=0;
		a2=1;
		sum=0;
		
		if(n==0)
			sum=0;
		else if(n==1)
			sum=1;
		else {
			for(int i=2; i<=n; i++) {
				sum=a1+a2;
				a1=a2;
				a2=sum;
			}
		}
		return sum;
		}
	}

