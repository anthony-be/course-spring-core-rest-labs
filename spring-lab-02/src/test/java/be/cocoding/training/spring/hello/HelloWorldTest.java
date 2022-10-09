package be.cocoding.training.spring.hello;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
public class HelloWorldTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Before
    public void setUp() {
        assertNotNull("Application Context should not be null", applicationContext);
    }

    @Test
    public void sayHello() {
        HelloWorld helloWorld = applicationContext.getBean("helloWorld", HelloWorld.class);
        assertNotNull("No bean 'helloWorld' found", helloWorld);
        helloWorld.sayHello();
    }
}