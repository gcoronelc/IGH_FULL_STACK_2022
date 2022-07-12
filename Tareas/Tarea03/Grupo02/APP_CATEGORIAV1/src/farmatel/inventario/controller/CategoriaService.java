package farmatel.inventario.controller;

import farmatel.inventario.dao.CategoriaDAO;
import farmatel.inventario.model.Categoria;
import farmatel.inventario.util.Constante;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaService {
    //variable de la clase ProductosDAO
    CategoriaDAO dao;

    public CategoriaService() {
         dao = new CategoriaDAO();
    }
    
    public int CategoriaIdBuscar(String nom) throws Exception {
        return dao.BuscarIdporCategoria(nom);
    }
    
    public String CategoriaNombreBuscar(int id) throws Exception {
        return dao.BuscarNombreporCategoria(id);
    }
    
    public List<Categoria> CategoriaListar() throws Exception {
        return dao.readAll();
    }
    
    /*
        public List<Categoria> CategoriaListarCombo() throws Exception {
        return dao.readAllCombo();
    }*/

    public Categoria CategoriaBuscar(Object id) throws Exception {
        return dao.findById(id);
    }
    
         public static Categoria buscarCategoriaPorId(String codigo) {
        Categoria cate = null;
        CategoriaDAO objcu = new CategoriaDAO();

        cate = objcu.buscarPorId(codigo);
        if (cate == null) {
            mensaje("No existe categoría con ese codigo!", "error");
        }
        return cate;

    }

       public static Categoria buscarCategoriaNombre(String codigo) {
        Categoria cate = null;
      CategoriaDAO objcu = new CategoriaDAO();

        cate = objcu.buscarCategoria(codigo);
        if (cate == null) {
            mensaje("No existe categoría con este nombre!", "error");
        }
        return cate;

    }     
         
         
    public String CategoriaProcesar(Categoria cat, int opcion) throws Exception {
        String msg = "";
        switch (opcion) {
            case Constante.INS:
                dao.create(cat);
                msg = "Categoria registrada con exito";
                break;
            case Constante.UPD:
                dao.update(cat);
                msg = "Categoria actualizada con exito";
                break;
            case Constante.DEL:
                dao.delete(cat);
                msg = "Categoria eliminada con exito";
                break;
        }
        return msg;
    }
    
        private static void mensaje(String msj, String tipo) {
        JOptionPane.showMessageDialog(null, msj, tipo, JOptionPane.INFORMATION_MESSAGE);

    }
}
