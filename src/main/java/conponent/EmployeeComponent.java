package conponent;

import com.example.demo.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeComponent {
    private static final Logger logger = LogManager.getLogger(EmployeeComponent.class);

    public void employeeWelocme(String name) {
        logger.info("Greeting {}}!",name);
    }
}
