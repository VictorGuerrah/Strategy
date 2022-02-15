import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void aberturaGambitoRainha() {
        Jogador jogador = new Jogador();
        jogador.gambitoRainha();
        assertEquals("Abertura Gambito da Rainha escolhida.", jogador.getArray());
    }

    @Test
    void aberturaSiciliana() {
        Jogador jogador = new Jogador();
        jogador.siciliana();
        assertEquals("Abertura Siciliana escolhida.", jogador.getArray());
    }

    @Test
    void aberturaFrancesa() {
        Jogador jogador = new Jogador();
        jogador.francesa();
        assertEquals("Abertura Francesa escolhida.", jogador.getArray());
    }

    @Test
    void aberturaRuyLopez() {
        Jogador jogador = new Jogador();
        jogador.ruyLopez();
        assertEquals("Abertura Ruy-Lopez escolhida.", jogador.getArray());
    }
}