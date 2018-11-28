package learningStepByStep.person;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void think(){
        System.out.println("I think, therefor I exist.");
    }

    public void introduce(){
        System.out.println("I'm "+ name);
        System.out.println("I'm "+ age + " years old.");
    }
}
