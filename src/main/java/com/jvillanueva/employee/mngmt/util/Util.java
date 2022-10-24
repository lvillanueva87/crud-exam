package com.jvillanueva.employee.mngmt.util;

import com.jvillanueva.employee.mngmt.constants.ApiConstants;
import com.jvillanueva.employee.mngmt.exceptions.InvalidFormatDateException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Clase dde utilidades generales.
 * 
 * @author jorge.villanueva
 *
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Util {

  /**
   * Date formatter.
   */
  private static SimpleDateFormat sdf = new SimpleDateFormat(ApiConstants.DATE_FORMAT);

  /**
   * Método que convierte un string en una fecha dado un formato.
   * 
   * @param strDate fecha en string.
   * @return objecto de tipo fecha.
   * @throws ParseException
   */
  public static Date getDateFromString(String strDate) {

    try {
      return sdf.parse(strDate);
    } catch (ParseException e) {
      throw new InvalidFormatDateException();
    }
  }

  /**
   * Método que convierte una fecha en un string.
   * 
   * @param date fecha
   * @return string date.
   * @throws ParseException
   */
  public static String getStringFromDate(Date date) throws ParseException {

    return sdf.format(date);
  }
}
