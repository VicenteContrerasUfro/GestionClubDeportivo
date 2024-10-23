package GestionClub;

import java.util.Vector;
import GestionClub.ActividadDeportiva;

public class Club {
	private String _nombre;
	private String _ubicacion;
	private List<ActividadDeportiva> _actividades;
	public Vector<ActividadDeportiva> _unnamed_ActividadDeportiva_ = new Vector<ActividadDeportiva>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getUbicacion() {
		return this._ubicacion;
	}

	public void setUbicacion(String aUbicacion) {
		this._ubicacion = aUbicacion;
	}

	public void agregarActividad(ActividadDeportiva aActividad) {
		throw new UnsupportedOperationException();
	}

	public void eliminarActividad(ActividadDeportiva aActividad) {
		throw new UnsupportedOperationException();
	}

	public List<ActividadDeportiva> listarActividades() {
		throw new UnsupportedOperationException();
	}
}