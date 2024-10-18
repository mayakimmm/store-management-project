// Sulpture subclass extends Gallery
public class Sculpture extends Gallery {
//instance variables
private boolean handCrafted;

public Sculpture() {
    super(); 
    this.handCrafted = false;
    }

public Sculpture(String name, boolean isAvailable, int age, double price, boolean handCrafted) {
    super(name, isAvailable, age, price); 
    this.handCrafted = handCrafted;
    }

public boolean isHandCrafted() {
   return handCrafted;
    }

public void setHandCrafted(boolean handCrafted) {
  this.handCrafted = handCrafted;
    }
//Is it handcrafted?
     public String toString() {
        return super.toString() +
         "\nHand Crafted: " + (isHandCrafted() ? "Yes" : "No") ;
     }
}