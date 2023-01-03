package ma.emsi.tpbanquenouhaila.ejb;

import ma.emsi.tpbanquenouhaila.entities.CompteBancaire;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

/**
 * Initialise une base de données vide.
 *
 * @author Pc
 */
@Singleton
@Startup
public class Init {

  @EJB
  private GestionnaireCompte gestionnaireCompte;

  @PostConstruct
  public void initComptes() {
    if (gestionnaireCompte.nbComptes() != 0) {
      return;
    }
    gestionnaireCompte.creerCompte(new CompteBancaire("John Lennon", 150000));
    gestionnaireCompte.creerCompte(new CompteBancaire("Paul McCartney", 950000));
    gestionnaireCompte.creerCompte(new CompteBancaire("Ringo Starr", 20000));
    gestionnaireCompte.creerCompte(new CompteBancaire("Georges Harrisson", 100000));
  }
}
