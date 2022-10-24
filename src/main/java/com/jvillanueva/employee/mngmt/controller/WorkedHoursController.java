package com.jvillanueva.employee.mngmt.controller;

import com.jvillanueva.employee.mngmt.constants.ApiConstants;
import com.jvillanueva.employee.mngmt.model.WorkedHoursRequest;
import com.jvillanueva.employee.mngmt.model.WorkedHoursResponse;
import com.jvillanueva.employee.mngmt.service.WorkedHoursService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkedHoursController {

  /**
   * Dependencia employee service.
   */
  @Autowired
  private WorkedHoursService workedHoursService;

  /**
   * Método que exppone la api dobtención de horas trabajadas.
   * 
   * @param request petición
   * @return response horas trabajadas.
   */
  @PostMapping(value = ApiConstants.API_GET_EMPLOYEE_WORKED_HOURS,
      consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<WorkedHoursResponse> createEmployee(
      @Valid @RequestBody WorkedHoursRequest request) {

    return new ResponseEntity<>(workedHoursService.getWorkedHoursByEmployeeAndDateRange(request),
        HttpStatus.OK);
  }
}
