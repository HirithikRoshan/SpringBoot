// package declaration to organize the code into a specific namespace
package koli.HR;

// importing necessary spring framework classes
import org.springframework.boot.SpringApplication; // class to bootstrap and launch the application
import org.springframework.boot.autoconfigure.SpringBootApplication; // annotation to enable auto-configuration and component scanning
import org.springframework.context.ApplicationContext; // interface to access the spring ioc container

// main annotation to mark this class as a spring boot application
@SpringBootApplication
public class HrApplication {

	// the entry point of the application
	public static void main(String[] args) {

		// starting the spring application and returning the ioc container (application context)
		ApplicationContext context = SpringApplication.run(HrApplication.class, args);

		// getting a bean of type 'Dev' from the ioc container
		Dev obj = context.getBean(Dev.class);

		// calling the 'build' method of the 'Dev' object
		obj.build();
	}

}
