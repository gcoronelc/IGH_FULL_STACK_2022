package farmatel.inventario.dao;

import farmatel.inventario.database.AccesoDB;
import farmatel.inventario.model.Categoria;
import farmatel.inventario.service.ICrudService;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaDAO implements ICrudService<Categoria> {

    Connection cn;
    Statement stm;
    ResultSet rs;
    String sql;
    Categoria cat;
    CallableStatement cs = null;
    PreparedStatement ps;

    @Override
    public void create(Categoria x) throws Exception {
        int var = 0;
        try {
            cn = AccesoDB.getConnection();
            sql = "{call sp_AgregarCategoria(?,?)}";
            cn.setAutoCommit(false);
            cs = cn.prepareCall(sql);
            //Preparamos los valores de los parametro
            cs.setInt(1,x.getIdCategoria()); 
            cs.setString(2, x.getNombre());
            //Ejecuta el comando insert
            cs.executeUpdate();
            cs.close();
            cn.commit();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"EL ID de la categoría ya está registrado.");
            throw e;
        } finally {
            try {
                cn.close();
            } catch (SQLException e1) {
                throw e1;
            }
        }
    }

    @Override
    public void update(Categoria x) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "update categoria set NombreCat=? where IDCat=?";
            ps = cn.prepareStatement(sql);
            //Preparar los valores de los parametros
            ps.setString(1, x.getNombre());
            ps.setInt(2, x.getIdCategoria());
            //Ejecuta comando update
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            throw e;
        } finally {
            try {
                cn.close();

            } catch (SQLException e1) {
            }
        }
    }

    @Override
    public void delete(Categoria x) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "delete from categoria where IDCat=? ";
            ps = cn.prepareStatement(sql);
            //Preparar los valores de los parametros
            ps.setInt(1, x.getIdCategoria());
            //Ejecuta el comando delete
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new Exception("No se puede eliminar ya que esta categoría se encuentra en uso");
        } finally {
            try {
                cn.close();
            } catch (SQLException e1) {
            }
        }
    }

    @Override
    public Categoria findById(Object x) throws Exception {
        cat = null;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("Select * from categoria where IDCat=?");
            //valor del parametro
            ps.setInt(1, (Integer) x);
            rs = ps.executeQuery();
            if (rs.next()) {
                cat = new Categoria(rs.getInt(1), rs.getString(2));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return cat;
    }

    @Override
    public List<Categoria> readAll() throws Exception {
        List<Categoria> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from categoria order by 1");
            rs = ps.executeQuery();
            cat = null;
            while (rs.next()) {
                cat = new Categoria(rs.getInt(1), rs.getString(2));
                lista.add(cat);
            }
            rs.close();
            ps.close();;
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;

    }

    /*  public List<Categoria> readAllCombo() throws Exception {
         List<Categoria> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            stm = cn.createStatement();
            rs = stm.executeQuery("select IDCat,IDCat from categoria");
            cat = null;
            while (rs.next()) {
                cat = new Categoria(rs.getInt(1), rs.getString(2));
                lista.add(cat);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;
    
}*/
    public Categoria buscarPorId(String codigo) {
        Categoria cate = null;
        String sql = "select  IDCat, NombreCat"
                + " from categoria where IDCat=?";

        try {
            Connection cn = AccesoDB.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                cate = new Categoria();
                cate.setIdCategoria(rs.getInt(1));
                cate.setNombre(rs.getString(2));
                ;
            }
            cn.close();
            pstm.close();
            rs.close();
        } catch (SQLException ex) {
            return null;
        }
        return cate;
    }

    public Categoria buscarCategoria(String codigo) {
        Categoria cate = null;
        String sql = "select  IDCat, NombreCat"
                + " from categoria where NombreCat=?";

        try {
            Connection cn = AccesoDB.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                cate = new Categoria();
                cate.setIdCategoria(rs.getInt(1));
                cate.setNombre(rs.getString(2));

            }
            cn.close();
            pstm.close();
            rs.close();
        } catch (SQLException ex) {
            return null;
        }
        return cate;
    }

    public int BuscarIdporCategoria(String nom) throws SQLException {
        int idcat = 0;
        try {
            cn = AccesoDB.getConnection();
            stm = cn.createStatement();
            rs = stm.executeQuery("select IDCat from categoria where NombreCat='" + nom + "'");

            while (rs.next()) {
                idcat = rs.getInt(1);
            }

            rs.close();
            stm.close();

        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return idcat;
    }

    public String BuscarNombreporCategoria(int id) throws SQLException {
        String nomcat = "";
        try {
            cn = AccesoDB.getConnection();
            stm = cn.createStatement();
            rs = stm.executeQuery("select NombreCat from categoria where IDCat='" + id + "'");

            while (rs.next()) {
                nomcat = rs.getString(1);
            }

            rs.close();
            stm.close();

        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return nomcat;
    }

}
