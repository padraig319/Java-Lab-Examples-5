public class PropertyValueStampDuty {
    public static void main (String [] args) {
        
        double propertyValue = Math.random() * 400001 + 100000;
        double rate = 0.0, stampDuty = 0.0;
        
        //assume that is the value of a property and 
        //calculate the Stamp Duty payable on the property 
        
        if(propertyValue <= 100000.0) {
            rate = 0.02;
        }else if(propertyValue < 150000.0) {
            rate = 0.05;
        }else if(propertyValue < 200000.0) {
            rate = 0.075;
        }else if(propertyValue < 250000.0) {
            rate = 0.10;
        }else {
            rate = 0.125;
        }
        
        //output the results
        System.out.print("A property valued at ");
        System.out.print(propertyValue);
        System.out.print(" attracts stamp duty of ");
        System.out.println(propertyValue * rate);
        
    }
}