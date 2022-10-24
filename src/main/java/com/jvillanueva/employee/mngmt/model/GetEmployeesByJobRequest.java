package com.jvillanueva.employee.mngmt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jvillanueva.employee.mngmt.constants.ApiConstants;

import javax.validation.constraints.Min;

import lombok.Data;

/**
 * Clase que representa la petición para consultar los empleados por tipo de puesto.
 * 
 * @author jorge.villanueva
 *
 */
@Data
public class GetEmployeesByJobRequest {

  /**
   * Id de puesto.
   */
  @JsonProperty(ApiConstants.JOB_ID)
  @Min(value = ApiConstants.ONE_VALUE)
  private long jobId;
}
