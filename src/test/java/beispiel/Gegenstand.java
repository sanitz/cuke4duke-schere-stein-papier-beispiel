package beispiel;

public enum Gegenstand {
    Schere {
        @Override
        boolean gewinntGegen(Gegenstand gegner) {
            return gegner == Papier;
        }

    },
    Stein {
        @Override
        boolean gewinntGegen(Gegenstand gegner) {
            return gegner == Schere;
        }

    },
    Papier {
        @Override
        boolean gewinntGegen(Gegenstand gegner) {
            return gegner == Stein;
        }

    };

    public Resultat gegen(Gegenstand gegner) {
        if (gegner == this) {
            return Resultat.Unentschieden;
        }
        return gewinntGegen(gegner) ? Resultat.Sieg : Resultat.Niederlage;
    }

    abstract boolean gewinntGegen(Gegenstand gegner);
}

