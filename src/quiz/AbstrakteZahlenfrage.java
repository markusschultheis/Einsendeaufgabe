package quiz;

abstract class AbstrakteZahlenfrage implements Zahlenfrage {

    //Exemplarvariablen
    String frage;
    int punkte = 0;
    boolean istBeantwortet;
    protected int antwort;

    //Konstruktor 
    public AbstrakteZahlenfrage(String frage, int punkte) {
        this.frage = frage;
        this.punkte = punkte;
    }

    /**
     * @return liefert bei einer beantworteten Frage "true" zurück
     */

    public boolean istBeantwortet() {
        return this.istBeantwortet;
    }

    /**
     * @return liefert bei einer richtig beantworteten Frage "true" zurück
     */

    public boolean istRichtigBeantwortet() {
        return false;
    }

    /**
     * @return die Frage ist beantwortet "true" und legt die gegebene
     * Antwort fest.
     */

    public void legeAntwortFest(int antwort) {
        this.istBeantwortet = true;
        this.antwort = antwort;
    }

    /**
     * @return die Punkte werden nur gezählt wenn
     * 1. richtig beantworteten Frage
     * 2. Frage ueberhaupt beantwortet ist
     */

    public int liefereErreichtePunkte() {
        int punkte = 0;
        if (istRichtigBeantwortet() && istBeantwortet()) {
            punkte = this.punkte;
        }
        return punkte;
    }

    /**
     * @return gibt die Frage aus
     */

    public String liefereFrage() {
        return this.frage;
    }

    /**
     * @return die moegliche Punktzahl wird berechnet
     */

    public int liefereMoeglichePunkte() {
        return this.punkte;
    }

}