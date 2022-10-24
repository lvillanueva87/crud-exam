package com.jvillanueva.employee.mngmt.model;

import java.time.ZonedDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
  /**
   * Código del error.
   */
  private String code;
  /**
   * Detalles del error.
   */
  private String details;
  /**
   * Ubicación del error.
   */
  private String location;
  /**
   * Fecha y hora cuando ocurre el error.
   */
  private ZonedDateTime timestamp;
}
