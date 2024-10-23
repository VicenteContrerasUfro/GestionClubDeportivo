package GestionClub;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private List<Deportista> _deportistas; // Lista de deportistas en el equipo
	private Entrenador _entrenador; // Entrenador asignado al equipo
	private String _nombre; // Nombre del equipo

	// Constructor para inicializar la lista de deportistas
	public Equipo() {
		this._deportistas = new ArrayList<>();
	}

	public void crearEquipo(String nombre, Entrenador entrenador, List<Deportista> deportistas) {
		if (deportistas.isEmpty()) {
			throw new IllegalArgumentException("El equipo debe tener al menos un deportista.");
		}
		this._nombre = nombre;
		this._entrenador = entrenador;
		this._deportistas.addAll(deportistas);
		for (Deportista d : deportistas) {
			d.setEquipo(this); // Asigna el equipo a cada deportista usando el método setter
		}
	}


	// Método para obtener la lista de deportistas
	public List<Deportista> getDeportistas() {
		return _deportistas;
	}

	// Método para obtener el nombre del equipo
	public String getNombre() {
		return _nombre;
	}

	// Método para asignar un entrenador al equipo
	public void asignarEntrenador(Entrenador entrenador) {
		this._entrenador = entrenador;
	}

	// Método para obtener el entrenador del equipo
	public Entrenador getEntrenador() {
		return this._entrenador;
	}

	public void asignarDeportista(Deportista deportista) {
	}
}
