// package declaration to organize the code into a specific namespace
package koli.HR;

// importing the @Component annotation to mark this class as a spring-managed bean
import org.springframework.stereotype.Component;

// marking the class as a spring component (bean) so it can be managed by the spring ioc container
@Component
public class Dev {

    // method to simulate a specific functionality of this class
    public void build() {
        // printing a welcome message to the console
        System.out.println("Welcome Hirithik");
    }
}
