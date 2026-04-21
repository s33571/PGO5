import java.util.ArrayList;
public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;
    public ZespolProjektowy(String nazwa) {
        this.nazwaProjektu = nazwa;
        this.pracownicy = new ArrayList<>();
    }
    public void dodajPracownika(Pracownik p) {
        pracownicy.add(p);
    }
    public void wypiszSkladZespolu() {
        System.out.println("Skład zespołu: " + nazwaProjektu);
        for (Pracownik p : pracownicy) {
            System.out.println(p.przedstawSie());
        }
    }
    public double policzLacznyKoszt() {
        double suma = 0;
        for (Pracownik p : pracownicy) {
            suma += p.obliczKosztMiesieczny();
        }
        return suma;
    }
    public void wypiszProgramistow() {
        System.out.println("Programiści w zespole:");
        for (Pracownik p : pracownicy) {
            if (p instanceof Programista) {
                System.out.println(p.toString());
            }
        }
    }
}
