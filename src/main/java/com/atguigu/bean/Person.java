package com.atguigu.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 将配置文件中每个属性的值映射到这个组件中
 * 
 * @ConfigurationProperties 告诉spring boot 将本类中所有属性和配置文件中所有属性相关的配置进行绑定 prefix =
 *                          "person"：配置文件中哪个下面的所有属性进行一一映射
 * @ConfigurationProperties(prefix = "person") 默认从全局配置文件中获取值
 * 
 *                                 只有这个组件是容器中的组件，才能提供@ConfigurationProperties
 *                                 的所有功能
 *
 */
@Component("per")
//@PropertySource(value = "classpath:person.properties")
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
	/**
	 * <bean id="per" class="com.atguigu.bean.Person">
	 * <properties name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEl}" />
	 * </bean>
	 */
	@Value("${person.lastName}")
	// lastName 必须是邮件格式
//	@Email
	private String lastName;

//	@Value("#{11*5}")
	private Integer age;

//	@Value("true")
	private Boolean boss;
	private Date date;

//	@Value("${person.map}")
	private Map<String, Object> map;
	private List<Object> list;
	private Dog dog;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", boss=" + boss + ", date=" + date + ", map=" + map
				+ ", list=" + list + ", dog=" + dog + "]";
	}
}
