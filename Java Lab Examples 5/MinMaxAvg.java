public class MinMaxAvg {
    public static void main (String [] args) {
        
        //Declare variables
        int a, b, c, min, max, temp;
        double avg, y;
        
        //Add values to variables (random values)
        a = (int) (Math.random() * 100 + 1);
        b = (int) (Math.random() * 100 + 1);
        c = (int) (Math.random() * 100 + 1);
        
        //Minimum Value: 1
        //Maximum Value: 100
        
        //Assign minimum value
        min = a;
        if(b<min) {
            min = b;
        }
        if(c<min) {
            min = c;
        }
        
        //Alternatively
        //min = Math.min( a, Math.min(b,c));
        //min = Math.min ( Math.min(a,b), c);
        
        //Assign max value
        max = a;
        if(b>max) {
            max = b;
        }
        if(c>max) {
            max =c;
        }
        
        //Alternatively
        //max = Math.max(a, Math.max (b,c));
        //max = Math.max(Math.max(a,b), c);
        
        avg = (a+b+c) / 3.0;
        
        //Alternatively
        //avg = ((double) (a+b+c))/3.0;
        //avg = ((double) (a+b+c))/3;
        //avg = ((double)a +b+c)/3;
        //avg = (a+ (double)b +c)/3;
        //avg = (a +b+ (double)c)/3;
        
        
        //a = smallest of 3 values
        //b = middle of 3 values
        //c = largest of 3 values
        
        if(a>b) {
            temp = a;
            a = b;
            b = temp;
        }
        if(b>c){
            temp = b;
            b = c;
            c = temp;
        }
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }
        
        /*
        a =  middle value
        b = smallest value
        c = largest value
        
        if(a>b) {
            temp = a;
            a = b;
            b = temp;
        }
        if(b>c) {
            temp = b;
            b = c;
            c = temp;
        }
        if(a<b) {
            temp = a;
            a = b;
            b = temp;
        }
        */
        
        
        
        
    }
}
        
