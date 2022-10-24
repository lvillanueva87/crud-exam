package com.jvillanueva.employee.mngmt.entity;

import com.jvillanueva.employee.mngmt.constants.EntityConstants;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Clase que represneta a la table employee_worked_hours.
 * 
 * @author jorge.villanueva
 *
 */
@Data
@Entity
@Table(name = EntityConstants.EMPLOYEE_WORKED_HOURS)
public class WorkedHour {

  /**
   * Id de registro.
   */
  @Id
  private long id;

  /**
   * Id de empleado.
   */
  @Column(name = EntityConstants.EMPLOYEEE_ID)
  private long employeeId;

  /**
   * Horas trabajadas.
   */
  @Column(name = EntityConstants.WORKED_HOURS)
  private long workedHours;

  /**
   * Fecha trabajo.
   */
  @Column(name = EntityConstants.WORKED_DATE)
  private Date workedDate;
}
