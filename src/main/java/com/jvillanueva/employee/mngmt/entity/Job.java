package com.jvillanueva.employee.mngmt.entity;

import com.jvillanueva.employee.mngmt.constants.EntityConstants;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Clase que representa a la tabla jobs.
 * 
 * @author jorge.villanueva
 *
 */
@Entity
@Table(schema = "EMPLOYEE_MNGMT", name = EntityConstants.JOBS)
@Data
public class Job {

  /**
   * Id de puesto.
   */
  @Id
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
