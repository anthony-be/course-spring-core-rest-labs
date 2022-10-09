package be.cocoding.training.spring.lifecycle;

public class AnnotationLifecycleBean {

    public void init(){
        System.out.println("Annotation Bean - Initialization");
    }

    public void destroy(){
        System.out.println("Annotation Bean - Destruction");
    }
}
