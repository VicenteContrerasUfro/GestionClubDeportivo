package GestionClub;

public class Entrenador {
	private String _idEntrenador;
	private String _nombre;
	private String _experiencia;
	public Equipo _unnamed_Equipo_;

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

	public void registrarEntrenador(Entrenador aEntrenadores) {
		throw new UnsupportedOperationException();
	}
}