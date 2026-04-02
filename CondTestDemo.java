public class CondTestDemo {
    public static void main(String[] args) {

      int score = 74; 
      String grade; 

      double gpaPoints;   

      if (score >= 90) {     
        grade     = "A";     
        gpaPoints = 4.0; 
      } else if (score >= 80) {     
        grade     = "B+";     
        gpaPoints = 3.5; 
      } else if (score >= 70) {     
        grade     = "B";     
        gpaPoints = 3.0; 
      } else if (score >= 60) {     
        grade     = "C+"; 
        gpaPoints = 2.5; 
      } else {     
        grade     = "F";     
        gpaPoints = 0.0; 
      } 
    } 
    System.out.printf("Score: %d  |  Grade: %s  |  GPA Points: %.1f%n", score, grade, gpaPoints);

  } 

