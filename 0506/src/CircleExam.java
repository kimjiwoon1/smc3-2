import java.util.Scanner;



public class CircleExam {

	final static double ratio = 3.141592;



	public static void func(double input) {

		double result = input * input * ratio;

		System.out.printf("area = %.3f" , result);

	}



	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);



		System.out.print("radius : ");

		double input = in.nextDouble();

		func(input);

	}

}
