import commandLine.PersonnelConsole;
import personnel.GestionPersonnel;

public class Main {
    public static void main(String[] args)
    {
        PersonnelConsole personnelConsole =
                new PersonnelConsole(GestionPersonnel.getGestionPersonnel());
        if (personnelConsole.verifiePassword())
            personnelConsole.start();
    }
}
