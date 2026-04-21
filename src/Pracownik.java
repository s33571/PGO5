import java.util.Objects;

public class Pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;
    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }
    public final String pobierzIdPracownika() {
        return idPracownika;
    }
    public double obliczKosztMiesieczny() {
        return stawkaBazowa; // Базовая логика
    }
    public String przedstawSie() {
        return "Pracownik: " + imie + " " + nazwisko;
    }
    @Override
    public String toString() {
        return "[" + idPracownika + "] " + imie + " " + nazwisko + ", Stawka: " + stawkaBazowa;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik that = (Pracownik) o;
        return Objects.equals(idPracownika, that.idPracownika);
    }
}
