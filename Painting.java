// Painting subclass extends Gallery
public class Painting extends Gallery {
//instance variable
private String material;
  
public Painting() {
    super(); 
    this.material = "Not Stated";
    }
 public Painting(String name, boolean isAvailable, int age, double price, String material) {
   super(name, isAvailable, age, price); 
     this.material = material;
    }

  
 public String getMaterial() {
        return material;
    }

 public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return super.toString() +
        "\nMaterial: " + getMaterial();
    }
}
