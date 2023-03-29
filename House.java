import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /* Methods to update the array list everytime people move in/out
  * @param: 
  */
  /* Updates array list everytime someone moves in */
    public void moveIn(String name) {
      residents.add(name);
    }
    /* Updates array list everytime someone moves out */
    public void moveOut(String name) {
      residents.remove(name);
    }
    /* Tells you if someone is a resident of a house */
    public boolean isResident(String person) {
      if (residents.contains(person)) {
        System.out.println(person + " is a resident of this house.");
        return true;
      } else {
        return false;
      }

    }

  public String toString() {
    String description = super.toString();
    description += ". This house currently has " + this.residents.size() + " residents.";
    description += " This house " ;
    if (this.hasDiningRoom) {
      description += "has a dining room.";
    } else {
      description += "does not have a dining room";
    }
    return description;
  }

  public static void main(String[] args) {
    House ziskind = new House("Ziskind", "1 Henshaw Ave Northampton MA", 3, true);
    System.out.println(ziskind);
    House capen = new House("Capen", "26 Prospect Street Northampton MA", 3, false);
    capen.moveIn("dakota");
    capen.isResident("dakota");
    System.out.println(capen);
  }

}