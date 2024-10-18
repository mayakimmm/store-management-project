public class Gallery {
// instance variables
private String name;
private boolean isAvailable;
private int age;
private double price;
  
// the constructors 
  
public Gallery() {
  this.name = "Unknown";
  this.isAvailable = false;
  this.age = 0;
  this.price = 0.0;
    }  
public Gallery(String name, boolean isAvailable, int age, double price) {
  this.name = name;
  this.isAvailable = isAvailable;
  this.age = age;
  this.price = price;
    }
public String getName() {
   return name;
    }

public boolean isAvailable() {
   return isAvailable;
    }
public int getAge() {
  return age;
    }
public double getPrice() {
  return price;
    }

// Mutator methods
public void setName(String name) {
  this.name = name;
    }

public void setAvailable(boolean isAvailable) {
 this.isAvailable = isAvailable;
    }

public void setAge(int age) {
  this.age = age;
    }

public void setPrice(double price) {
  this.price = price;
    }
// prints a spacer and whether or not it is available
public String toString(){
  return 
    "\n " +
    "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +
    "\n " +
    "\nGallery: " + getName() +
    "\nAge: " + getAge() + " Years" +
    "\nPrice: $" + getPrice() +
    "\nIs Available: " + (isAvailable() ? "Yes" : "No");
        }
}
