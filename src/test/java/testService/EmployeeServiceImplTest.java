package testService;

import com.prj.SpringBootApplication;
import com.prj.domain.Employee;
import com.prj.mapper.EmployeeMapper;
import com.prj.repo.EmployeeRedisDao;
import com.prj.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.mockito.Mockito.doNothing;

@SpringBootTest(classes = SpringBootApplication.class)
@ExtendWith(value = SpringExtension.class)
class EmployeeServiceImplTest {

    @Autowired
    private EmployeeServiceImpl employeeServiceImplUnderTest;

    @MockBean
    private EmployeeMapper mockEmployeeMapper;
    @MockBean
    private EmployeeRedisDao mockEmployeeRedisDao;


    @Test
    void testSelectEmployeeById() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("tom");
        employee.setDept("1");
        employee.setSalary(BigDecimal.valueOf(1000));

        Mockito.when(mockEmployeeRedisDao.findByID("1")).thenReturn(null);
        Mockito.when(mockEmployeeMapper.selectEmployeeById(1L)).thenReturn(employee);
        doNothing().when(mockEmployeeRedisDao).saveEmployee("1", 24 * 60 * 60, employee);

        Employee resultEmployee = employeeServiceImplUnderTest.selectEmployeeById(1L);
        Assertions.assertTrue(resultEmployee.getName().equals("tom"));
    }

}
