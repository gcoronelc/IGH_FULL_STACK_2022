package farmatel.inventario.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {

    public static Connection getConnection() throws SQLException {
        
        Connection cn = null;
        
        try{
            
            //Parametros de Conexion, JDBC y base de datos
            final String driver="com.mysql.jdbc.Driver";
            final String url="jdbc:mysql://localhost:3306/dbfarmacia";;
            final String user="root";
            final String pass="";
            
            //Proceso de acceso
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection(url, user, pass);
            
        }catch (SQLException e){
            throw e;
        } catch (ClassNotFoundException ex) {
            throw new SQLException("No se encontró el driver de la base de datos.");
        } catch (InstantiationException | IllegalAccessException e) {
            throw new SQLException("No se puede acceder a la base de datos.");
        }
        return cn;
    }

}
