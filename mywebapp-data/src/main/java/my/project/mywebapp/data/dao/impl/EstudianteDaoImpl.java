package my.project.mywebapp.data.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import my.project.mywebapp.data.dao.EstudianteDao;
import my.project.mywebapp.data.model.Estudiante;

@Repository("estudianteDao")
public class EstudianteDaoImpl extends BaseDao implements EstudianteDao {

	@Override
	public void storeEstudiante(Estudiante estudiante) {
		this.getSession().persist(estudiante);
		
	}
	
	public List<Estudiante> getEstudiantes(){
		return this.getSession().createQuery("from Estudiante").list();
	}

	@Override
	public Estudiante getEstudianteById(long id) {
		List<Estudiante> lEstudiantes = this.getSession().createQuery("from Estudiante where id = :id").setParameter("id", id).list();
		if(lEstudiantes.size()== 0) return null;
		else return lEstudiantes.get(0);
	}

}
