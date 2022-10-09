package be.cocoding.training.spring.hello;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
@Ignore("Need helloWorldProfile bean definition from Lab 2 - Exercice 3")
public class HelloWorldProfilesTest {

    @Autowired
    private ApplicationContext context;

    @Test
    @Profile("test")
    public void loadContextWithProfileTest(){
        HelloWorld hw = getHelloWorldProfileBean();
        assertEquals("Student name for profile test is not valid","TEST", hw.getStudent());
    }

    @Test
    @Profile("dummy")
    public void loadContextWithoutProfileTest(){
        HelloWorld hw = getHelloWorldProfileBean();
        assertEquals("Student name for profile NOT test is not valid","NON TEST", hw.getStudent());
    }

    private HelloWorld getHelloWorldProfileBean(){
        return context.getBean("helloWorldProfile", HelloWorld.class);
    }

}
