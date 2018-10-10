public class PositiveNegativeInt {
    public static void main (String [] args) {
        
        //Generate two random positive integer numbers between 45 and 90
        int n1 = (int) (Math.random() * 46 + 45);
        int n2 = (int) (Math.random() * 46 + 45);
        
        //output a positive value(note, ANY positive value) if n1>n2
        //output zero if n1 == n2
        //output a negative value(note, Any negative value) if n1<n2
        
        System.out.println(n1 - n2);
        
        /* Alternatively
         * 
         * if(n1 == n2) {
         *     System.out.println(0);
         *     } else if(n1 > n2) {
         *         System.out.println(+1);
         *         }else {
         *             System.out.println(-1);
         *             }
         */
        
        /* Alternatively
           
         * System.out.println((int)(Math.signum(n1 - n2)));
         * 
           */
    }
}
