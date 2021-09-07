package day4;

public class StaticDemo {
		  
		  public void add(int a, int b) {
		    int sum = a + b;
		    System.out.println("Sum: " + sum);
		  }
		  
		  public void add(double x, double y) {
		    double sum = x + y;
		    System.out.println("Sum: " + sum);
		  }
		  public static void main(String[] args) {
		    StaticDemo d = new StaticDemo();
		    d.add(4, 5);
		    d.add(3.2, 5.2);
		    
		  }
		}
