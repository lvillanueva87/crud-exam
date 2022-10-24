package com.jvillanueva.employee.mngmt.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Clase que almacena los manesajes de error cuando se lanza una excepción.
 * 
 * @author jorge.villanueva
 *
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorConstants {

  /**
   * Mensaje de error general al momento de almacenar la información.
   */
  public static final String ERROR_IN_SAVE_OPERATION_MSG =
      "Ocurrio un error al momento de guardar la informacion en el sistema.  {}";
}
