public class RAM {
    public String ram;
    public String model;
    public String speed;
    public Double price;

    public String getFullName() {
        return model + " " + ram + " " + speed + " " + price;
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

    public String getModel() {
        return model;
    }
}
