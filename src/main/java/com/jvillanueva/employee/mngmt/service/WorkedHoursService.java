package com.jvillanueva.employee.mngmt.service;

import com.jvillanueva.employee.mngmt.model.WorkedHoursRequest;
import com.jvillanueva.employee.mngmt.model.WorkedHoursResponse;

/**
 * Interface que define los métodos para la consulta de horas trabajas por empleado y rango de
 * fechas.
 * 
 * @author jorge.villanueva
 *
 */
public interface WorkedHoursService {

  /**
   * Firma del método obtención de horas trabajadas por empleado y rango de fechas.
   * 
   * @param request petición.
   * @return total horas y flag exitoso.
   */
  WorkedHoursResponse getWorkedHoursByEmployeeAndDateRange(WorkedHoursRequest request);
}
