import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int max=0;
		int num=0;
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<5; i++){
			System.out.println(i+1+"번 입력:");
			arr[i]=sc.nextInt();
			if(max<arr[i]){
				max=arr[i];
				num=i+1;
			}
		}
		System.out.println("가장 큰수"+num+"번째 숫자"+max);
		

	}

}
