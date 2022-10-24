package com.jvillanueva.employee.mngmt.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * Clase que representa el puesto como dto.
 * 
 * @author jorge.villanueva
 *
 */
@Data
@Builder
public class JobDto {

  /**
   * Id de puesto.
   */
  private long id;

  /**
   * Nombre del puesto.
   */
  private String name;

  /**
   * Sueldo del puesto.
   */
  private BigDecimal salary;
}
