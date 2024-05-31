package com.shardingjdbc;

import com.shardingjdbc.mapper.EmployeeMapper;
import com.shardingjdbc.pojo.Employee;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class EmployeeTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void testInsert(){
        for (int i = 10; i < 20; i++) {
            Employee employee = new Employee();
            employee.setPhone("100"+i);
            employee.setUsername("cic"+i);
            employeeMapper.insert(employee);
        }
    }

    @Test
    public void testSelect(){
        List<Employee> employees = employeeMapper.selectList(null);
        System.out.println("employees = " + employees);
    }

}
