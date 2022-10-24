package com.jvillanueva.employee.mngmt.business;

import com.jvillanueva.employee.mngmt.constants.ApiConstants;
import com.jvillanueva.employee.mngmt.entity.Employee;
import com.jvillanueva.employee.mngmt.exceptions.EmployeeExistsException;
import com.jvillanueva.employee.mngmt.exceptions.InvalidAgeException;
import com.jvillanueva.employee.mngmt.exceptions.InvalidDateRangeException;
import com.jvillanueva.employee.mngmt.exceptions.NoGenderExistsException;
import com.jvillanueva.employee.mngmt.exceptions.NoJobExistsException;
import com.jvillanueva.employee.mngmt.repository.EmployeeRepository;
import com.jvillanueva.employee.mngmt.repository.GenderRepository;
import com.jvillanueva.employee.mngmt.repository.JobRepository;
import com.jvillanueva.employee.mngmt.service.ValidationService;
import com.jvillanueva.employee.mngmt.util.Util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Clase que implementa la lógica para las validaciones.
 * 
 * @author jorge.villanueva
 *
 */
@Service
public class ValidationBusiness implements ValidationService {

  /**
   * Dependencia repositorio de empleados.
   */
  @Autowired
  private EmployeeRepository employeeRepository;


  /**
   * Dependencia repositorio genders.
   */
  @Autowired
  private GenderRepository genderRepository;

  /**
   * Dependencia repositorio jobs.
   */
  @Autowired
  private JobRepository jobRepository;

  /**
   * Constante externalizada años mínimos.
   */
  @Value(ApiConstants.MINIMUM_YEARS)
  private long minimumYears;

  /**
   * Método que valida si un empleado existe.
   * 
   * @param name nombre.
   * @param lastName apellidos.
   */
  @Override
  public void validateEmployeeExists(String name, String lastName) {

    long employeeExists = employeeRepository.employeeExists(name, lastName);

    if (employeeExists > ApiConstants.ZERO_VALUE) {
      throw new EmployeeExistsException();
    }
  }

  /**
   * Método que valida si existe un empleado, dado su id.
   * 
   * @param employeeId id de empleado.
   */
  @Override
  public void validateEmployeeExists(long employeeId) {

    Employee employee = employeeRepository.getReferenceById(employeeId);

    if (Objects.isNull(employee)) {
      throw new EmployeeExistsException();
    }
  }

  /**
   * Método que valida si el puesto existe.
   * 
   * @param idJob id de puesto.
   */
  @Override
  public void validateJobExists(long idJob) {

    long jobExists = jobRepository.jobExists(idJob);

    if (jobExists == ApiConstants.ZERO_VALUE) {
      throw new NoJobExistsException();
    }
  }

  /**
   * Método que valida si el género existe.
   * 
   * @param idGender id de género.
   */
  @Override
  public void validateGenderExists(long idGender) {

    long genderExists = genderRepository.genderExists(idGender);

    if (genderExists == ApiConstants.ZERO_VALUE) {
      throw new NoGenderExistsException();
    }
  }

  /**
   * Método que valida la edad del empleado.
   * 
   * @param birthdate fecha de nacimiento.
   */
  @Override
  public void validateAge(String birthdate) {

    long years = ChronoUnit.YEARS.between(LocalDate.parse(birthdate), LocalDate.now());

    if (years < minimumYears) {
      throw new InvalidAgeException();
    }
  }

  /**
   * Método que valida que la fecha de inicio no sea mayor a la fecha fin.
   * 
   * @param startDate fecha inicio.
   * @param endDate fecha fin.
   */
  @Override
  public void validateDate(String startDate, String endDate) {

    Date sDate = Util.getDateFromString(startDate);
    Date eDate = Util.getDateFromString(endDate);

    if (sDate.compareTo(eDate) > 0) {
      throw new InvalidDateRangeException();
    }
  }
}
