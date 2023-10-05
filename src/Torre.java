public class Torre {
        public String size;
        public String model;
        public String brand;
        public Double price;

        public String getFullName() {
            return size + " " + brand + " " + model + " " +  price;
        }

        public String getRam() { return size;}

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
