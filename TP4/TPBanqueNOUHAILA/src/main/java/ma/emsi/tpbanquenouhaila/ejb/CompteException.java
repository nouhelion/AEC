/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.emsi.tpbanquenouhaila.ejb;

/**
 *
 * @author Pc
 */
public class CompteException extends Exception {

  public CompteException(String message) {
    super(message);
  }

  public CompteException(String message, Throwable cause) {
    super(message, cause);
  }

  public CompteException(Throwable cause) {
    super(cause);
  }
}
