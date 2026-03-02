import java.time.LocalDate;

public class Main{
    public static void main(String[] args){

        Campionato campionato = new Campionato();

        Squadra falchi = new Squadra(15, "Falchi");
        falchi.aggiungiGiocatore(new Giocatore("Mattia", "Barbieri", "M"));
        falchi.aggiungiGiocatore(new Giocatore("Anna", "Nicolì", "F"));
        falchi.aggiungiGiocatore(new Giocatore("Martina", "Magnani", "F"));


        Squadra aquile = new Squadra(14, "Aquile");
        aquile.aggiungiGiocatore(new Giocatore("Roncaglia", "Michele", "M"));
        aquile.aggiungiGiocatore(new Giocatore("Gloria", "Infante", "F"));
        aquile.aggiungiGiocatore(new Giocatore("Lorenzo", "Barone", "M"));


        campionato.aggiungiSquadra(falchi);
        campionato.aggiungiSquadra(aquile);

        Partita partita1 = new Partita(
                falchi,
                aquile,
                LocalDate.of(2026, 2, 22),
                23,
                24
        );

        campionato.aggiungiPartita(partita1);

        System.out.println(partita1);
        System.out.println("Vincitore: " + partita1.getVincitore().getNome());
    }
}