package week3Traits.exe01;

public class Customer {

    private String name;

    private String category;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}



// A Customer has a name and a category.
// It also has the methods getName and getCategory.