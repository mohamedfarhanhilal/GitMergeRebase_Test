package conponent;

import com.example.demo.Runner;
import model.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class EmployeeComponent {


    private static final Logger logger = LogManager.getLogger(EmployeeComponent.class);

    @Autowired
    Employee employee;
    public void employeeWelocme(String name) {
        logger.info("Greeting {}!",name);
        logger.info("Hello Employee!");
//        develop
        Employee emp = new Employee();
        emp.setName(name);
        logger.info("Employee added to the pojo {}!",emp.toString());
//        develop
        Employee emp = new Employee();
        emp.setName(name);
        logger.info("Employee added to the pojo {}!",emp.toString());

        if (StringUtils.isEmpty(employee.getName())) {
            logger.info("Object empty");
        }

    }
}
