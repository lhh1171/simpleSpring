package example;

import annotations.Autowired;
import annotations.Component;
import annotations.PostConstruct;
import package_scan.BeanAware;
import package_scan.InitializingBean;

@Component
//@Scope("prototype")
//关于spring bean作用域，基于不同的容器，会有所不同,
//singleton为单例模式，即scope="singleton"的bean，在容器中，只实例化一次。
//prototype即原型模式，调用多少次bean，就实例化多少次。
public class userService implements BeanAware, InitializingBean,userinterface {

    @Autowired
    private testService testService;

    private String BeanName;

    @Override
    public void xxx(){
        System.out.println(testService);
        System.out.println(BeanName);
    }
    @PostConstruct
    public void testPost(){
        System.out.println("hello world");
    }


    @Override
    public void setBeanName(String beanName) {
        this.BeanName = beanName;
    }


    @Override
    public void afterPropertiesSet() {

        System.out.println("我是初始化时候调用的");
        this.BeanName = "xxx";
    }
}
