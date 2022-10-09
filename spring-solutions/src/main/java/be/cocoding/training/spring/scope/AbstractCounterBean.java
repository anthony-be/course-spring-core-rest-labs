package be.cocoding.training.spring.scope;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import static java.util.Objects.requireNonNull;

public abstract class AbstractCounterBean implements CountableInstance {

    private static Map<Class, Integer> instanceCounterByClass = new HashMap<>();

    protected AbstractCounterBean(){
        instanceCounterByClass.compute(this.getClass(),
                (key, currentValue) -> currentValue == null ? 1 : currentValue+1);
    }

    @Override
    public int getInstanceCounter() {
        return instanceCounterByClass.getOrDefault(this.getClass(), 0);
    }
}
