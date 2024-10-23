package GestionClub;

import java.util.ArrayList;
import java.util.List;

public class Cancha {
	private String _superficie;
	private String _ubicacionClub;
	private int _capacidadEspectadores;
	private List<Partido> partidosReservados; // Lista para almacenar partidos reservados

	public Cancha(String superficie, String ubicacionClub, int capacidadEspectadores) {
		this._superficie = superficie;
		this._ubicacionClub = ubicacionClub;
		this._capacidadEspectadores = capacidadEspectadores;
		this.partidosReservados = new ArrayList<>();
	}

	public String getSuperficie() {
		return this._superficie;
	}

	public void setSuperficie(String aSuperficie) {
		this._superficie = aSuperficie;
	}

	public String getUbicacionClub() {
		return this._ubicacionClub;
	}

	public void setUbicacionClub(String aUbicacionClub) {
		this._ubicacionClub = aUbicacionClub;
	}

	public int getCapacidadEspectadores() {
		return this._capacidadEspectadores;
	}

	public void setCapacidadEspectadores(int aCapacidadEspectadores) {
		this._capacidadEspectadores = aCapacidadEspectadores;
	}

	public void reservarCancha(Partido aPartido) {
		if (verificarDisponibilidad(aPartido)) {
			partidosReservados.add(aPartido); // Agregar el partido a la lista si está disponible
		} else {
			throw new IllegalArgumentException("La cancha ya está reservada para este partido.");
		}
	}

	// Verifica si hay disponibilidad para un partido
	public boolean verificarDisponibilidad(Partido aPartido) {
		return !partidosReservados.contains(aPartido); // Retorna true si no está reservado
	}

	public List<Partido> getPartidos() {
		return partidosReservados; // Devuelve la lista de partidos reservados
	}
}
