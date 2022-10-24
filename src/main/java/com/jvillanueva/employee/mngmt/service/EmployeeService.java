package com.jvillanueva.employee.mngmt.service;

import com.jvillanueva.employee.mngmt.model.CreateEmployeeRequest;
import com.jvillanueva.employee.mngmt.model.CreateEmployeeResponse;
import com.jvillanueva.employee.mngmt.model.GetEmployeesByJobRequest;
import com.jvillanueva.employee.mngmt.model.GetEmployeesByJobResponse;

/**
 * Interfaz que define la firema de métodos para el servicio de empleado.
 */
public interface EmployeeService {

  /**
   * Firma del método que agrega un empleado a la tabla employees.
   * 
   * @param request petición.
   * @return id de empleado y flag success.
   */
  CreateEmployeeResponse createEmployee(CreateEmployeeRequest request);

  /**
   * Firma del método que obtiene una lista de empleados dado un puesto.
   * 
   * @param request petición.
   * @return lista de empleados y flag success.
   */
  GetEmployeesByJobResponse getEmployeesByJob(GetEmployeesByJobRequest request);
}
