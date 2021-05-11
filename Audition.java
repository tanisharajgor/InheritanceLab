//superclass
public class Audition {

  private String name; 
  public String position; 
  private int singingScore; 
  private int rapScore; 
  private int danceScore; 

  //default constuctor 
  public Audition(){
    name = "N/A";
    singingScore = 5; 
    rapScore = 5; 
    danceScore = 5; 
  }

  //overloaded constructor
  public Audition(String name){
    this.name = name;
    singingScore = 5; 
    rapScore = 5; 
    danceScore = 5; 
  }

  //overloaded constructor with all arguments
  public Audition(String name, int sing, int rap, int dance){
    this.name = name; 
    this.singingScore = sing; 
    this.rapScore = rap;
    this.danceScore = dance; 
  }

  //toString method for the name
  public String toString()
  {
      return name;
  }

  //getter methods for integer values (current singing, rap, dance score)
  public int getSingingScore(){
      return singingScore;
  }

  public int getRapScore(){
      return rapScore;
  }

  public int getDanceScore(){
      return rapScore;
  }

  public String getPosition(){
      return position;
  }
 
  //setter methods for the integer values (current singing, rap, dance score)  
  public void setSingingScore(int newSingingScore){
         this.singingScore = newSingingScore;
       
  }

  public void setRapScore(int newRapScore){
         this.rapScore = newRapScore;
       
  }

  public void setDanceScore(int newDanceScore){
         this.danceScore = newDanceScore;   
  }

  //checking if two trainees are the same person
  public static boolean equals(Audition onePerson, Audition otherPerson)
  {
      // Check if both names of trainees are equal
      return onePerson.name.equals(otherPerson.name);
  }

  //if an aspiring trainee wants to audition intitally, this method can be used to check what position they are qualified for 
  public static String auditionStatus(Audition Person){
    if (Person.singingScore > 7){
      Person.position = "Singer";
      return Person.name + " is a " +  Person.position; 
    }
    else if (Person.rapScore > 7){
      Person.position = "Rapper";
      return Person.name + " is a " +  Person.position; 
    }
    else if (Person.danceScore > 7){
      Person.position = "Dancer";
      return Person.name + " is a " +  Person.position; 
    }
    else {
      return "You didn't make it this time, try practicing more and maybe you might!";
    }
  }

  //if one wants to switch a trainee's position, or give them a more specific one, they can use this method 
  public static String switchPosition(Audition Person, String newPosition){
    if (newPosition == "singer"){
      if (Person.singingScore > 8) {
        Person.position = "Main Singer";
        return Person.name + " is now a " +  Person.position; 
      }
      else if (Person.singingScore > 7) {
        Person.position = "Lead Singer";
        return Person.name + " is now a " +  Person.position; 
      }
    }

    if (newPosition == "rapper"){
      if (Person.rapScore > 8) {
        Person.position = "Main Rapper";
        return Person.name + " is now a " +  Person.position; 
      }
      else if (Person.rapScore > 7) {
        Person.position = "Lead Rapper";
        return Person.name + " is now a " +  Person.position; 
      }
    }

    if (newPosition == "dancer"){
      if (Person.danceScore > 8) {
        Person.position = "Main Dancer";
        return Person.name + " is now a " +  Person.position; 
      }
      else if (Person.danceScore > 7) {
        Person.position = "Lead Dancer";
        return Person.name + " is now a " +  Person.position; 
      }
    }
    
    return "switched"; 

    }
    

}
