public class Torre {
    public String model;
    public String brand;
    public String size;
    public Double price;

    public String getFullName() {
        return size + " " + brand + " " + model + " " + price;
    }

    public String getRam() {
        return size;
    }

    public Double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
