package week3Traits.exe02;


import week3Traits.exe01.Customer;

public class TemplateChooser {

    public String chooseTemplate(Customer costumer) {

        String name = costumer.getName().trim();

        if (name.contains("Hokopoko")) {
            return "Privileged";
        }
        if (name.startsWith("Mr.")) {
            return "Man";
        }
        if (name.startsWith("Ms.") || name.startsWith("Mrs.")) {
            return "Woman";
        }
        return "Default";
    }
}
