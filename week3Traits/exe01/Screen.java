package week3Traits.exe01;

public class Screen {

    public String printName(Customer customer){

        String customerName = customer.getName();
        String customerCategory = customer.getCategory();
       // String businessClass = "Business";

        if (customerCategory.equalsIgnoreCase("Business")){
            return customerName.toUpperCase();
        }else{
            return customerName.toLowerCase();
        }

    }

    /*
    public String displayCustomerName(Costumer costumer){

        String name="This seat is empty";
         if(costumer.getCategory().isEmpty() ||costumer.getName().isEmpty() ){
             name="";
        }
         if(costumer.getCategory().equalsIgnoreCase("Business")){
              name=costumer.getName().toUpperCase();
        }
         if(costumer.getCategory().equalsIgnoreCase("Economy")){
              name=costumer.getName().toLowerCase();
        }
         System.out.println(name);
        return name;
    }

     */



}


// A Screen can display a customer name according to the railway rules,
// and it also returns the name it displayed so that it can be tested afterwards.

// They want those names of the business class to be displayed in capital letters and
// those in economic class to be displayed in small letters.