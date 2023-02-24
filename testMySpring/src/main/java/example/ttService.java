package example;

import annotations.Component;

@Component
public class ttService implements testsinterface{
    @Override
    public void tock() {
        System.out.println("我是测试AOP的第二个接口");
    }
}
