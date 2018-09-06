package WebService.springweb;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

      jc.getaddressList();
      jc.getaddressSet();
      jc.getaddressMap();
      jc.getaddressProp();
   }
   
}

