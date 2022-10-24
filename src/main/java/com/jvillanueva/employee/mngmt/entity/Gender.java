package com.jvillanueva.employee.mngmt.entity;

import com.jvillanueva.employee.mngmt.constants.EntityConstants;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Clase que representa la table genders.
 * 
 * @author jorge.villanueva
 *
 */
@Entity
@Table(schema = "EMPLOYEE_MNGMT", name = EntityConstants.GENDERS)
@Data
public class Gender {

  /**
   * Id de género.
   */
  @Id
  private long id;

  /**
   * Nombre de genero.
   */
  private String name;
}
