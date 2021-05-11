//this is the journey of a performance team, where asipiring trainees have to first audition to a company, and then train until they are good enough to debut!

//they have to do the best they can in 3 categories: singing, rap, and, dance!

//Audition is the superclass, Train is the subclass to Audition, and Debut is the subclass to Train 

//tester class 

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    //new arraylist of possible trainees 
    ArrayList<Audition> listOfTrainees = new ArrayList<Audition>();

    //standard objects
    //trainee named "San" of the Audition class 
    Audition san = new Audition("San", 9, 6, 8);

    //trainee named "Jerry" of the Audition class 
    Audition jerry = new Audition("Jerry", 7, 5, 8);

    //create an object "Bobby" of the Train class
    Train bobby = new Train("Bobby", 5, 8, 7, 20);

    //create an object "Winter" of the Train class
    Train winter = new Train("Winter", 7, 8, 9, 50);

    //trainee named "Felix" of the Debut class
    Debut felix = new Debut("Felix", 7, 8, 9, "dancer");

    //cloaking example 
    Audition dk = new Train("dk", 5, 7, 9);

    //cloaking example
    Audition timmy = new Train("Timmy", 9, 5, 4);

    //aliasing example 
    Audition timmy2 = timmy; 

    //cloaking example
    Audition chan = new Debut("Chan", 9, 9, 9, "singer");

    //adding all created objects to array list 
    listOfTrainees.add(san);
    listOfTrainees.add(bobby);
    listOfTrainees.add(dk);
    listOfTrainees.add(timmy);
    listOfTrainees.add(timmy2); 
    listOfTrainees.add(chan);
    listOfTrainees.add(felix);
    listOfTrainees.add(jerry);
    listOfTrainees.add(winter);

    //sample commands to test out the different methods of each class 

    //testing out methods in Audition class
    //get San's singing score
    System.out.println(san.getSingingScore());

    //seeing what category/position San got placed into from the audition
    System.out.println(Audition.auditionStatus(san));

    //get Bobby's rap score
    System.out.println(bobby.getRapScore());

    //check what category/position Bobby got placed into from the audition (Bobby is an object of the Train class)
    System.out.println(Audition.auditionStatus(bobby));

    //checking to see if San & Jerry are the same trainee
    System.out.println(Audition.equals(san, jerry));

    //checking to see if timmy & timmy2 are the same trainee
    System.out.println(Audition.equals(timmy, timmy2));

    //assign San a more specific position 
    System.out.println(Audition.switchPosition(san, "singer"));
    System.out.println("");


    
    //testing out methods in Train class

    //getting bobby's position with the toString overriden command
    System.out.println(bobby.toString());

    //checking if san & bobby have the same position with the overidden equals method 
    System.out.println(Train.equals(san, bobby));
  
    //make Bobby practice Rapping for 2 hours to improve his score
    bobby.practiceMore("Rapping", 2);

    //get Bobby's new rap score
    System.out.println(bobby.getRapScore());
    
    //get the number of hours bobby has practiced in total (this is his initial 20 + 2 more he just did)
    System.out.println(bobby.gethoursPracticed());

    //get Bobby's stamina after practicing 
    System.out.println(bobby.getStamina());

    //Bobby recharges his stamina 
    bobby.recharge(2);

    //get Bobby's new stamina (should be increased back up to 10)
    System.out.println(bobby.getStamina());
    System.out.println("");

    
    //testing out sample methods in Debut class

    //give felix a stage name
    System.out.println(Debut.giveStageName(felix, "felix")); 

    //get Felix's stage name 
    System.out.println(felix.getStageName()); 

    //Felix goes on tour (increases number of fans)
    System.out.println(Debut.goOnTour(felix, 5));

    //get the number of fans Felix has 
    System.out.println(felix.getNumberOfFans());   
  }
} 
