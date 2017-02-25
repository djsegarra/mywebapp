package my.project.mywebapp.lao;

import java.util.List;

import my.project.mywebapp.data.model.Estudiante;

public interface EstudianteLao {

	public Estudiante getEstudiante(); 
	public List<Estudiante> getEstudiantes();
	public void storeEstudiante(Estudiante estudiante);
	public Estudiante getEstudianteById(long id);
}
