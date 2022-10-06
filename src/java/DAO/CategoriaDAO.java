package DAO;

import DB.Conexion;
import VO.CategoriaVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;



public class CategoriaDAO implements ICategoria{

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    @Override
    public void insert(CategoriaVO vo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(CategoriaVO vo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int categoriaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaVO findById(int categoriaId) {
        
        CategoriaVO vo=null;
        
             
        try {
            
            con = Conexion.SQLServer();
            ps = con.prepareStatement("select * from categorias where categoriaId=?");
            ps.setInt(1,categoriaId);
            rs = ps.executeQuery();
            
          if(rs.next()){
                  
                    vo = new CategoriaVO();
                    vo.setCategoriaId(rs.getInt("categoriaId"));
                    vo.setNombre(rs.getString("nombre"));
                                        
            }
            
            
        } catch (Exception e) {
             e.printStackTrace();
        }
        
        
        return vo;
    }

    @Override
    public Collection<CategoriaVO> findAll() {
        
        Collection<CategoriaVO> list=new ArrayList<>();
        
             
        try {
            
            con = Conexion.SQLServer();
            ps = con.prepareStatement("select * from categorias");
            rs = ps.executeQuery();
            
            while(rs.next()){
                   CategoriaVO obj = new CategoriaVO();
                   
                    obj.setCategoriaId(rs.getInt("categoriaId"));
                    obj.setNombre(rs.getString("nombre"));
                    obj.setDescripcion(rs.getString("descripcion"));
                                      
                    list.add(obj);
            }
            
            
        } catch (Exception e) {
             e.printStackTrace();
        }
        
        return list;
    }

    
    
    @Override
    public CategoriaVO findByName(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
