public class Casting {
    static int a = 257;
    static byte num1 = (byte) a;

    static byte b = 127;
    static int num2 = (int) b;

    static long c = 7644566;
    static short num3 = (short) c;

    static double d = 276.65436876543;
    static float num4 = (float) d;

    static float i = (float) 81.234567;
    static short num5 = (short) i;

    static long f = 32841;
    static float num6 = (float) f;

    static double g = 878.87649633;
    static byte num7 = (byte) g;

    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

    }
}
