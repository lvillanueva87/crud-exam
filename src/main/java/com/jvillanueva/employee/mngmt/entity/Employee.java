package com.jvillanueva.employee.mngmt.entity;

import com.jvillanueva.employee.mngmt.constants.ApiConstants;
import com.jvillanueva.employee.mngmt.constants.EntityConstants;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * Clase que representa a la table employees.
 * 
 * @author jorge.villanueva
 *
 */
@Entity
@Table(schema = "EMPLOYEE_MNGMT", name = EntityConstants.EMPLOYEES)
@Data
public class Employee {

  /**
   * Id de empleado.
   */
  @Id
  private long id;

  /**
   * Id. de género.
   */
  @JoinColumn(name = ApiConstants.GENDER_ID)
  @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Gender gender;

  /**
   * Id. del puesto.
   */
  @JoinColumn(name = ApiConstants.JOB_ID)
  @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Job job;

  /**
   * Nombre.
   */
  private String name;

  /**
   * Apellido.
   */
  @Column(name = ApiConstants.LAST_NAME)
  private String lastName;

  /**
   * Fecha de nacimiento.
   */
  private Date birthdate;
}
