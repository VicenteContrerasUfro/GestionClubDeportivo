import static org.junit.jupiter.api.Assertions.*;
import GestionClub.Deportista;
import GestionClub.Entrenador;
import GestionClub.Equipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AsignacionTest {
    private Equipo equipo;
    private Deportista deportista;
    private Entrenador entrenador;

    @BeforeEach
    void setUp() {
        equipo = new Equipo();
        deportista = new Deportista(1, "Juan", "Perez", "123456", "Fútbol");
        entrenador = new Entrenador(1, "Carlos", "10 años", "Fútbol");
    }

    @Test
    void testAsignarDeportistaCorrectamente() {
        equipo.asignarDeportista(deportista);
        assertTrue(equipo.getDeportistas().contains(deportista));
    }

    @Test
    void testAsignarDeportistaDuplicado() {
        equipo.asignarDeportista(deportista);
        assertThrows(IllegalArgumentException.class, () -> {
            equipo.asignarDeportista(deportista);
        });
    }

    @Test
    void testAsignarEntrenadorCorrectamente() {
        equipo.asignarEntrenador(entrenador);
        assertEquals(entrenador, equipo.getEntrenador());
    }
}
