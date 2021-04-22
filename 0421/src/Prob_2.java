import java.util.Scanner;

public class Prob_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1000 이하의 자연수를 입력하세요.");
		int a,sum=0;
		a =scan.nextInt();
		
		int i=0;
		
		while(i<=a) {
			if(i%4==0) {
				sum=sum+i;
				System.out.println(i);
				
			}
			i++;
		}
		System.out.println("1~"+a+"까지 4의 배수의 합은 "+sum+"입니다.");

	}

}
