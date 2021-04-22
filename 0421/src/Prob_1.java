import java.util.Scanner;

public class Prob_1 {

		
			public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("첫번째 숫자 : ");
		        int num1 = sc.nextInt();
		        
		        System.out.print("두번째 숫자 : ");
		        int num2 = sc.nextInt();
		        
		        int sum = 0;
		        
		        for(int i = num1; i <= num2; ++i) {
		            sum += i;
		        }
		        
		        System.out.println("첫번째 정수부터 두번째 정수까지의 합은 " + sum + "입니다.");
		    }
		}
		 