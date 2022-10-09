package be.cocoding.training.spring.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
public class LifecycleBeanTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void loadContext(){
        assertNotNull(context);
    }
}
