package aop;

import java.lang.reflect.Method;

public interface Advice {
    Object invoke(Object target, Method method, Object[] arg)throws Exception;
}
