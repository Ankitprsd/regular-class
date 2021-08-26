package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.modal.Unviversity;

public class ClientApp {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("object.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Unviversity university = (Unviversity)factory.getBean("u");
		university.displayDetails();

	}

}
