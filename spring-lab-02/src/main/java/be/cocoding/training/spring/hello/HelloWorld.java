package be.cocoding.training.spring.hello;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HelloWorld {

    @Autowired
    private String student;

    public HelloWorld() {
    }

    public HelloWorld(String student) {
        this.student = student;
    }

    public void sayHello(){
        System.out.println("Hello " + (student==null?"unknown" : student) + ". Welcome in Spring training !" );
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("student", student)
                .toString();
    }
}
