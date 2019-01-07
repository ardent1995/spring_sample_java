import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.indpro.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		CustomerService customerService = new CustomerServiceImpl();
		CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService);
		CustomerService customerService2 = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService2);
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
