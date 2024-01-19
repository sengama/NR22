import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Set<Automobil> automobile = new HashSet<>();

        automobile.add(new Automobil(2023, "Dacia Sandero"));
        automobile.add(new Automobil(2022, "Volkswagen Golf"));
        automobile.add(new Automobil(2015, "Lada Niva"));

        System.out.println("Conținutul setului HashSet:");
        for (Automobil automobil : automobile) {
            System.out.println(automobil);
        }

        Set<Automobil> automobileSortate = new TreeSet<>();

        automobileSortate.add(new Automobil(2023, "Dacia Sandero"));
        automobileSortate.add(new Automobil(2022, "Volkswagen Golf"));
        automobileSortate.add(new Automobil(2015,"Lada Niva"));

        System.out.println("\nConținutul setului TreeSet:");
        for (Automobil automobil : automobileSortate) {
            System.out.println(automobil);
        }
    }
}
