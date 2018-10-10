public class Grades {
    public static void main (String [] args) {
        
        
        //randomly generate an integer score between 0 and 100
        int score = (int) (Math.random() * 101);
        char grade = ' ';
        
        //determine the appropriate grade 
        if(score >= 80) {
            grade = 'A';
        }else if(score >= 70) {
            grade = 'B';
        }else if(score >= 55) {
            grade = 'C';
        }else if(score >=40) {
            grade = 'D';
        }else {
            grade = 'E';
        }
        
        
        //output corresponding score
        System.out.print("A score of ");
        System.out.print(score);
        System.out.print(" is graded as ");
        System.out.println(grade);
        
    }
}