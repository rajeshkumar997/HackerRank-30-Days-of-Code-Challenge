class Student extends Person {
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
     constructor(firstName, lastName, idNumber, scores){
        super(firstName, lastName, idNumber);
        
        this.scores = scores;
    }
   calculate(){
       
       const average = this.scores.reduce((a, b) => a + b, 0) / this.scores.length;
       
       if(average <= 100 && average >= 90){
           return 'O';
       } else if(average < 90 && average >= 80){
           return 'E';
       }else if(average < 80 && average >= 70){
           return 'A';
       }else if(average < 70 && average >= 55){
           return 'P';
       }else if(average < 55 && average >= 40){
           return 'D';
       }else if(average < 40 ){
           return 'T';
       }
   }
    
}
