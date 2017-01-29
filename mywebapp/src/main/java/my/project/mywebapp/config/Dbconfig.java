package my.project.mywebapp.config;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

public class Dbconfig implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private ApplicationContext appContext;

	private static boolean dbActualizada;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (!dbActualizada) {
			// cargamos el dataSource para abrir una conexion
			DataSource dataSource = (DataSource) appContext.getBean("dataSource");
			try {
				//si no existe la tabla version ejecutamos script de creacion de tablas
				if (!isTableCreated("version", dataSource.getConnection())) {
					System.out.println("Creando tablas....");
					ClassPathResource resource = new ClassPathResource("/sql/createTables.sql");
					ScriptUtils.executeSqlScript(dataSource.getConnection(), new EncodedResource(resource, "UTF-8"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			this.dbActualizada = true;

		} else {
			System.out.println("No ejecuto nada");
		}

	}

	private boolean isTableCreated(String tableName, Connection connection) throws SQLException {
		DatabaseMetaData meta = connection.getMetaData();
		ResultSet res = meta.getTables(null, null, tableName, new String[] { "TABLE" });
		return res.first();
//		return res.getString("TABLE_NAME").equalsIgnoreCase(tableName);
//		while (res.next()) {
//			System.out.println("   " + res.getString("TABLE_CAT") + ", " + res.getString("TABLE_SCHEM") + ", "
//					+ res.getString("TABLE_NAME") + ", " + res.getString("TABLE_TYPE") + ", "
//					+ res.getString("REMARKS"));
//		}
	//return true;
	}

}
