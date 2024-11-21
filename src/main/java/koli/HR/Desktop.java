// package declaration to organize the code into a specific namespace
package koli.HR;

// importing necessary spring annotations for the bean and primary context
import org.springframework.context.annotation.Primary; // annotation to mark a bean as primary for autowiring
import org.springframework.stereotype.Component; // annotation to mark the class as a Spring-managed bean

// marking this class as a spring component (bean) and giving it a custom name 'objDes'
@Component("objDes")
//@Primary // If uncommented, this will make Desktop the primary bean for injection when no specific bean is requested
public class Desktop implements Computer {

    // implementation of the 'compile' method defined in the Computer interface
    @Override
    public void compile() {
        // printing a message to indicate that the compile method is being executed in the Desktop class
        System.out.println("Compiled in Desktop");
    }
}
