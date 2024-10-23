package GestionClub;

import java.util.Vector;
import GestionClub.Deportista;

public class Equipo {
	private List<Deportista> _deportistas;
	private Entrenador _entrenador;
	public Vector<Deportista> _unnamed_Deportista_ = new Vector<Deportista>();
	public Entrenador _unnamed_Entrenador_;
	public Partido _unnamed_Partido_;

	public Deportista getDeportistas() {
		throw new UnsupportedOperationException();
	}

	public void setDeportistas(Deportista aDeportistas) {
		throw new UnsupportedOperationException();
	}

	public Entrenador getEntrenador() {
		return this._entrenador;
	}

	public void setEntrenador(Entrenador aEntrenador) {
		this._entrenador = aEntrenador;
	}

	public void crearEquipo(String aNombre, List<Deportista> aDeportistas, Entrenador aEntrenador) {
		throw new UnsupportedOperationException();
	}

	public void asignarDeportista(Deportista aDeportista) {
		throw new UnsupportedOperationException();
	}

	public void asignarEntrenador(Entrenador aEntrenador) {
		throw new UnsupportedOperationException();
	}
}