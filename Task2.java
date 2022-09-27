public class Task2 {
    
    static void getSum(double a, double b){
        double sum = a + b;
        System.out.println(sum);
    }
    static void getSumB(int c, int d) {
        int sum = c + d;
        System.out.println(sum);
    }

    static double getSumC(double a, double b){
        return a + b;
    }
    static int getSumD(int c, int d) {
        return c + d;
    }

    public static void main(String[] args) {
        getSum(5.5,6.5);
        getSumB(5,5);
        System.out.println(getSumC(11.5, 12.5));
        System.out.println(getSumD(11, 14));
    }

}
