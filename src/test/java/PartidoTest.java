import static org.junit.jupiter.api.Assertions.*;
import GestionClub.Partido;
import GestionClub.Cancha;
import GestionClub.Equipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class PartidoTest {
    private Partido partido;
    private Cancha cancha;
    private List<Equipo> equipos;

    @BeforeEach
    void setUp() {
        cancha = new Cancha("Césped", "Centro Deportivo", 1000);
        equipos = new ArrayList<>();
        equipos.add(new Equipo());
        equipos.add(new Equipo());
        partido = new Partido();
    }

    @Test
    void testRegistrarPartidoCorrectamente() {
        partido.registrarPartido(equipos, cancha, "2-1");
        assertEquals(cancha, partido.getCanchaAsignada());
        assertEquals("2-1", partido.getResultado());
    }

    @Test
    void testRegistrarPartidoConPocosEquipos() {
        List<Equipo> equiposInsuficientes = new ArrayList<>();
        equiposInsuficientes.add(new Equipo());
        assertThrows(IllegalArgumentException.class, () -> {
            partido.registrarPartido(equiposInsuficientes, cancha, "1-0");
        });
    }
}
