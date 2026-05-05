package projekat;

class Knjiga {
    private String naslov;
    private String autor;
    private int brojStrana;

    // konstruktor
    public Knjiga(String naslov, String autor, int brojStrana) {
        this.naslov = naslov;
        this.autor = autor;
        this.brojStrana = brojStrana;
    }

    // getteri
    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    // setteri
    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    // metode
    public void ispisi() {
        System.out.println("Naslov: " + naslov);
        System.out.println("Autor: " + autor);
        System.out.println("Broj strana: " + brojStrana);
    }

    public String getOpis() {
        return naslov + " - " + autor;
    }

    public boolean jeDebela() {
        return brojStrana > 300;
    }
}



public class Main {
    public static void main(String[] args) {

        Knjiga k1 = new Knjiga("Na Drini cuprija", "Ivo Andric", 350);
        Knjiga k2 = new Knjiga("Mali princ", "Antoine de Saint-Exupery", 120);

        k1.ispisi();
        System.out.println(k1.getOpis());
        System.out.println("Debela knjiga: " + k1.jeDebela());

        System.out.println();

        k2.ispisi();
        System.out.println(k2.getOpis());
        System.out.println("Debela knjiga: " + k2.jeDebela());
    }
}
