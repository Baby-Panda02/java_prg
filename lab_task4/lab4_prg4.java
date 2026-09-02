class MobilePhone {
    String brand;
    String model;
    double price;

    // Default constructor
    MobilePhone() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy constructor
    MobilePhone(MobilePhone phone) {
        this.brand = phone.brand;
        this.model = phone.model;
        this.price = phone.price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

public class lab4_prg4 {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S24", 799.99);

        MobilePhone phone2 = new MobilePhone(phone1);

        System.out.println("Details of new phone:");
        phone2.displayDetails();
    }
}
