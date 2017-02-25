package my.project.mywebapp.data.dao;

import java.util.List;

import my.project.mywebapp.data.model.Estudiante;

public interface EstudianteDao {
	
	public void storeEstudiante(Estudiante estudiante);
	public List<Estudiante> getEstudiantes();
	public Estudiante getEstudianteById(long id);

}
