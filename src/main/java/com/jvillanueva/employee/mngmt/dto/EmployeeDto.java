package com.jvillanueva.employee.mngmt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.jvillanueva.employee.mngmt.constants.ApiConstants;

import lombok.Builder;
import lombok.Data;

/**
 * Clase que representa el employee como dto.
 * 
 * @author jorge.villanueva
 *
 */
@Data
@Builder
@JsonPropertyOrder({ApiConstants.ID, ApiConstants.NAME, ApiConstants.LAST_NAME,
    ApiConstants.BIRTHDATE, ApiConstants.JOB, ApiConstants.GENDER})
public class EmployeeDto {

  /**
   * Id de empleado.
   */
  private long id;

  /**
   * Género.
   */
  private GenderDto gender;

  /**
   * Puesto.
   */
  private JobDto job;

  /**
   * Nombre.
   */
  private String name;

  /**
   * Apellido.
   */
  @JsonProperty(ApiConstants.LAST_NAME)
  private String lastName;

  /**
   * Fecha de nacimiento.
   */
  private String birthdate;
}
