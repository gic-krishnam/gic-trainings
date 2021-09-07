package exercise;

public class Q4 {
		public static void main(String[] args) {
     final double IN2CM = 2.54;
			int height = 74, foot, inch;
      double centimeter;
            foot = height / 12;
              inch = height % 12;
              centimeter = height * IN2CM;
              System.out.println("Height of " + foot +
                   " foot " + inch + " in metric is "
                  + centimeter + " cm");
          }
}
