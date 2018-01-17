package com.zhangguo.Spring052.aop09;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 通知类，横切逻辑
 *
 */
@Component
@Aspect
public class Advices {
	
	@Pointcut("execution(* com.zhangguo.Spring052.aop09.Math.a*(..))")
	public void pointcut(){
	}
	
	@Before("pointcut()")
	public void before(JoinPoint jp){
		System.out.println("----------前置通知----------");
		System.out.println(jp.getSignature().getName());
	}
	
	@After("pointcut()")
	public void after(JoinPoint jp){
		System.out.println("----------最终通知----------");
		System.out.println(jp.getSignature().getName());
	}
	
	//环绕通知
	@Around("pointcut()")
    public Object around(ProceedingJoinPoint pjd) throws Throwable{
        System.out.println("--------------------环绕开始--------------------");
		System.out.println(pjd.getSignature().getName());
        Object object=pjd.proceed();
        System.out.println("--------------------环绕结束--------------------");
        return object;
    }
    //异常后通知
	@AfterThrowing(pointcut="pointcut()",throwing="exp")
    public void afterThrowing(JoinPoint jp,Exception exp)
    {
		System.out.println(jp.getSignature().getName());
        System.out.println("--------------------异常后通知，发生了异常："+exp.getMessage()+"--------------------");
    }
    //返回结果后通知
	@AfterReturning(pointcut="pointcut()",returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result)
    {
        System.out.println("--------------------返回结果后通知--------------------");
        System.out.println("结果是："+result);
    }
	/*
	引入（Introduction）
	引入允许我们向现有的类添加新方法或属性，通过通知类，从而可以在无需修改现有的类的情况下，让它们具有新的行为和状态。
	参见<aop:declare-parents>元素的使用，引入新的接口行为。
	*/
}
