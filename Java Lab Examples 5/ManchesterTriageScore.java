public class ManchesterTriageScore {
    public static void main (String [] args) {
        
        /*
         * The Manchester Triage Score (MTS) 
         * sets the maximum time within which a patient should be seen by a clinician.
         */
        
        //randomly generates a MTS value in the range 1 to 5 
        int MTS = (int) (Math.random() * 5+1);
        
        
        //outputs the appropriate description and the maximum time associated with it
        if(MTS == 1) {
            System.out.print("Immediate");
        }else if(MTS ==2) {
            System.out.print("Very Urgent");
        }else if (MTS ==3) {
            System.out.print("Urgent");
        }else if(MTS ==4) {
            System.out.print("Standard");
        }else if(MTS ==5) {
            System.out.print("Non-urgent");
        }
        
        System.out.println();
    }
}

    
