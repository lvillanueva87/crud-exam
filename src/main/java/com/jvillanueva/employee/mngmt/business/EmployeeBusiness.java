package com.jvillanueva.employee.mngmt.business;

import com.jvillanueva.employee.mngmt.constants.ErrorConstants;
import com.jvillanueva.employee.mngmt.dto.EmployeeDto;
import com.jvillanueva.employee.mngmt.dto.impl.EmployeeTransform;
import com.jvillanueva.employee.mngmt.entity.Employee;
import com.jvillanueva.employee.mngmt.model.CreateEmployeeRequest;
import com.jvillanueva.employee.mngmt.model.CreateEmployeeResponse;
import com.jvillanueva.employee.mngmt.model.GetEmployeesByJobRequest;
import com.jvillanueva.employee.mngmt.model.GetEmployeesByJobResponse;
import com.jvillanueva.employee.mngmt.repository.EmployeeRepository;
import com.jvillanueva.employee.mngmt.service.EmployeeService;
import com.jvillanueva.employee.mngmt.service.ValidationService;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeBusiness implements EmployeeService {

  /**
   * Dependencia servicio de validación de datos.
   */
  @Autowired
  private ValidationService validationService;

  /**
   * Dependencia repositorio de empleados.
   */
  @Autowired
  private EmployeeRepository employeeRepository;

  /**
   * Dependencia transformación de objetos.
   */
  @Autowired
  private EmployeeTransform employeeTransform;

  /**
   * Método de negocio que almacena un empleado en la tabla employees.
   * 
   * @param request petición.
   * @return createEmployeeResponse.
   */
  @Override
  public CreateEmployeeResponse createEmployee(CreateEmployeeRequest request) {

    String idEmployee = null;
    boolean success = true;

    try {
      validationService.validateAge(request.getBirthdate());

      validationService.validateEmployeeExists(request.getName(), request.getLastName());

      validationService.validateGenderExists(request.getGenderId());

      validationService.validateJobExists(request.getJobId());

      idEmployee = String.valueOf(employeeRepository.addEmployee(request.getGenderId(),
          request.getJobId(), request.getName(), request.getLastName(), request.getBirthdate()));
    } catch (Exception ex) {
      log.error(ErrorConstants.ERROR_IN_SAVE_OPERATION_MSG, ex.getMessage());

      success = false;
    }

    return CreateEmployeeResponse.builder().id(idEmployee).success(success).build();
  }

  /**
   * Método de negocio que obtiene una lista de empleados dado un id de puesto.
   * 
   * @param requets petición.
   * @return getEmployeesByJobResponse
   */
  @Override
  public GetEmployeesByJobResponse getEmployeesByJob(GetEmployeesByJobRequest request) {

    boolean success = true;
    List<EmployeeDto> listEmployeesDto = null;

    try {
      List<Employee> listEmployees = employeeRepository.findAll();

      if (!listEmployees.isEmpty()) {
        listEmployeesDto = employeeTransform.transformDBResult(listEmployees, request.getJobId());
      }
    } catch (Exception ex) {
      log.error(ex.getMessage());

      success = true;
    }

    return GetEmployeesByJobResponse.builder().employees(listEmployeesDto).success(success).build();
  }
}
