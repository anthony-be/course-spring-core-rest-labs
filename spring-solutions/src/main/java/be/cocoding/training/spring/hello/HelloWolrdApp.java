package be.cocoding.training.spring.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWolrdApp {

    public static void main(String[] args) {
        // 1. Créer le container Spring à partir du fichier spring/application-context.xml qui se trouve dans le classpath
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application-context.xml");

        // 2. Récupérer le bean
        Object username = context.getBean("username");

        // 3. Affiche le bean dans la console
        System.out.println(username);
    }
}
