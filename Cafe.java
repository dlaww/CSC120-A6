/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 100;
        this.nCreams = 50;
        System.out.println("You have built a cafe: ☕");
    }
    
    /* Methods to decrease inventory everytime cup of coffee is sold */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces > size && this.nSugarPackets > nSugarPackets && this.nCreams > nCreams && nCups > 0) {
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets;
            this.nCreams = this.nCreams - nCreams;
            this.nCups = this.nCups - 1;
            System.out.println(size + "oz coffee with " + nSugarPackets + " sugar packets and " + nCreams + " creams has been sold.");
        }
        else {
            if (this.nCoffeeOunces < size || this.nSugarPackets < nSugarPackets || this.nCreams < nCreams || nCups == 0) {
                restock(100, 100, 50, 50);
                System.out.println(this + " Cafe inventory has been restocked.");
                }
            }
        }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets ;
        this.nCreams = nCreams;
        this.nCups = nCups;    
    }

    public static void main(String[] args) {
        Cafe campusCafe = new Cafe("Campus Cafe", "100 Elm Street", 1);
        Cafe compassCafe = new Cafe("Compass Cafe", "7 Neilson Drive", 1);
        campusCafe.sellCoffee(100, 100, 50);
        compassCafe.sellCoffee(40, 10, 10);
        campusCafe.sellCoffee(5, 10, 15);
        
    }
    
}
