package week3Traits.exe01;

public class ScreenApplication {

    public static void main(String[] args) {

        Customer businessClassCustomer = new Customer("Mahnaz");
        Customer economicClassCustomer = new Customer("Amin");

        businessClassCustomer.setCategory("Business");
        businessClassCustomer.setCategory("Economic");

        Screen screen=new Screen();

        String firstname=screen.printName(businessClassCustomer);
        String secondName=screen.printName(economicClassCustomer);
        System.out.println("The bisiness class customer name is "+firstname);
        System.out.println("The economic class customer name is "+secondName);


    }

}

/*
        Costumer costumerBusiness =new Costumer("Mona Lisa");
        Costumer costumerEconomy =new Costumer("Sara Smith");
        costumerBusiness.setCategory("Business");
        costumerEconomy.setCategory("Economy");
        Screen screen=new Screen();
        screen.displayCustomerName(costumerBusiness);
        screen.displayCustomerName(costumerEconomy);

 */


/*
In the ScreenApplication class main method,
create a business class Customer, an economic class Customer,
a Screen and display them the screen.

 */