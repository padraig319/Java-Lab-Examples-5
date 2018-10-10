public class DateSuffix {
    public static void main (String [] args) {
        
        //randomly generate an integer value between 1 and 31 
        int day = (int) (Math.random()*31+1);
        
        //display the number followed by a suffix 
        System.out.print(day);
        
        /*
         * If the number ends with the digit 1 the suffix is st, except for 11 which has suffix th 
         * the digit 2 the suffix is nd, except for 12 which has suffix th 
         * the digit 3 the suffix is rd, except for 13 which has suffix th 
         * any other digit the suffix is th

         */
        
        if(day >= 11 && day <=13) {
            System.out.println("th");
        }else if (day%10 == 2) {
            System.out.println("nd");
        }else if(day%10 == 3) {
            System.out.println("rd");
        }else{
            System.out.println("th");
        }
        
        /*
        * For example, 
        * if the random number is 7 the program should display 7th; 
        * if the number is 21 it displays 21st; 
        * if the number is passed 11 it displays 11th; 
        * 13 displays 13th; 23 displays 23rd; 
        * and so on.
        */
        
        /*
         * Alternative
         * switch(day % 10) {
         *     case 1 : System.out.println("st");
         *              break ;
         *     case 1 : System.out.println("nd");
         *              break ;
         *     case 1 : System.out.println("rd");
         *              break ;
         *     default: System.out.println("st");
         *              break ;
         *              }
         *              
         */
        
    }
}
         
