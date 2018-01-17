package com.zhangguo.Spring052.aop09;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ElTest {

	public static void main(String[] args) {
		ExpressionParser elparse=new SpelExpressionParser();
		Expression exp=elparse.parseExpression("'Hello ' + ' World!'");
		System.out.println(exp.getValue());
	}

}
