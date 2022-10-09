package be.cocoding.training.spring.lifecycle;

public class ProgrammaticLifecycleBean {

    public void init(){
        System.out.println("Programmatic Bean - Initialization");
    }

    public void destroy(){
        System.out.println("Programmatic Bean - Destruction");
    }
}
