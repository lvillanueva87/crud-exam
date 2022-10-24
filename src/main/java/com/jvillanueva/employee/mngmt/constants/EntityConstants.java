package com.jvillanueva.employee.mngmt.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Clase que almacena las constantes para las entities.
 * 
 * @author jorge.villanueva
 *
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EntityConstants {

  /**
   * Nombre table employee.
   */
  public static final String EMPLOYEES = "EMPLOYEES";

  /**
   * Nombre tabla genders.
   */
  public static final String GENDERS = "GENDERS";

  /**
   * Nombre tabla jobs.
   */
  public static final String JOBS = "JOBS";

  /**
   * Nombre de la tabla employee_worked_hours.
   */
  public static final String EMPLOYEE_WORKED_HOURS = "EMPLOYEE_WORKED_HOURS";

  /**
   * Nombre sp add employee.
   */
  public static final String ADD_EMPLOYEE = "EMPLOYEE_MNGMT.PKG_INSERT.ADD_EMPLOYEE";

  /**
   * Nombre sp validate name.
   */
  public static final String VALIDATE_NAME = "EMPLOYEE_MNGMT.PKG_CONSULT.VALIDATE_NAME";

  /**
   * Nombre sp validate gender.
   */
  public static final String VALIDATE_GENDER = "EMPLOYEE_MNGMT.PKG_CONSULT.VALIDATE_GENDER";

  /**
   * Nombre sp validate job.
   */
  public static final String VALIDATE_JOB = "EMPLOYEE_MNGMT.PKG_CONSULT.VALIDATE_JOB";

  /**
   * Nombre sp get worked hours.
   */
  public static final String GET_WORKED_HOURS = "EMPLOYEE_MNGMT.PKG_CONSULT.GET_WORKED_HOURS";

  /**
   * Nombre columna employee_id.
   */
  public static final String EMPLOYEEE_ID = "EMPLOYEEE_ID";

  /**
   * Nombre columna worked_hours.
   */
  public static final String WORKED_HOURS = "WORKED_HOURS";

  /**
   * Nombre columna worked_date.
   */
  public static final String WORKED_DATE = "WORKED_DATE";

  /**
   * Parámetro id empleado SP get employee worked hours.
   */
  public static final String I_IDEMPLOYEE = "iID_EMPLOYEE";

  /**
   * Parámetro start date SP get employee worked hours.
   */
  public static final String ISTART_DATE = "iSTART_DATE";

  /**
   * Parámetro end date SP get employee worked hours.
   */
  public static final String IEND_DATE = "iEND_DATE";

  /**
   * Parámetro gender id SP add employee.
   */
  public static final String IGENDER = "iGENDER";

  /**
   * Parámetro job id SP add employee.
   */
  public static final String IJOB = "iJOB";

  /**
   * Parámetro name SP add employee.
   */
  public static final String INAME = "iNAME";

  /**
   * Parámetro last name SP add employee.
   */
  public static final String ILAST_NAME = "iLAST_NAME";

  /**
   * Parámetro birthdate name SP add employee.
   */
  public static final String IBIRTHDATE = "iBIRTHDATE";

  /**
   * Parámetro de salida SP.
   */
  public static final String ORESULT = "oRESULT";
}
