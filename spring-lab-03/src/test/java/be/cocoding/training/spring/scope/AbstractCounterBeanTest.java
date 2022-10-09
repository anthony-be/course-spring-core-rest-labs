package be.cocoding.training.spring.scope;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractCounterBeanTest {

    @Test
    public void getInstanceCounter() {
        ClassA ca = new ClassA();

        ClassB cb1 = new ClassB();
        ClassB cb2 = new ClassB();
        ClassB cb3 = new ClassB();
        ClassB cb4 = new ClassB();

        assertEquals(1, ca.getInstanceCounter());
        assertEquals(4, cb2.getInstanceCounter());
    }

    public class ClassA extends AbstractCounterBean {
        public ClassA() {super(); }
    }

    public class ClassB extends AbstractCounterBean {
        public ClassB() {super(); }
    }

}