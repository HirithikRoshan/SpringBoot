// package declaration to organize the code into a specific namespace
package koli.HR;

// importing necessary spring annotations for dependency injection
import org.springframework.beans.factory.annotation.Autowired; // annotation for autowiring dependencies
import org.springframework.beans.factory.annotation.Qualifier; // annotation to specify which bean to inject when there are multiple choices
import org.springframework.stereotype.Component; // annotation to mark the class as a Spring-managed bean

// marking the class as a spring component (bean) so it can be managed by the spring ioc container
@Component
public class Dev {

    // using @Autowired to automatically inject the 'Computer' bean into this field
    @Autowired
    // @Qualifier("objLap") // Uncomment this to inject Laptop bean instead of Desktop
    @Qualifier("objDes") // specifying that the 'objDes' bean (Desktop) should be injected
    private Computer computer;

    // method to simulate a specific functionality of this class
    public void build() {
        // printing a welcome message to the console
        System.out.println("Welcome Hirithik");

        // calling the compile method of the injected computer bean
        computer.compile();
    }
}
