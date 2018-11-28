package startingExercise.exe04;

public class CarShopApplication {
    public static void main(String[] args) {

        Seller seller = new Seller();
        Car car1 = new Car("BMW");
        Car car2 = new Car("VW");
        Car car3 = new Car("Benz");

        seller.describe(car1);
        seller.describe(car2);
        seller.describe(car3);


    }

}
