import java.util.Random;
 
public class Number {
 
    public static void main(String[] args) {
        /**
         * �ߺ����� �ʴ�
         * Random �� ����1
         */
        Random rnd = new Random();
        
        rnd.setSeed(System.currentTimeMillis()); // �õ尪�� �����Ͽ� ����
 
        for (int i = 0; i < 10; i++) {
            System.out.print(rnd.nextInt(100) + 1 + " ");
        }
        
        /**
         * �ߺ����� �ʴ�
         * Random �� ����2
         */
        int randomNum[] = new int[10];
        
        for (int i = 0; i < randomNum.length; i++ ){
            randomNum[i] = (int)(Math.random() * 100 + 1);
            for ( int j = 0; j < i; j++ ){
                if( randomNum[i] == randomNum[j] ){
                    // ���� ���� �����Ѵٸ� �ٽ� ���� �� ����
                    i--;
                }
            }
        }
    }
 
}

