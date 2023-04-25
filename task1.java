import java.util.Set;
import java.util.HashSet;

public class task1 {
  public static class Laptop {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;
    private double price;

    public Laptop(String brand, String model, int ram, int storage, String os,
        String color, double price) {
      this.brand = brand;
      this.model = model;
      this.ram = ram;
      this.storage = storage;
      this.os = os;
      this.color = color;
      this.price = price;
    }

    public String getBrand() {
      return brand;
    }

    public String getModel() {
      return model;
    }

    public int getRam() {
      return ram;
    }

    public int getStorage() {
      return storage;
    }

    public String getOs() {
      return os;
    }

    public String getColor() {
      return color;
    }

    public double getPrice() {
      return price;
    }
  }

  public static void main(String[] args) {
    Set<Laptop> laptops = new HashSet<>();
    laptops.add(new Laptop("Apple", "MacBook Pro", 16, 512, "macOS", "Silver",
        1999.99));
    laptops.add(new Laptop("Dell", "XPS 13", 8, 256, "Windows 10", "Rose Gold",
        1199.99));
    laptops.add(new Laptop("Lenovo", "ThinkPad X1 Carbon", 16, 1_000, "Windows 10 Pro", "Black", 1899.99));
    laptops.add(new Laptop("Asus", "ZenBook UX425", 16, 512, "Windows 10 Home",
        "Pine Grey", 1399.99));
    for (var laptop : laptops) {
      System.out.println(laptop.getBrand());
    }
  }
}