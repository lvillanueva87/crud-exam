package com.jvillanueva.employee.mngmt.repository;

import com.jvillanueva.employee.mngmt.constants.EntityConstants;
import com.jvillanueva.employee.mngmt.entity.WorkedHour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repository para las operacioens en la tabla employee_worked_hours.
 * 
 * @author jorge.villanueva
 *
 */
@Repository
public interface WorkedHoursRepository extends JpaRepository<WorkedHour, Long> {

  /**
   * Método que llama al sp de consulta de horas trabajadas dado un id de empleado y rango de
   * fechas.
   * 
   * @param employeeId id de empleado.
   * @param startDate fecha inicio.
   * @param endDate fecha fin.
   * @return total horas.
   */
  @Procedure(procedureName = EntityConstants.GET_WORKED_HOURS,
      outputParameterName = EntityConstants.ORESULT)
  long getWorkedHours(@Param(EntityConstants.I_IDEMPLOYEE) long employeeId,
      @Param(EntityConstants.ISTART_DATE) String startDate,
      @Param(EntityConstants.IEND_DATE) String endDate);
}
