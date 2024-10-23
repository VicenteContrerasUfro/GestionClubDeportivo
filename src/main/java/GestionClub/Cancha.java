package GestionClub;

import java.util.Vector;
import GestionClub.Partido;

public class Cancha {
	private String _superficie;
	private String _ubicacionClub;
	private int _capacidadEspectadores;
	public Vector<Partido> _unnamed_Partido_ = new Vector<Partido>();

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
		throw new UnsupportedOperationException();
	}

	public boolean verificarDisponibilidad() {
		throw new UnsupportedOperationException();
	}
}