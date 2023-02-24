package custom_Exception;

public class BeanNotFoundException extends Exception{

    public BeanNotFoundException(String name){
        super(name+"Bean不存在");
    }
}
