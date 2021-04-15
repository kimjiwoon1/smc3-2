import java.util.Random;
 
public class Number {
 
    public static void main(String[] args) {
        /**
         * 중복되지 않는
         * Random 수 생성1
         */
        Random rnd = new Random();
        
        rnd.setSeed(System.currentTimeMillis()); // 시드값을 설정하여 생성
 
        for (int i = 0; i < 10; i++) {
            System.out.print(rnd.nextInt(100) + 1 + " ");
        }
        
        /**
         * 중복되지 않는
         * Random 수 생성2
         */
        int randomNum[] = new int[10];
        
        for (int i = 0; i < randomNum.length; i++ ){
            randomNum[i] = (int)(Math.random() * 100 + 1);
            for ( int j = 0; j < i; j++ ){
                if( randomNum[i] == randomNum[j] ){
                    // 같은 수가 존재한다면 다시 랜덤 수 생성
                    i--;
                }
            }
        }
    }
 
}
//1234

