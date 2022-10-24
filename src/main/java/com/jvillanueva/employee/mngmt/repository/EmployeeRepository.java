package com.jvillanueva.employee.mngmt.repository;

import com.jvillanueva.employee.mngmt.constants.EntityConstants;
import com.jvillanueva.employee.mngmt.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repository para las operaciones en la bd de employees.
 * 
 * @author jorge.villanueva
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  /**
   * Método que llama al SP de inserción de empleados.
   * 
   * @param genderId id genero.
   * @param jobId id puesto.
   * @param name nombre.
   * @param lastName apellido.
   * @param birthdate fecha nacimiento.
   * @return id.
   */
  @Procedure(procedureName = EntityConstants.ADD_EMPLOYEE,
      outputParameterName = EntityConstants.ORESULT)
  long addEmployee(@Param(EntityConstants.IGENDER) long genderId,
      @Param(EntityConstants.IJOB) long jobId, @Param(EntityConstants.INAME) String name,
      @Param(EntityConstants.ILAST_NAME) String lastName,
      @Param(EntityConstants.IBIRTHDATE) String birthdate);

  /**
   * Método que llama al SP de validación de nombres de empleados.
   * 
   * @param name nombre.
   * @param lastName apellido
   * @return true|false.
   */
  @Procedure(procedureName = EntityConstants.VALIDATE_NAME,
      outputParameterName = EntityConstants.ORESULT)
  long employeeExists(@Param(EntityConstants.INAME) String name,
      @Param(EntityConstants.ILAST_NAME) String lastName);
}
