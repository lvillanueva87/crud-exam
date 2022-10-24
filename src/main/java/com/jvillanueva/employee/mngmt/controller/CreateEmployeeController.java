package com.jvillanueva.employee.mngmt.controller;

import com.jvillanueva.employee.mngmt.constants.ApiConstants;
import com.jvillanueva.employee.mngmt.model.CreateEmployeeRequest;
import com.jvillanueva.employee.mngmt.model.CreateEmployeeResponse;
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
public class CreateEmployeeController {

  /**
   * Dependencia employee service.
   */
  @Autowired
  private EmployeeService employeeService;

  /**
   * Método que exppone la api de creación de empleados.
   * 
   * @param request petición
   * @return response de inserción.
   */
  @PostMapping(value = ApiConstants.API_CREATE_EMPLOYEE,
      consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CreateEmployeeResponse> createEmployee(
      @Valid @RequestBody CreateEmployeeRequest request) {

    return new ResponseEntity<>(employeeService.createEmployee(request), HttpStatus.OK);
  }
}
