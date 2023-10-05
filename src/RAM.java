public class RAM {
    public String ram;
    public String model;
    public String brand;
    public String speed;
    public Double price;

    public String getFullName() {
        return brand + " " + model + " " + ram + " " + speed + " " + price;
    }

    public String getRam() {
        return ram;
    }

    public String getSpeed() {
        return speed;
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
