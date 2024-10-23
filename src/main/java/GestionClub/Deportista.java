package GestionClub;

public class Deportista {
	private String _idDeportista;
	private String _nombre;
	private String _apellido;
	private String _contacto;
	private Deporte _deporte;
	public ActividadDeportiva _unnamed_ActividadDeportiva_;
	public Equipo _unnamed_Equipo_;

	public String getIdDeportista() {
		return this._idDeportista;
	}

	public void setIdDeportista(String aIdDeportista) {
		this._idDeportista = aIdDeportista;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getApellido() {
		return this._apellido;
	}

	public void setApellido(String aApellido) {
		this._apellido = aApellido;
	}

	public String getContacto() {
		return this._contacto;
	}

	public void setContacto(String aContacto) {
		this._contacto = aContacto;
	}

	public void registarDeportista(List<Deportista> aDeportistas) {
		throw new UnsupportedOperationException();
	}
}