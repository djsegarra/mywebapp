package my.project.mywebapp.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "estudiante")
public class Estudiante {
	@Id
	@TableGenerator(name = "secuencia", table = "sequences", pkColumnName = "seq_name", valueColumnName = "seq_count", pkColumnValue = "id")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "secuencia")
	private long id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellido", nullable = false)
	private String apellido;
	
	@Column(name = "nivelDeEstudios", nullable = false)
	private String nivelDeEstudios;

	public Estudiante() {
	}

	public Estudiante(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNivelDeEstudios() {
		return nivelDeEstudios;
	}

	public void setNivelDeEstudios(String nivelDeEstudios) {
		this.nivelDeEstudios = nivelDeEstudios;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nivelDeEstudios="
				+ nivelDeEstudios + "]";
	}

}
