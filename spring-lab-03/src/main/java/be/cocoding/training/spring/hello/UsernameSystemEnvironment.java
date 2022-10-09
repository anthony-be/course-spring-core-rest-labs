package be.cocoding.training.spring.hello;

public class UsernameSystemEnvironment {

    private String username;

    public UsernameSystemEnvironment() {
        initUsername();
    }

    private void initUsername(){
        username = System.getProperty("user.name");
    }

    @Override
    public String toString() {
        return "Your system username is : " + username;
    }
}
