public class Rectangle {
    public static void main (String [] args) {
        
        /*
         * Consider the following: 
         * a rectangular object on a screen with its top left hand corner at the position identified by the values of x and y. 
         * X is the horizontal axis and Y is the vertical axis. 
         * The rectangle has a width w and a height h. 
         * The values are as follows:
         * x = 104
         * y = 256
         * w = 72
         * h = 30
         */
        
        int x = 104;
        int y = 256;
        int w = 72;
        int h = 30;
        
        //randomly generate an integer value between 0 and 800 (inclusive) 
        int x1 = (int) (Math.random()*801);
        
        //assign an integer value between 0 and 600 (inclusive) 
        int y1 = (int) (Math.random()*601);
        
        /*
         * Display the word Inside if position x1,y1 is inside the rectangle. 
         * Display the word  Outside if it is not. 
         */
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);
        
        if( (x1 >= x && x1 <= (x1+w) ) &&
            (y1 >= y && y1 <= (y1+h) )) {
                System.out.println("Inside");
            }else {
                System.out.println("Outside");
            }
        }
    }
    