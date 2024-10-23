package GestionClub;

import java.util.List;

public class Deportista {
	private String _idDeportista;
	private String _nombre;
	private String _apellido;
	private String _contacto;
	private ActividadDeportiva _actividadDeportiva; // Asumimos que cada deportista está en una actividad deportiva
	private Equipo _equipo; // Asignamos el equipo correspondiente al deportista

	public Deportista(String idDeportista, String nombre, String apellido, String contacto, ActividadDeportiva deporte) {
		this._idDeportista = String.valueOf(idDeportista);
		this._nombre = nombre;
		this._apellido = apellido;
		this._contacto = contacto;
		this._actividadDeportiva = new ActividadDeportiva(deporte, null); // Ajusta según tu diseño
	}

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

	// Método para registrar deportista (puedes implementarlo)
	public void registrarDeportista(List<Deportista> aDeportistas) {
		// Implementación de registro
	}

	// Getter y Setter para Equipo
	public Equipo getEquipo() {
		return _equipo;
	}

	public void setEquipo(Equipo equipo) {
		this._equipo = equipo;
	}
}


