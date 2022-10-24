package com.jvillanueva.employee.mngmt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jvillanueva.employee.mngmt.constants.ApiConstants;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

/**
 * Clase que represneta el request para obtener el total de horas por empleado y rango de fechas.
 * 
 * @author jorge.villanueva
 *
 */
@Data
public class WorkedHoursRequest {

  /**
   * Id de empleado.
   */
  @Min(value = ApiConstants.ONE_VALUE)
  @JsonProperty(ApiConstants.EMPLOYEEE_ID)
  private long employeeId;

  /**
   * Fecha inicio.
   */
  @JsonProperty(ApiConstants.START_DATE)
  @NotEmpty
  private String startDate;

  /**
   * Fecha fin.
   */
  @JsonProperty(ApiConstants.END_DATE)
  @NotEmpty
  private String endDate;
}
