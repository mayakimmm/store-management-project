import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
/*
* Instantiating the object and the different subclasses with their types.
*/
  Gallery gal1 = new Gallery();
  Gallery gal2 = new Gallery("Monet", true, 25, 1200);
  Painting gal3 = new Painting();
  Painting gal4 = new Painting("Vangogh", false, 200, 500000, "Oil Pastel");
  Sculpture gal5 = new Sculpture();
  Sculpture gal6 = new Sculpture("Davinci", true, 150, 600000, true);
  
  // prints each gal line, whether its a painting or sculpture

  System.out.println(gal1.toString());
  System.out.println(gal2.toString());
  System.out.println(gal3.toString());
  System.out.println(gal4.toString());
  System.out.println(gal5.toString());
  System.out.println(gal6.toString());

    
    
  }
}