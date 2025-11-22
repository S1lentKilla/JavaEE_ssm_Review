package com.haust.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectXml {
    // 前置增强
    public void before(JoinPoint joinPoint){
        System.out.println("前置增强===========");
        System.out.println("目标类是："+joinPoint.getTarget()+",被织入增强处理的目标方法为："+joinPoint.getSignature().getName());
    }

    public void afterReturing(JoinPoint joinPoint,Object obj){
        System.out.println("这是返回通知（方法不出现异常时调用）！"+",被织入增强处理的目标方法为："+joinPoint.getSignature().getName());
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("这是环绕通知的部分");
        Object obj= null;
        try {
            obj = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("这是环绕通知之后的部分");
        return obj;
    }

    public void afterThrowing(Throwable e){
        System.out.println("异常通知！");
    }

    public void after(){
        System.out.println("这是后置通知！");
    }
}
