package ma.emsi.tpbanquenouhaila.ejb;

/**
 * Exception lancée en cas de problème sur les comptes bancaires.
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
