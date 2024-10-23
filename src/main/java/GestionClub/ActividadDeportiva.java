package GestionClub;

import java.util.Vector;
import GestionClub.Deportista;

public class ActividadDeportiva {
	private String _nombre;
	private Object _partidoAsignado = Partido;
	private List<Deportista> _deportistas;
	public Club _unnamed_Club_;
	public Vector<Deportista> _unnamed_Deportista_ = new Vector<Deportista>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}
}