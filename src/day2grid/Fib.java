package day2grid;
import java .util.Scanner;
class Fib {
	public static void main(String [] Args){
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int i,a=1,b=1,c=0,t;
		System.out.println("Enter value of t:");
		t=input.nextInt();
		System.out.print(a);
		System.out.print(" "+b);
		for(i=0;i<t-2;i++) {
			c=a+b;
			a=b;
			b=c;
	        System.out.println(" "+c);
		}
		System.out.println();
		System.out.print(t+"th value of series is: "+c);
	}
}
