package com.yy.task;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static Logger logger = Logger.getLogger(Test.class);
/* 这里使用main的方法执行*.xml文件 */
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring-task.xml");
    }
}
