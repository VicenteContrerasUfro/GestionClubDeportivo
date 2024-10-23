package GestionClub;

import java.util.List;

public class Entrenador {
	private String _idEntrenador;
	private String _nombre;
	private String _experiencia;
	private String _deporteAsignado; // Deporte que el entrenador maneja
	public Equipo _unnamed_Equipo_;

	// Constructor
	public Entrenador(int idEntrenador, String nombre, String experiencia, String deporteAsignado) {
		this._idEntrenador = String.valueOf(idEntrenador);
		this._nombre = nombre;
		this._experiencia = experiencia;
		this._deporteAsignado = deporteAsignado;
	}

	public String getIdEntrenador() {
		return this._idEntrenador;
	}

	public void setIdEntrenador(String aIdEntrenador) {
		this._idEntrenador = aIdEntrenador;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getExperiencia() {
		return this._experiencia;
	}

	public void setExperiencia(String aExperiencia) {
		this._experiencia = aExperiencia;
	}

	public String getDeporteAsignado() {
		return this._deporteAsignado;
	}

	public void setDeporteAsignado(String aDeporteAsignado) {
		this._deporteAsignado = aDeporteAsignado;
	}

	// Método para registrar entrenadores
	public void registrarEntrenador(List<Entrenador> entrenadores) {
		if (entrenadores.stream().anyMatch(e -> e.getIdEntrenador().equals(this._idEntrenador))) {
			throw new IllegalArgumentException("El entrenador ya está registrado.");
		}
		entrenadores.add(this);
	}
}
