package com.jvillanueva.employee.mngmt.repository;

import com.jvillanueva.employee.mngmt.constants.EntityConstants;
import com.jvillanueva.employee.mngmt.entity.Job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repository para las operaciones en la tabla jobs.
 * 
 * @author jorge.villanueva
 *
 */
@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

  /**
   * Método que llama al sp de validación de puesto.
   * 
   * @param jobId id de puesto.
   * @return true|false
   */
  @Procedure(procedureName = EntityConstants.VALIDATE_JOB,
      outputParameterName = EntityConstants.ORESULT)
  long jobExists(@Param(EntityConstants.IJOB) long jobId);
}
