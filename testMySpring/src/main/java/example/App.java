package example;

import custom_Exception.BeanNotFoundException;
import package_scan.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws BeanNotFoundException {

        ApplicationContext Context = new ApplicationContext(AppConfig.class);
        xxxss ss = (xxxss) Context.getBean("xxxss");
        ss.xxx();
//
        userinterface user = (userinterface) Context.getBean("userService");
        user.xxx();

        testsinterface test  = (testsinterface) Context.getBean("ttService");
        test.tock();

    }
}
