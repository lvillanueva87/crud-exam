package com.jvillanueva.employee.mngmt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jvillanueva.employee.mngmt.constants.ApiConstants;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

/**
 * Clase que representa el request para la inserción de un empleado.
 * 
 * @author jorge.villanueva
 *
 */
@Data
public class CreateEmployeeRequest {

  /**
   * Id. de género.
   */
  @JsonProperty(ApiConstants.GENDER_ID)
  @Min(value = ApiConstants.ONE_VALUE)
  private long genderId;

  /**
   * Id. del puesto.
   */
  @JsonProperty(ApiConstants.JOB_ID)
  @Min(value = ApiConstants.ONE_VALUE)
  private long jobId;

  /**
   * Nombre.
   */
  @NotEmpty
  private String name;

  /**
   * Apellido.
   */
  @NotEmpty
  @JsonProperty(ApiConstants.LAST_NAME)
  private String lastName;

  /**
   * Fecha de nacimiento.
   */
  @NotEmpty
  private String birthdate;
}
