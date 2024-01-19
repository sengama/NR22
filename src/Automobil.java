public class Automobil implements Comparable<Automobil> {

    private int anProducere;
    private String denumire;

    public Automobil(int anProducere, String denumire) {
        this.anProducere = anProducere;
        this.denumire = denumire;
    }

    @Override
    public int compareTo(Automobil altAutomobil) {
        return this.anProducere - altAutomobil.anProducere;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "anProducere=" + anProducere +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}