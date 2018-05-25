package quiz;

interface Zahlenfrage {

    /**
     * liefert true wenn die Methode legeAntwortFest() schon mindestens
     * einmal ausgefuehrt wurde, ansonsten false
     */

    boolean istBeantwortet();

    /**
     * liefert true wenn die Frage schon beantwortet wurde und die Antwort
     * richtig war, ansonsten false
     */

    boolean istRichtigBeantwortet();

    /**
     * legt die Antwort auf diese Frage fest
     */

    void legeAntwortFest(int antwort);

    /**
     * liefert die Anzahl der erreichten Punkte, abhaengig von der Korrektheit der Antwort
     */

    int liefereErreichtePunkte();

    /**
     * liefert den Fragentext der Aufgabe
     */

    String liefereFrage();

    /**
     * liefert die maximal moegliche Anzahl an erreichbaren Punkten
     */

    int liefereMoeglichePunkte();

}
