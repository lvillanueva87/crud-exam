package com.jvillanueva.employee.mngmt.service;

/**
 * Interface que define las firmas de los métodos de validaciones.
 * 
 * @author jorge.villanueva
 *
 */
public interface ValidationService {

  /**
   * Firma del método que valida si existe un empleado.
   * 
   * @param name nombre.
   * @param lastName apellido.
   */
  void validateEmployeeExists(String name, String lastName);

  /**
   * Firma del método que valida si existe un empleado.
   * 
   * @param employeeId id de empleado.
   */
  void validateEmployeeExists(long employeeId);

  /**
   * Firma del método que valida si el puesto existe.
   * 
   * @param idJob id de puesto.
   */
  void validateJobExists(long idJob);

  /**
   * Firma del método que valida si el género existe.
   * 
   * @param idGender id de genero.
   */
  void validateGenderExists(long idGender);

  /**
   * Firma del método que valida la edad.
   * 
   * @param birthdate fecha de nacimiento.
   */
  void validateAge(String birthdate);

  /**
   * Firma del método que valida si la fecha de inicio es mayor a la fecha fin.
   * 
   * @param startDate fecha inicio.
   * @param endDate fecha fin.
   */
  void validateDate(String startDate, String endDate);
}
