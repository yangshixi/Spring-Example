package com.zhangguo.Spring052.aop09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationCfg.class);
		Math math = ctx.getBean("math", Math.class);
		int n1 = 100, n2 = 0;
		math.add(n1, n2);
		math.sub(n1, n2);
		math.mut(n1, n2);
		try{
		math.div(n1, n2);
		}
		catch(Exception exp){
			System.out.println("发生了异常");
		}
	}

}
