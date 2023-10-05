public class PlacaBase {
    public String brand;
    public String model;
    public Double price;

    public String getFullName() {
        return brand + " " + model + " " + price;
    }

    public String getBase() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }
}
