import java.time.LocalDate;

public class Partita{

    private Squadra squadraCasa;
    private Squadra squadraOspite;
    private LocalDate data;
    private int setCasa;
    private int setOspite;

    public Partita(Squadra squadraCasa, Squadra squadraOspite, LocalDate data, int setCasa, int setOspite){
        if (squadraCasa.equals(squadraOspite)){
            throw new IllegalArgumentException("Le squadre devono essere diverse!");
        }
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.data = data;
        this.setCasa = setCasa;
        this.setOspite = setOspite;
    }

    public Squadra getVincitore(){
        if (setCasa > setOspite){
            return squadraCasa;
        } else if (setOspite > setCasa){
            return squadraOspite;
        } else {
            return null; // pareggio (anche se nella pallavolo reale non esiste)
        }
    }

    @Override
    public String toString(){
        return data + ": " + squadraCasa.getNome() + " "
                + setCasa + " - "
                + setOspite + " "
                + squadraOspite.getNome();
    }
}