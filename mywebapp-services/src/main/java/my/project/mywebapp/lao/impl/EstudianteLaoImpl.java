package my.project.mywebapp.lao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.project.mywebapp.data.dao.EstudianteDao;
import my.project.mywebapp.data.model.Estudiante;
import my.project.mywebapp.lao.EstudianteLao;

@Service(value="estudianteLocalservice")
@Transactional
public class EstudianteLaoImpl implements EstudianteLao {
	
	@Autowired
	EstudianteDao estudianteDao;


	public Estudiante getEstudiante() {
		return new Estudiante();
	}

	@Override
	public void storeEstudiante(Estudiante estudiante) {
		//guardamos en BD
		estudianteDao.storeEstudiante(estudiante);
			
	}
	public EstudianteDao getEstudianteDao() {
		return estudianteDao;
	}

	public void setEstudianteDao(EstudianteDao estudianteDao) {
		this.estudianteDao = estudianteDao;
	}

	@Override
	public List<Estudiante> getEstudiantes() {
		return this.estudianteDao.getEstudiantes();
	}

	@Override
	public Estudiante getEstudianteById(long id) {
		return this.estudianteDao.getEstudianteById(id);
	}
	

}
