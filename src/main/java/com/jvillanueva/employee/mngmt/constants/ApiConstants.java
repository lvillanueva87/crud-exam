package com.jvillanueva.employee.mngmt.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiConstants {

  /**
   * Api path recurso creación empleado.
   */
  public static final String API_CREATE_EMPLOYEE = "${constants.api.create-employee.resource}";

  /**
   * Api Path recurso obtención de empleados por puesto.
   */
  public static final String API_GET_EMPLOYEES_BY_JOB =
      "${constants.api.get-employees-by-job.resource}";

  /**
   * Api Path recurso obtención de horas trabajadas.
   */
  public static final String API_GET_EMPLOYEE_WORKED_HOURS =
      "${constants.api.worked-hours.resource}";

  /**
   * Constante que almacena la property de años mínimos para ser contratado.
   */
  public static final String MINIMUM_YEARS = "${constants.api.minimum.years}";

  /**
   * Nombre json field id.
   */
  public static final String ID = "id";

  /**
   * Nombre json field name.
   */
  public static final String NAME = "name";

  /**
   * Nombre json field birthday.
   */
  public static final String BIRTHDATE = "birthdate";

  /**
   * Nombre json field job.
   */
  public static final String JOB = "job";

  /**
   * Nombre json field gender.
   */
  public static final String GENDER = "gender";

  /**
   * Nombre json field del id de género.
   */
  public static final String GENDER_ID = "gender_id";

  /**
   * Nombre json field del id de puesto.
   */
  public static final String JOB_ID = "job_id";

  /**
   * Nombre json field request apellido.
   */
  public static final String LAST_NAME = "last_name";

  /**
   * Nombre json field request employee_id.
   */
  public static final String EMPLOYEEE_ID = "employee_id";

  /**
   * Nombre json field request start_date.
   */
  public static final String START_DATE = "start_date";

  /**
   * Nombre json field request end_date.
   */
  public static final String END_DATE = "end_date";

  /**
   * Nombre json field total_worked_hours.
   */
  public static final String TOTAL_WORKED_HOURS = "total_worked_hours";

  /**
   * Date format.
   */
  public static final String DATE_FORMAT = "yyyy-MM-dd";

  /**
   * Constante para representar el valor cero.
   */
  public static final long ZERO_VALUE = 0L;

  /**
   * Constante para representar el valor uno.
   */
  public static final long ONE_VALUE = 1L;
}
