package com.zhangguo.Spring052.aop03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("aop03.xml");
		IMath math = ctx.getBean("math", Math.class);
		int n1 = 100, n2 = 5;
		math.add(n1, n2);
		math.sub(n1, n2);
		math.mut(n1, n2);
		math.div(n1, n2);
		StrUtil strUtil=ctx.getBean("strUtil",StrUtil.class);
		strUtil.show();
	}

}
