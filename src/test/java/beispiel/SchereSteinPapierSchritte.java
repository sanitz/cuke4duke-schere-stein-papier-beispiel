package beispiel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import cuke4duke.annotation.Transform;
import cuke4duke.annotation.I18n.DE.Dann;
import cuke4duke.annotation.I18n.DE.Gegebensei;
import cuke4duke.annotation.I18n.DE.Wenn;

public class SchereSteinPapierSchritte {
    private Gegenstand spieler;
    private Gegenstand gegner;

    @Gegebensei("^der Spieler mit (\\w+)$")
    public void derErsteSpieler(Gegenstand gegenstand) {
        spieler = gegenstand;
    }

    @Wenn("^der Gegner (\\w+) zeigt$")
    public void derZweiteSpieler(Gegenstand  gegenstand) {
        gegner = gegenstand;
    }

    @Transform
    public Gegenstand alsGegenstand(String text) {
        return Gegenstand.valueOf(text);
    }

    @Transform
    public Resultat alsResultat(String text) {
        return Resultat.valueOf(text);
    }

    @Dann("ist das eine? (\\w+)")
    public void gewinntSpieler(Resultat resultat) {
        assertThat(spieler.gegen(gegner),  equalTo(resultat));
    }
}
