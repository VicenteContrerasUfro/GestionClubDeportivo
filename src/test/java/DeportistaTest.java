import static org.junit.jupiter.api.Assertions.*;
import GestionClub.Deportista;
import GestionClub.ActividadDeportiva; // Cambiado a ActividadDeportiva
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class DeportistaTest {
    private List<Deportista> deportistas;

    @BeforeEach
    void setUp() {
        deportistas = new ArrayList<>();
    }

    @Test
    void testRegistrarDeportistaCorrectamente() {
        ActividadDeportiva actividad = new ActividadDeportiva("Fútbol", "Partido"); // Asegúrate de que esta clase esté definida
        Deportista deportista = new Deportista("1", "Juan", "Perez", "123456", actividad);
        deportista.registrarDeportista(deportistas);
        assertTrue(deportistas.contains(deportista));
    }

    @Test
    void testRegistrarDeportistaDuplicado() {
        ActividadDeportiva actividad = new ActividadDeportiva("Fútbol", "Partido");
        Deportista deportista = new Deportista("1", "Juan", "Perez", "123456", actividad);
        deportista.registrarDeportista(deportistas);
        assertThrows(IllegalArgumentException.class, () -> {
            Deportista deportistaDuplicado = new Deportista("1", "Juan", "Perez", "654321", actividad);
            deportistaDuplicado.registrarDeportista(deportistas);
        });
    }
}
