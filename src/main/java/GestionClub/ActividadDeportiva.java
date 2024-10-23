package GestionClub;

import java.util.ArrayList;
import java.util.List;

public class ActividadDeportiva {
	private String _nombre;
	private String _partidoAsignado; // Cambiado a Partido
	private List<Deportista> _deportistas; // Lista de deportistas asociados a la actividad
	public Club _unnamed_Club_;

	// Constructor
	public ActividadDeportiva(ActividadDeportiva nombre, String partido) {
		this._nombre = String.valueOf(nombre);
		this._partidoAsignado = partido;
		this._deportistas = new ArrayList<>(); // Inicializamos la lista de deportistas
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getPartidoAsignado() {
		return _partidoAsignado;
	}

	public void setPartidoAsignado(String partidoAsignado) {
		this._partidoAsignado = partidoAsignado;
	}

	public List<Deportista> getDeportistas() {
		return _deportistas;
	}

	public void agregarDeportista(Deportista deportista) {
		_deportistas.add(deportista);
	}
}
