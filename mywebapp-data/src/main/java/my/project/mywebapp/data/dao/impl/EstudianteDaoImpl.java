package my.project.mywebapp.data.dao.impl;

import org.springframework.stereotype.Repository;

import my.project.mywebapp.data.dao.EstudianteDao;
import my.project.mywebapp.data.model.Estudiante;

@Repository("estudianteDao")
public class EstudianteDaoImpl extends BaseDao implements EstudianteDao {

	@Override
	public void storeEstudiante(Estudiante estudiante) {
		this.getSession().persist(estudiante);
		
	}

}
