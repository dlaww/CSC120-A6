import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /* Methods to update the Hashable everytime we add/remove a title */
    public void addTitle(String title) {
      collection.put(title, true);
      System.out.println(title + " has been added to the collection.");
    }
    public String removeTitle(String title) {
      if (collection.contains(title)) {
        collection.remove(title, true);
      }
      else {
        System.out.println("This book is not available.");
      }
      System.out.println(title + " has been removed from the collection.");
      return title;
    } 

    /* Methods to modify the value of the given key - the title  */
    public void checkOut(String title) {
      if (collection.containsKey(title) && this.isAvailable(title)) {
        collection.replace(title, false);
        System.out.println(title + " has been sucessfully checked out.");
      } else {
        System.out.println(title + " is not available for checkout.");
      }
    }
    
    public void returnBook(String title) {
      collection.replace(title, true);
      System.out.println(title + " has been returned.");
    }

    /* Methods to support browsing the collection */
    public boolean containsTitle(String title) {
      if (collection.contains(title)) {
        System.out.println(title + " is in our collection.");
        return true;
      } else {
        System.out.println(title + " is not in our collection.");
        return false;
      }
    }

    public boolean isAvailable(String title) {
      if (this.collection.get(title)) {
        System.out.println(title + " is available to be checked out.");
        return true;
      } else {
        System.out.println(title + " is not available to be checked out.");
        return false;
      }
    }

    public void printCollection() {
      if (this.collection.isEmpty()) {
        System.out.println("No books to show.");
      } else {
        for (String title:this.collection.keySet()) {
          System.out.println(title);
          if (this.collection.get(title)) {
            System.out.println("Available");
          } else {
            System.out.println("Checked out");
          }
        }
      }
    }

    public static void main(String[] args) {
      Library Neilson = new Library("Neilson", "7 Neilson Drive", 4);
      System.out.println(Neilson);
      Neilson.addTitle("The Lorax");
      Neilson.addTitle("The Hunger Games");
      Neilson.addTitle("all about love");
      Neilson.removeTitle("The Lorax");
      Neilson.containsTitle("The Lorax");
      Neilson.checkOut("The Hunger Games");
      Neilson.isAvailable("The Hunger Games");
      Neilson.checkOut("The Hunger Games");
      Neilson.printCollection();
    }
  
  }