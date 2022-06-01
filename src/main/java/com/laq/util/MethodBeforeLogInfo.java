package com.laq.util;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MethodBeforeLogInfo implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before-method:" + method.getName() + "()");
    }
}
