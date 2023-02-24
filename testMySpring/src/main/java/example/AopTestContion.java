package example;

import annotations.Aspects;
import annotations.Component;
import annotations.Pointcut;
import aop.Advice;

import java.lang.reflect.Method;

@Component
@Aspects
public class AopTestContion implements Advice {
    @Pointcut(ClassPattern = "org.example",methodPattern = ".*Service")
    @Override
    public Object invoke(Object target, Method method, Object[] arg) throws Exception {
        System.out.println("----------------Befor-------------");
        Object o = method.invoke(target,arg);
        System.out.println("----------------After-------------");
        return o;
    }
}
