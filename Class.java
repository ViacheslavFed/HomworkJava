import java.util.Random;

public class Class {
    public static void main(String[] args) {


        int num2 = 0;
        while (num2 < 10) {
            System.out.println(num2);
            num2++;
        }
        Random random = new Random();
        random.nextInt(1, 2);
        int[] num = new int[22];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1,2);
            System.out.println(num2);

        }
    }
}