public class BeaufortScale{
    public static void main (String [] args) {
        
        //simplified version of the Beaufort scale, 
        //which is used to measure wind force
        
        //randomly generates a wind velocity value greater than zero 
        double Velocity = Math.random() * 63;
        
        //outputs the appropriate description 
        if(Velocity < 1.0) {
            System.out.print("Calm");
        } else if(Velocity >= 1.0 && Velocity < 4.0) {
            System.out.print("Light Air");
        }else if(Velocity >= 4.0 && Velocity < 28.0) {
            System.out.print("Breeze");
        }else if(Velocity >= 28.0 && Velocity < 48.0) {
            System.out.print("Gale");
        }else if(Velocity <= 63.0) {
            System.out.print("Storm");
        }
    }
}