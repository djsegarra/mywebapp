package my.project.mywebapp.lao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.project.mywebapp.data.dao.EstudianteDao;
import my.project.mywebapp.data.model.Estudiante;
import my.project.mywebapp.lao.EstudianteLao;

@Service
@Transactional
public class EstudianteLaoImpl implements EstudianteLao {
	@Autowired
	EstudianteDao estudianteDao;


	public Estudiante getEstudiante() {
		return new Estudiante();
	}

	@Override
	public void storeEstudiante(Estudiante estudiante) {
		System.out.println(estudiante);
		//guardamos en BD
		estudianteDao.storeEstudiante(estudiante);
			
	}
	public EstudianteDao getEstudianteDao() {
		return estudianteDao;
	}

	public void setEstudianteDao(EstudianteDao estudianteDao) {
		this.estudianteDao = estudianteDao;
	}
	

}
