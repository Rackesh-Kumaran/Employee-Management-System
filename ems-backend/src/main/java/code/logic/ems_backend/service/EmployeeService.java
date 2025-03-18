package code.logic.ems_backend.service;

import code.logic.ems_backend.dto.EmployeeDto;
import lombok.Lombok;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);


    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);


    void deleteEmployee(Long employeeId);




}
