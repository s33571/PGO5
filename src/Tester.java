public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;
    public Tester(String id, String imie, String nazwisko, double stawka, boolean auto, int scenariusze) {
        super(id, imie, nazwisko, stawka);
        this.czyAutomatyzujacy = auto;
        this.liczbaScenariuszy = scenariusze;
    }
    @Override
    public double obliczKosztMiesieczny() {
        // Автоматизаторы получают бонус 500
        double bonus = czyAutomatyzujacy ? 500 : 0;
        return super.obliczKosztMiesieczny() + bonus + (liczbaScenariuszy * 10);
    }
    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " (Tester " + (czyAutomatyzujacy ? "Auto" : "Manual") + ")";
    }
    public void uruchomRaportTestow() {
        System.out.println("Uruchamiam " + liczbaScenariuszy + " scenariuszy testowych...");
    }
}
