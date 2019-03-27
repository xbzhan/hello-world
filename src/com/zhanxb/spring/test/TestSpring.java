package com.zhanxb.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.zhanxb.spring.entity.Person;

public class TestSpring {
	@Test
	public void testSayHello(){
		Resource s=new FileSystemResource("src/helloMessage.xml");
		BeanFactory bf=new XmlBeanFactory(s);
		Person p=(Person) bf.getBean("person");
		String str=p.sayHello();
		System.out.println(str);
	}
}
