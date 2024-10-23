import static org.junit.jupiter.api.Assertions.*;
import GestionClub.Cancha;
import GestionClub.Partido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CanchaTest {
    private Cancha cancha;
    private Partido partido;

    @BeforeEach
    void setUp() {
        cancha = new Cancha("Césped", "Centro Deportivo", 1000);
        partido = new Partido(); // Asegúrate de que la clase Partido tenga un constructor adecuado
    }

    @Test
    void testReservarCanchaCorrectamente() {
        cancha.reservarCancha(partido);
        assertTrue(cancha.getPartidos().contains(partido));
    }

    @Test
    void testReservarCanchaYaReservada() {
        cancha.reservarCancha(partido);
        assertThrows(IllegalArgumentException.class, () -> {
            cancha.reservarCancha(partido); // Intenta reservar el mismo partido
        });
    }

    @Test
    void testVerificarDisponibilidad() {
        assertTrue(cancha.verificarDisponibilidad(partido)); // Debe estar disponible al inicio
        cancha.reservarCancha(partido);
        assertFalse(cancha.verificarDisponibilidad(partido)); // No debe estar disponible después de reservar
    }
}

