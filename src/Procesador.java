// Esta clase está guardada localmente.
public class Procesador {
    //Estados, Atributos, Propiedades
    public String brand;
    public String model;
    public Double price;

    //Comportamiento o método (funciones)

    public String getFullName() {
        //Concatenado resulta en "AMD 5000110.5" sin espacios a menos que se concatenen estos con " "
        return brand + " " + model + " " + price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getPrice() {
        return price + "€";
    }
}
