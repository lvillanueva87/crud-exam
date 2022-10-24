package com.jvillanueva.employee.mngmt.model;

import com.jvillanueva.employee.mngmt.dto.EmployeeDto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * Clase que representa la respuesta de la consulta de empelados por jobid.
 * 
 * @author jorge.villanueva
 *
 */
@Data
@Builder
public class GetEmployeesByJobResponse {

  /**
   * Lista de empleados.
   */
  private List<EmployeeDto> employees;

  /**
   * Bandera ejecución exitosa.
   */
  private boolean success;
}
