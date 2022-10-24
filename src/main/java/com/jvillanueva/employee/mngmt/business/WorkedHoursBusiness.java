package com.jvillanueva.employee.mngmt.business;

import com.jvillanueva.employee.mngmt.model.WorkedHoursRequest;
import com.jvillanueva.employee.mngmt.model.WorkedHoursResponse;
import com.jvillanueva.employee.mngmt.repository.WorkedHoursRepository;
import com.jvillanueva.employee.mngmt.service.ValidationService;
import com.jvillanueva.employee.mngmt.service.WorkedHoursService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase que implementa la lógica para obtener las horas trabajadas.
 * 
 * @author jorge.villanueva
 *
 */
@Slf4j
@Service
public class WorkedHoursBusiness implements WorkedHoursService {

  /**
   * Dependencia servicio de validación de datos.
   */
  @Autowired
  private ValidationService validationService;

  /**
   * Dependencia repositorio para la tabla employee_worked_hours.
   */
  @Autowired
  private WorkedHoursRepository workdHoursRepository;

  /**
   * Método que obtiene las horas trabajadas por un empleado en cierto rango de fechas.
   * 
   * @param request petición.
   * @return total horas y flag success.
   */
  @Override
  public WorkedHoursResponse getWorkedHoursByEmployeeAndDateRange(WorkedHoursRequest request) {

    String strWorkedHours = null;
    boolean success = true;

    try {
      validationService.validateEmployeeExists(request.getEmployeeId());

      validationService.validateDate(request.getStartDate(), request.getEndDate());

      strWorkedHours = String.valueOf(workdHoursRepository.getWorkedHours(request.getEmployeeId(),
          request.getStartDate(), request.getEndDate()));
    } catch (Exception ex) {
      log.error(ex.getMessage());
      success = false;
    }

    return WorkedHoursResponse.builder().totalWorkedHours(strWorkedHours).success(success).build();
  }
}
