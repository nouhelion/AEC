package ma.emsi.tpbanquenouhaila.jsf;

import ma.emsi.tpbanquenouhaila.ejb.GestionnaireCompte;
import ma.emsi.tpbanquenouhaila.entities.CompteBancaire;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import jakarta.ejb.EJB;

/**
 * Backing bean pour la page qui liste tous les comptes.
 * @author Pc
 */
@Named
@ViewScoped
public class ListeComptes implements Serializable {

  @EJB
  private GestionnaireCompte gestionnaireCompte;
  
  private List<CompteBancaire> listeComptes;

  /**
   * Creates a new instance of GestionComptesBean
   */
  public ListeComptes() {
  }
  
  public List<CompteBancaire> getAllComptes() {
    if (listeComptes == null) {
      listeComptes = gestionnaireCompte.getAllComptes();
    }
    return listeComptes;
  }
  
   
  
}
