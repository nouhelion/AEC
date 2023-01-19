/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ma.emsi.tpbanquenouhaila.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import jakarta.ejb.EJB;
import ma.emsi.tpbanquenouhaila.ejb.GestionnaireCompte;
import ma.emsi.tpbanquenouhaila.entities.CompteBancaire;
/**
 *
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
