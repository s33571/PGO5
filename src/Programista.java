public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;
    public Programista(String id, String imie, String nazwisko, double stawka, String jezyk, int repo) {
        super(id, imie, nazwisko, stawka);
        this.glownyJezyk = jezyk;
        this.liczbaRepozytoriow = repo;
    }
    @Override
    public double obliczKosztMiesieczny() {
        return super.obliczKosztMiesieczny() + (liczbaRepozytoriow * 100);
    }
    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " (Programista " + glownyJezyk + ")";
    }
    public void wypiszTechnologie() {
        System.out.println("Moje technologie: " + glownyJezyk + ", Git, Java.");
    }
}
