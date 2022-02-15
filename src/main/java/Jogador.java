import java.util.ArrayList;

public class Jogador {

    private String nome;

    public String getArray(){return nome;}

    public void gambitoRainha() {
        Abertura abertura = new Abertura(nome);
        this.nome = abertura.movePiece(new GambitoRainha());
    }

    public void siciliana() {
        Abertura abertura = new Abertura(nome);
        this.nome = abertura.movePiece(new Siciliana());
    }

    public void francesa() {
        Abertura abertura = new Abertura(nome);
        this.nome = abertura.movePiece(new Francesa());
    }

    public void ruyLopez() {
        Abertura abertura = new Abertura(nome);
        this.nome = abertura.movePiece(new RuyLopez());
    }

}