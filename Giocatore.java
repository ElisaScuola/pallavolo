import java.util.ArrayList;
import java.util.List;

public class Campionato{

    private List<Squadra> squadre;
    private List<Partita> partite;

    public Campionato(){
        this.squadre = new ArrayList<>();
        this.partite = new ArrayList<>();
    }

    public void aggiungiSquadra(Squadra s){
        squadre.add(s);
    }

    public void aggiungiPartita(Partita p){
        partite.add(p);
    }

    public List<Squadra> getSquadre(){
        return squadre;
    }

    public List<Partita> getPartite(){
        return partite;
    }
}