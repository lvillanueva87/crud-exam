package com.jvillanueva.employee.mngmt.repository;

import com.jvillanueva.employee.mngmt.constants.EntityConstants;
import com.jvillanueva.employee.mngmt.entity.Gender;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repository para las operaciones en la tabla genders.
 * 
 * @author jorge.villanueva
 *
 */
@Repository
public interface GenderRepository extends JpaRepository<Gender, Long> {

  /**
   * Método que llama al sp de validación de género.
   * 
   * @param genderId id de genero.
   * @return true|false
   */
  @Procedure(procedureName = EntityConstants.VALIDATE_GENDER,
      outputParameterName = EntityConstants.ORESULT)
  long genderExists(@Param(EntityConstants.IGENDER) long genderId);
}
