package com.jvillanueva.employee.mngmt.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Clase que representa el género como dto.
 * 
 * @author jorge.villanueva
 *
 */
@Data
@Builder
public class GenderDto {

  /**
   * Id de género.
   */
  private long id;

  /**
   * Nombre de genero.
   */
  private String name;
}
