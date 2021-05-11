//subclass
public class Train extends Audition{

  //new instance variables for the Train class

  //category that is practiced
  private String categoryPracticed; 

  //total hours practiced
  private int hoursPracticed; 

  //stamina
  private int stamina;

  //default constructor
  public Train(){
    super.setSingingScore(7);
    super.setRapScore(7);
    super.setDanceScore(7);
    hoursPracticed = 0;
    stamina = 10;
  }

  //overloaded constructor
  public Train(String name, int singingScore, int rapScore, int danceScore){
    super(name, singingScore, rapScore, danceScore); 
    hoursPracticed = 0;
    stamina = 10;
  }

  //overloaded constructor
  public Train(String name, int singingScore, int rapScore, int danceScore, int hoursPracticed){
    super(name, singingScore, rapScore, danceScore); 
    this.hoursPracticed = hoursPracticed;
    stamina = 10;
  }

  //get the total amount of hours practiced 
  public int gethoursPracticed(){
      return hoursPracticed;
  }

  //get the current stamina level
  public int getStamina(){
      return stamina;
  }

  //toString method to get the position (overiding the "name toString method in the Audition class")
  public String toString()
  {
      return super.getPosition();
  }

  //checking if two trainees have the same position (overiding the equals method in the Audition class)
  public static boolean equals(Train onePerson, Train otherPerson)
  {
      // Check if both names of trainees are equal
      return onePerson.position.equals(otherPerson.position);
  }

  //original method #1 for Train 
  public void practiceMore(String categoryPracticed, int hours){
    if (categoryPracticed == "Singing" && super.getSingingScore() <= 10){
      for (int i = 1; i <= hours; i++){
        super.setSingingScore(super.getSingingScore() + hours/i);
        stamina = stamina - 1;
      }
    }

    if (categoryPracticed == "Rapping" && super.getRapScore() <= 10){
      for (int i = 1; i <= hours; i++){
        super.setRapScore(super.getRapScore() + hours/i);
        stamina = stamina - 1;
      }
    }

    if (categoryPracticed == "Dance" && super.getDanceScore() <= 10){
      for (int i = 1; i <= hours; i++){
        super.setDanceScore(super.getDanceScore() + hours/i);
        stamina = stamina - 2;
      } 
    }

    hoursPracticed = hoursPracticed + hours;
 }

 //original method #2 for Train
 public void recharge(int hours){
   for (int i = 0; i <= hours; i++){
     stamina = stamina + 1; 
     if (stamina == 10){
       break; 
     }
   }
 }

 //overidden method from Audition superclass
 public String switchPosition(Train Person){
   if (super.getSingingScore() > 7 && super.getSingingScore() > 7 && super.getSingingScore() > 7) {
      Person.position = "Leader";
      return super.toString() + " is now a " +  Person.position; 
   }
   return "done";
 }

}
