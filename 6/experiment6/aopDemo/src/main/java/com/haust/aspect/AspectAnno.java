package com.haust.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAnno {
    @Before("AspectAnno.pointcut1()")
    public void before(){
        System.out.println("前置通知===========");
    }

    @AfterReturning("AspectAnno.pointcut2()")
    public void afterReturning(){
        System.out.println("后置通知===========");
    }

    @Around("AspectAnno.pointcut3()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕前通知==========");
        Object obj = joinPoint.proceed();
        System.out.println("环绕后通知==========");
        return obj;
    }

    @AfterThrowing("AspectAnno.pointcut4()")
    public void afterThrowing(){
        System.out.println("异常抛出通知========");
    }

    @After("AspectAnno.pointcut4()")
    public void after(){
        System.out.println("最终通知==========");
    }

    @Pointcut("execution(* com.haust.dao.impl.ProductDaoImpl.save(..))")
    private void pointcut1(){}
    @Pointcut("execution(* com.haust.dao.impl.ProductDaoImpl.update(..))")
    private void pointcut2(){}
    @Pointcut("execution(* com.haust.dao.impl.ProductDaoImpl.delete(..))")
    private void pointcut3(){}
    @Pointcut("execution(* com.haust.dao.impl.ProductDaoImpl.find(..))")
    private void pointcut4(){}
}
