package quiz;

class EinfacheZahlenfrage extends AbstrakteZahlenfrage {

    //Exemplarvariablen
    private int richtigeAntwort;

    //Konstruktor
    public EinfacheZahlenfrage(String frage, int punkte, int richtigeAntwort) {
        super(frage, punkte);
        this.richtigeAntwort = richtigeAntwort;
    }

    /**
     * @return liefert "true" wenn die Frage beantwortet und richtig beantwortet wurde
     */

    public boolean istRichtigBeantwortet() {
        boolean antwort = false;
        if (this.antwort == this.richtigeAntwort && istBeantwortet()) {
            antwort = true;
        }
        return antwort;
    }

}