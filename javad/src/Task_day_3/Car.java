package Task_day_3;

public class Car {
    public static void main(String[] args) {
        String brand = "Toyota";
         String model = "Corolla";
         String color = "Black";
         String serialCode="724781278B"; //Seria kodu
         String registrationNumber = "90-BF-990";
         int year = 2020;   // Buraxilis ili
         long weight = 1220; // kutle (kilogram) netto
         long priceCENT = 2_230_000L;    //  Qiymet (cent)
         float mileage = 8.5f;   // Mil bashina dushen yanacaq miqdari (yandirdighi)
         char fuelType = 'D';   // Yanacaq tipi
        //--------------------------------------------//
        System.out.println("Brand:"+ brand);
        System.out.println("Model :"+ model);
        System.out.println("Color :"+color);
        System.out.println("Serial code :"+serialCode);
        System.out.println("Registration Number :"+registrationNumber);
        System.out.println("Production year :" + year);
        System.out.println("Car weight :"+weight);
        System.out.println("Price :"+ priceCENT);
        System.out.println("Car mileage :"+ mileage);
        System.out.println("Fuel type :"+fuelType);

    }

}