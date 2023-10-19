public class Motherboard {
    private Integer id;
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
    public void setId(Integer paramid){
       this.id =paramid;
    }
    public void setbBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model){
        this.model =model;
    }
    public void setPrice(Double price){
        this.price =price;
    }
}
