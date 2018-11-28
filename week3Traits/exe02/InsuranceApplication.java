package week3Traits.exe02;

import week3Traits.exe01.Customer;

public class InsuranceApplication {

    public static void main(String[] args) {

        Customer costumer1=new Customer("Mr. John Smith");
        Customer costumer2=new Customer("Ms. Ann Smith ");
        Customer costumer3=new Customer("Mr. John Hokopoko ");
        Customer costumer4=new Customer("John Smith ");

        TemplateChooser templateChooser=new TemplateChooser();

        String template1=templateChooser.chooseTemplate(costumer1);
        String template2=templateChooser.chooseTemplate(costumer2);
        String template3=templateChooser.chooseTemplate(costumer3);
        String template4=templateChooser.chooseTemplate(costumer4);

        System.out.println(template1);
        System.out.println(template2);
        System.out.println(template3);
        System.out.println(template4);
    }
}
