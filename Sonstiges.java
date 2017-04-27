package de.hidora.adcrawler.buildertest;

public class Sonstiges extends Person {

    private String schuhe;

    public String getSchuhe() {
        return schuhe;
    }

    public void setSchuhe(String schuhe) {
        this.schuhe = schuhe;
    }


    public static class Builder extends Person.Builder {
        private String schuhe;


        public Sonstiges build() {
            // TODO:
            // hier am liebsten den Builder der Super-Klasse aufrufen, damit der COde nicht doppelt wird
            // z.B. sowas: Sonstiges s = (Sonstiges) super.build();
            // oder sowas: Sonstiges s = super.build(this);
            // wobei sonstiges hier in der Subklasse dann weiter befüllt werden kann

            Sonstiges s = new Sonstiges();
            s.setSchuhe(schuhe);
            return s;
        }

        public Builder withSchuhe(String schuhe) {
            this.schuhe = schuhe;
            return this;
        }
    }
}
