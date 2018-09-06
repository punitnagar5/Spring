package WebService.springweb;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class initHelloWorld implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean,  String beanName) throws BeansException{
		System.out.println("bean name"+beanName);
		return bean;
	}
	 
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("bean Name" +beanName);
		return bean;
	}
}
