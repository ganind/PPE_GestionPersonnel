import org.junit.jupiter.api.Test;
import personnel.Employe;
import personnel.Ligue;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void createLigue()
{
    Ligue ligue = new Ligue("Fléchettes");
    assertEquals("Fléchettes", ligue.getNom()); //function propre aux tests unitaires
}

    @Test
    void addEmploye()
    {
        Ligue ligue = new Ligue("Fléchettes");
        Employe employe = ligue.addEmploye("Bouchard", "Gérard", "g.bouchard@gmail.com", "azerty");
        assertEquals(employe, ligue.getEmployes().first());
    }

}