package be.cocoding.training.spring.lifecycle;

public class XmlLifecycleBean {

    public void init(){
        System.out.println("XML Bean - Initialization");
    }

    public void destroy(){
        System.out.println("XML Bean - Destruction");
    }
}
