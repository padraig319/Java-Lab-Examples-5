public class MathRandomIfElse {
    public static void main (String [] args) {
        
        int n = (int) (Math.random() * 61);
        
        if (n>10) {
            n = n / 4;
        } else {
            n = n + 17;
        }
        if (n * 2 < 31) {
            n = n + 8;
        }
        
        System.out.println(n);
    }
}