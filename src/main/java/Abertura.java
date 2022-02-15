public class Abertura {

    private String nome;

    public Abertura(String nome) {
        this.nome = nome;
    }

    public String movePiece(Piece piece) {
        return piece.movePiece();
    }
}