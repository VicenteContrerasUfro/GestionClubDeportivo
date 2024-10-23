import static org.junit.jupiter.api.Assertions.*;
import GestionClub.Equipo;
import GestionClub.Deportista;
import GestionClub.Entrenador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class EquipoTest {
    private Equipo equipo;
    private Entrenador entrenador;
    private List<Deportista> deportistas;

    @BeforeEach
    void setUp() {
        entrenador = new Entrenador(1, "Carlos", "10 años", "Fútbol");
        deportistas = new ArrayList<>();
        deportistas.add(new Deportista(1, "Juan", "Perez", "123456", "Fútbol"));
        equipo = new Equipo();
    }

    @Test
    void testCrearEquipoCorrectamente() {
        equipo.crearEquipo("Equipo A", entrenador, deportistas);
        assertEquals("Equipo A", equipo.getNombre());
        assertEquals(entrenador, equipo.getEntrenador());
        assertEquals(1, equipo.getDeportistas().size());
    }

    @Test
    void testCrearEquipoSinDeportistas() {
        assertThrows(IllegalArgumentException.class, () -> {
            equipo.crearEquipo("Equipo B", entrenador, new ArrayList<>());
        });
    }
}
