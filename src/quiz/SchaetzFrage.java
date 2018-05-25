package quiz;

class SchaetzFrage extends AbstrakteZahlenfrage {

    //Exemplarvariablen
    private int richtigeAntwort;
    private int prozentualeAbweichung;

    //Konstruktor
    public SchaetzFrage(String frage, int punkte, int richtigeAntwort, int prozentualeAbweichung) {
        super(frage, punkte);
        this.richtigeAntwort = richtigeAntwort;
        this.prozentualeAbweichung = prozentualeAbweichung;
    }

    /**
     * @return Antwort muss sich innerhalb des Intervalls s. u. und beantwortet sein
     * [richtigeAntwort * (100 - abweichung) / 100,
     * richtigeAntwort * (100 + abweichung) / 100] befindet
     */

    public boolean istRichtigBeantwortet() {

        if (antwort <= (richtigeAntwort * (100 + prozentualeAbweichung) / 100) && antwort > (richtigeAntwort * (100 - prozentualeAbweichung) / 100) && istBeantwortet()) {
            return true;
        } else {
            return false;
        }
    }
}