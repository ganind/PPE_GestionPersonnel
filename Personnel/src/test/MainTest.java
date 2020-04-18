import org.junit.jupiter.api.Test;
import personnel.Employe;
import personnel.GestionPersonnel;
import personnel.Ligue;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import personnel.SauvegardeImpossible;

class MainTest {

    GestionPersonnel gestionPersonnel = GestionPersonnel.getGestionPersonnel();

    @Test
    void createLigue() throws SauvegardeImpossible
{
    Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
    assertEquals("Fléchettes", ligue.getNom()); //function propre aux tests unitaires
}

    @Test
    void addEmploye() throws SauvegardeImpossible
    {
        Ligue ligue = gestionPersonnel.addLigue("Fléchettes");
        Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
        assertEquals(employe, ligue.getEmployes().first());
    }

}