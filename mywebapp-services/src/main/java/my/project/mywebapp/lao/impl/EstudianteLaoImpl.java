package my.project.mywebapp.lao.impl;

import org.springframework.stereotype.Service;

import my.project.mywebapp.data.model.Estudiante;
import my.project.mywebapp.lao.EstudianteLao;

@Service
public class EstudianteLaoImpl implements EstudianteLao {

	public Estudiante getEstudiante() {
		return new Estudiante();
	}

}
