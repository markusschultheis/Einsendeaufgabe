package quiz;

class Quiz {

    //Exemplarvariablen
    int fragenAnzahl = 0;
    Zahlenfrage[] fragen;
    private boolean fragenVorhanden;

    //Konstruktor
    public Quiz(final int fragenAnzahl) {
        fragen = new Zahlenfrage[fragenAnzahl];
    }

    /**
     * @param f
     * @return wenn schon die maximal mögliche Anzahl an Fragen im Quiz gespeichert wurde,
     * wird false zurueckgeliefert, ansonsten wird die Frage hinten ans Quiz angefuegt und die Methode
     * liefert true zurueck; wird null uebergeben, passiert nichts und es wird false zurueckgeliefert
     */

    public boolean fuegeFrageHinzu(Zahlenfrage f) {

        boolean frageStatus = false;

        if (this.fragenAnzahl < this.fragen.length) {
            fragen[this.fragenAnzahl] = f;
            this.fragenVorhanden = true;
            this.fragenAnzahl++;
            frageStatus = true;
        }
        return frageStatus;
    }

    /**
     * @return liefert die Summe aller erreichten Punkte
     */

    int berechneErreichtePunkte() {
        int erreichtePunkte = 0;
        for (Zahlenfrage f : fragen) {
            if (f != null) {
                erreichtePunkte += f.liefereErreichtePunkte();
            }
        }

        return erreichtePunkte;
    }

    /**
     * @return liefert die Summe der maximal moeglichen Punkte
     */

    int berechneMaximalMoeglichePunkte() {
        int maxMoeglichePunkte = 0;

        for (Zahlenfrage f : fragen ) {
            if (f != null) {
                maxMoeglichePunkte += f.liefereMoeglichePunkte();
            }
        }
        return maxMoeglichePunkte;
    }

    /**
     * @return liefert die Frage an Position index; dabei ist die zuerst hinzugefügte Frage
     * an Position 0 zu finden; gibt es zu dem Index keine Frage wird "null" zurückgegeben
     */

    Zahlenfrage liefereFrage(int index) {

        if (index < this.fragenAnzahl && fragenVorhanden) {
            return this.fragen[index];
        } else {
            return null;
        }
    }

    /**
     * @return gibt die Anzahl der Fragen aus. Dabei wird geprüft ob es ueberhaupt
     * Fragen gibt, wenn nicht, dann "null"
     */

    int liefereFragenAnzahl() {
        if (fragenVorhanden == true) {
            return this.fragenAnzahl;
        } else {
            return 0;
        }
    }
}
