#language: de

Funktionalität: Schere Stein Papier
  Als Spieler 
  möchte ich wissen gegen welchen Gegenstand ich gewinne
  um den Gewinner zu ermitteln 
  
  Szenariogrundriss: 
    Gegeben sei der Spieler mit <Gegenstand A>
    Wenn der Gegner <Gegenstand B> zeigt
    Dann ist das eine <Resultat>

  Beispiele:
    | Gegenstand A | Gegenstand B | Resultat      |
    | Schere       | Papier       | Sieg          | 
    | Schere       | Stein        | Niederlage    | 
    | Schere       | Schere       | Unentschieden | 
    | Papier       | Papier       | Unentschieden | 
    | Papier       | Stein        | Sieg          | 
    | Papier       | Schere       | Niederlage    | 
    | Stein        | Papier       | Niederlage    | 
    | Stein        | Stein        | Unentschieden | 
    | Stein        | Schere       | Sieg          | 
    
