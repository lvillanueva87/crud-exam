package com.jvillanueva.employee.mngmt.model;

import lombok.Builder;
import lombok.Data;

/**
 * Clase que representa la respuesta a la inserción de empleados.
 * 
 * @author jorge.villanueva
 *
 */
@Data
@Builder
public class CreateEmployeeResponse {

  /**
   * Id con el eque se guardó el empleado.
   */
  private String id;

  /**
   * Bandera exito.
   */
  private boolean success;
}
