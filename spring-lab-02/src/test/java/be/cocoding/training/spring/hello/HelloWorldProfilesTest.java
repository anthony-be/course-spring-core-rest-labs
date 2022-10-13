package be.cocoding.training.spring.hello;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)
@Suite.SuiteClasses({HelloWorldProfilesTest.WithTestProfile.class, HelloWorldProfilesTest.WithoutTestProfile.class})
@Ignore("Need helloWorldProfile bean definition from Lab 2 - Exercice 3")
public class HelloWorldProfilesTest {

    @RunWith(SpringRunner.class)
    @ContextConfiguration("classpath:spring/application-context.xml")
    @ActiveProfiles("test")
    public static class WithTestProfile {

        @Autowired
        private ApplicationContext context;

        @Test
        public void loadContextWithProfileTest(){
            HelloWorld hw = context.getBean("helloWorldProfile", HelloWorld.class);
            assertEquals("Student name for profile test is not valid","TEST", hw.getStudent());
        }
    }

    @RunWith(SpringRunner.class)
    @ContextConfiguration("classpath:spring/application-context.xml")
    @ActiveProfiles("dummy")
    public static class WithoutTestProfile {

        @Autowired
        private ApplicationContext context;

        @Test
        public void loadContextWithProfileTest(){
            HelloWorld hw = context.getBean("helloWorldProfile", HelloWorld.class);
            assertEquals("Student name for profile NOT test is not valid","NON TEST", hw.getStudent());
        }
    }

}
