package com.jvillanueva.employee.mngmt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jvillanueva.employee.mngmt.constants.ApiConstants;

import lombok.Builder;
import lombok.Data;

/**
 * Clase que representa el response de la consulta de horas por empleado y rango de fechas.
 * 
 * @author jorge.villanueva
 *
 */
@Data
@Builder
public class WorkedHoursResponse {

  /**
   * Total de horas.
   */
  @JsonProperty(ApiConstants.TOTAL_WORKED_HOURS)
  private String totalWorkedHours;

  /**
   * Bandera exito.
   */
  private boolean success;
}
