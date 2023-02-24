package example;


import annotations.Component;
import package_scan.BeanProcessor;


@Component
public class TestBeanProcessor implements BeanProcessor {
    @Override
    public void postProcessBeforeInstantiation(String beanName, Object bean) {
        if (beanName.equals("userService")){
            System.out.println("准备初始化");
        }
    }

    @Override
    public void postProcessAfterInstantiation(String beanName, Object bean) {
        if (beanName.equals("userService")){
            System.out.println("初始化完成");
        }
    }
}




