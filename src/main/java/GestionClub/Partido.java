package GestionClub;

import java.util.List;

public class Partido {
	private List<Equipo> _equipos;
	private Cancha _canchaAsignada;
	private String _resultado;
	public Equipo _unnamed_Equipo_;
	public Cancha _unnamed_Cancha_;

	public List<Equipo> getEquipos() {
		throw new UnsupportedOperationException();
	}

	public void setEquipos(List<Equipo> aEquipos) {
		throw new UnsupportedOperationException();
	}

	public Cancha getCanchaAsignada() {
		return this._canchaAsignada;
	}

	public void setCanchaAsignada(Cancha aCanchaAsignada) {
		this._canchaAsignada = aCanchaAsignada;
	}

	public String getResultado() {
		return this._resultado;
	}

	public void setResultado(String aResultado) {
		this._resultado = aResultado;
	}

	public void registrarPartido(List<Equipo> aEquipos, Cancha aCancha, String aResultado) {
		throw new UnsupportedOperationException();
	}

	public void asignarResultado(String aResultado) {
		throw new UnsupportedOperationException();
	}
}