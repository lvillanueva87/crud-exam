package com.jvillanueva.employee.mngmt.dto.impl;

import com.jvillanueva.employee.mngmt.dto.EmployeeDto;
import com.jvillanueva.employee.mngmt.dto.GenderDto;
import com.jvillanueva.employee.mngmt.dto.JobDto;
import com.jvillanueva.employee.mngmt.entity.Employee;
import com.jvillanueva.employee.mngmt.util.Util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

/**
 * Implementación de transformación de datos de empleados.
 * 
 * @author jorge.villanueva
 *
 */
@Component
public class EmployeeTransform {

  /**
   * Método que filtra una lista de entidades empleado en una lista de transferencia de datos y los
   * ordena.
   * 
   * @param listEmployees lista de entidades
   * @param jobId id de puesto.
   * @return lista filtrada y ordenada.
   */
  public List<EmployeeDto> transformDBResult(List<Employee> listEmployees, long jobId) {

    List<Employee> filteredEmployees = listEmployees.stream()
        .filter(employee -> employee.getJob().getId() == jobId).collect(Collectors.toList());

    List<EmployeeDto> listEmployeesDto = new ArrayList<>();

    filteredEmployees.stream().forEach((employeeFiltered) -> {

      try {
        listEmployeesDto.add(EmployeeDto.builder().id(employeeFiltered.getId())
            .gender(GenderDto.builder().id(employeeFiltered.getGender().getId())
                .name(employeeFiltered.getGender().getName()).build())
            .job(JobDto.builder().id(employeeFiltered.getJob().getId())
                .name(employeeFiltered.getJob().getName())
                .salary(employeeFiltered.getJob().getSalary()).build())
            .name(employeeFiltered.getName()).lastName(employeeFiltered.getLastName())
            .birthdate(Util.getStringFromDate(employeeFiltered.getBirthdate())).build());
      } catch (ParseException e) {

      }
    });

    listEmployeesDto.sort(Comparator.comparing(EmployeeDto::getLastName));

    return listEmployeesDto;
  }
}
