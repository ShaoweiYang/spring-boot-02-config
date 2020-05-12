package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atguigu.service.HelloService;
import org.springframework.context.annotation.ImportResource;

/**
 * @Configuration 指明当前类是一个配置类（其实用@Component 是一样的），就是用来代替之前的Spring配置文件的
 * 
 * 在配置文件中是用bean标签添加组件的
 * 测试444.
 *
 */
//@ImportResource(locations = {"classpath:beans.xml"})
//@Component
@Configuration
public class MyAppConfig {

	//将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
	@Bean
	public HelloService helloService2() {
		System.out.println("@Bean 给容器添加组件：helloService2");
		return new HelloService();
	}
	
}
