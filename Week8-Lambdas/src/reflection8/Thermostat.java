package reflection8;


import java.util.concurrent.locks.Condition;
import java.util.function.Function;

public class Thermostat {

    private Condition trigger;
    private Function display;

    public Thermostat(Condition trigger, Function display) {
        this.trigger = trigger;
        this.display = display;
    }

    public Condition getTrigger() {
        return trigger;
    }

    public Function getDisplay() {
        return display;
    }

    public String sense (Double tempInCelcius , Function <Double, String> condition){
        String message = condition.apply(tempInCelcius);
        return message ;
    }
}
/*
    private Predicate<Double> trigger;
    private Function<Double, String> display;

    public Thermostat(Predicate<Double> trigger, Function<Double, String> display) {
        this.trigger = trigger;
        this.display = display;
    }

    public String sense(Double temperature) {
        if (trigger.test(temperature)) {
            return "Warning!";
        }
        return display.apply(temperature);
    }
*/
//The Thermostat has a trigger condition and a display function.
// It receives them via constructor, so they can be customized every time a new one is created.