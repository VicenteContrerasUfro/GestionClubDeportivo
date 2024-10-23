import static org.junit.jupiter.api.Assertions.*;
import GestionClub.Entrenador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class EntrenadorTest {
    private List<Entrenador> entrenadores;

    @BeforeEach
    void setUp() {
        entrenadores = new ArrayList<>();
    }

    @Test
    void testRegistrarEntrenadorCorrectamente() {
        Entrenador entrenador = new Entrenador(1, "Carlos", "10 años", "Fútbol");
        entrenador.registrarEntrenador(entrenadores);
        assertTrue(entrenadores.contains(entrenador));
    }

    @Test
    void testRegistrarEntrenadorDuplicado() {
        Entrenador entrenador = new Entrenador(1, "Carlos", "10 años", "Fútbol");
        entrenador.registrarEntrenador(entrenadores);
        assertThrows(IllegalArgumentException.class, () -> {
            entrenador.registrarEntrenador(entrenadores);
        });
    }
}
