//subclass #2
public class Debut extends Train{
  private String stageName;
  private int numberOfFans;
  private String typeOfGroup;
  private String position; 

   

  //default constructor 
  public Debut(){
    super.setSingingScore(7);
    super.setRapScore(7);
    super.setDanceScore(7);
    stageName = "N/A";
    typeOfGroup = "N/A";
    numberOfFans = 0; 
  }

  //overridden constructor
  public Debut(String name, int singingScore, int rapScore, int danceScore, String position){
    super(name, singingScore, rapScore, danceScore); 
    stageName = "N/A";
    typeOfGroup = "N/A";
    this.position = position; 
  }

  //getter methods
  public int getNumberOfFans(){
      return numberOfFans;
  }

  public String getStageName(){
      return stageName;
  }

  //toString method to get the position (overiding the "name toString method in the Audition class")
  public String toString()
  {
      return super.getPosition();
  }

  //checking if two trainees have the same position (overiding the equals method in the Audition class)
  public static boolean equals(Debut onePerson, Debut otherPerson)
  {
      // Check if both names of trainees are equal
      return onePerson.typeOfGroup.equals(otherPerson.typeOfGroup);
  }

  //overridden method from Train class
  public String switchPosition(Debut Person){
   if (super.getSingingScore() > 8 && super.getSingingScore() > 8 && super.getSingingScore() > 8) {
      int random = (int)(Math.random() * 2 + 1);
      if (random == 0){
        Person.position = "Leader";
        Person.typeOfGroup = "Band";
        return super.toString() + " is now in a " +  Person.typeOfGroup; 
      }
      if (random == 1){
        Person.position = "All";
        Person.typeOfGroup = "Soloist";
        return super.toString() + " is now a " +  Person.typeOfGroup; 
      }
   }
   return "done";
  }

  //original method #1 for Debut
  public static int goOnTour(Debut Person, int weeks){
    for (int i = 0; i < weeks; i++){
      Person.numberOfFans = Person.numberOfFans + 1000; 
    }
    return 0; 
  }
 
  //original method #2 for Debut
  public static String giveStageName(Debut Person, String name){
    String phrase = name;
    if (name.length() > 5){
      Person.stageName = "" + phrase.charAt(0); 
      return "Stage Name Given.";
    }
    else {
      Person.stageName = phrase; 
      return "Stage Name Given.";
    }
  }
  
} 
