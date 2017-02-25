package my.project.mywebapp.ws.json;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.project.mywebapp.data.model.Estudiante;
import my.project.mywebapp.lao.EstudianteLao;

@RequestMapping("/json/estudiante")
@RestController
public class EstudianteWSJsonImpl implements EstudianteLao {
	
	@Autowired
	@Qualifier("estudianteLocalservice")
	EstudianteLao estudianteLao;


	@Override
	public Estudiante getEstudiante() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping("/all")
	public List<Estudiante> getEstudiantes() {
		// TODO Auto-generated method stub
		return estudianteLao.getEstudiantes();
	}

	@Override
	public void storeEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}
	
	public EstudianteLao getEstudianteLao() {
		return estudianteLao;
	}

	public void setEstudianteLao(EstudianteLao estudianteLao) {
		this.estudianteLao = estudianteLao;
	}

	@Override
	@RequestMapping("/{estudianteId}")
	public Estudiante getEstudianteById(@PathVariable("estudianteId")long id) {
	return this.estudianteLao.getEstudianteById(id);
	}

}
