package my.project.mywebapp.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class Dbconfig  implements ApplicationListener<ContextRefreshedEvent>{

	private static boolean daosCargados;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (!daosCargados){
			System.out.println("Me ejecuto al arrancar!!");
			this.daosCargados = true;
		}else{
			System.out.println("No ejecuto nada");
		}
		
		
	}
	

}
