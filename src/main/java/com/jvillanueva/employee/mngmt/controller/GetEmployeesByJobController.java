package com.jvillanueva.employee.mngmt.controller;

import com.jvillanueva.employee.mngmt.constants.ApiConstants;
import com.jvillanueva.employee.mngmt.model.GetEmployeesByJobRequest;
import com.jvillanueva.employee.mngmt.model.GetEmployeesByJobResponse;
import com.jvillanueva.employee.mngmt.service.EmployeeService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetEmployeesByJobController {

  /**
   * Dependencia employee service.
   */
  @Autowired
  private EmployeeService employeeService;

  /**
   * Método que exppone la api de lista de empleados dado un id de puesto.
   * 
   * @param request petición
   * @return response lista de empleados.
   */
  @PostMapping(value = ApiConstants.API_GET_EMPLOYEES_BY_JOB,
      consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<GetEmployeesByJobResponse> createEmployee(
      @Valid @RequestBody GetEmployeesByJobRequest request) {

    return new ResponseEntity<>(employeeService.getEmployeesByJob(request), HttpStatus.OK);
  }
}
