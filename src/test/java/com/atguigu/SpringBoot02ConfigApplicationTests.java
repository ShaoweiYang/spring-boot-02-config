package com.atguigu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.atguigu.bean.Person;

/**
 * SpringBoot 单元测试
 * <p>
 * 可以在测试期间很方便的类似编码一样进行自动注入
 */
@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    @Qualifier("per")
    private Person per;

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void testHelloService() {
//		System.out.println(ctx.getBean("helloService2"));
        boolean isExists = ctx.containsBean("helloService2");
        System.out.println(isExists);
    }

    @Test
    void contextLoads() {
        System.out.println(per);
    }

}
