package homework;


public class Fibonacci {
	public static void main(String[] args) {
		int num=10;
		int fibo = fibonacci(num);
		System.out.println("fibo of "+ num + " = " + fibo);
	}
	
	//fibo
	public static int fibonacci (int num) {
		int[] fibo = new int[num+1];
		fibo[0]=0;
		fibo[1]=1;
		fibo[2]=1;
		for (int i = 3; i <= num; i++) {
			fibo[i]= fibo[i-1]+fibo[i-2];
			System.out.println("fibo of "+ i+ " la: "+ fibo[i]);
		}
		return fibo[num];
	}
}

