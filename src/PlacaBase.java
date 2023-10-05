public class PlacaBase {
    public String base;
    public String model;
    public Double price;

    public String getFullName() {
        return base + " " + model + " " + price;
    }

    public String getBase() {
        return base;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }
}
