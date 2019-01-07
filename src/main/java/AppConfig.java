import org.springframework.beans.factory.config.PropertyOverrideConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import se.indpro.repository.CustomerRepository;
import se.indpro.repository.HibernateCustomerRepositoryImpl;
import se.indpro.service.CustomerService;
import se.indpro.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"se.indpro"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean(name="customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
////		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
////		customerService.setCustomerRepository(getCustomerRepository());
//		return customerService;
//	}
//	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
