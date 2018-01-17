package com.zhangguo.Spring052.aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 通知类，横切逻辑
 *
 */
@Component
@Aspect
public class Advices {
	@Before("execution(* com.zhangguo.Spring052.aop03.Math.*(..))")
	public void before(JoinPoint jp){
		System.out.println("----------前置通知----------");
		System.out.println(jp.getSignature().getName());
	}
	
	/*
	//execution切点函数
	//com.zhangguo.Spring052.aop03包下所有类的所有方法被切入
	@After("execution(* com.zhangguo.Spring052.aop03.*.*(..))")
	public void after(JoinPoint jp){
		System.out.println("----------最终通知----------");
	}
	*/
	
	/*
	//within切点函数
	//com.zhangguo.Spring052.aop03包下所有类的所有方法被切入
	@After("within(com.zhangguo.Spring052.aop03.*)")
	public void after(JoinPoint jp){
		System.out.println("----------最终通知----------");
	}
	*/
	
	/*
	//this切点函数
	//实现了IMath接口的代理对象的任意连接点
	@After("this(com.zhangguo.Spring052.aop03.IMath)")
	public void after(JoinPoint jp){
		System.out.println("----------最终通知----------");
	}
	*/
	
	/*
	//args切点函数
	//要求方法有两个int类型的参考才会被织入横切逻辑
	@After("args(int,int)")
	public void after(JoinPoint jp){
		System.out.println("----------最终通知----------");
	}
	*/
	
	//@annotation切点函数
	//要求方法必须被注解com.zhangguo.Spring052.aop03.MyAnno才会被织入横切逻辑
	@After("@annotation(com.zhangguo.Spring052.aop03.MyAnno)")
	public void after(JoinPoint jp){
		System.out.println("----------最终通知----------");
	}
}
