package DAO;

import DB.Conexion;
import VO.PrendaVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;


public class PrendaDAO implements IPrenda{
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    @Override
    public void insert(PrendaVO vo) {
         
        try {
            con=Conexion.SQLServer();
            ps = con.prepareStatement("insert into prendas(nombre,genero,calidad,marca,precio) values(?,?,?,?,?)");
            
            ps.setString(1, vo.getNombre());
            ps.setString(2, vo.getGenero());
            ps.setString(3, vo.getCalidad());
            ps.setString(4, vo.getMarca());
            ps.setDouble(5, vo.getPrecio());
          
            
            int rows = ps.executeUpdate();
            
            if(rows!=1){
                System.out.println("E R R O R");
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    
    }
    
    
    @Override
    public void update(PrendaVO vo) {
        try{
             con = Conexion.SQLServer();
             ps = con.prepareStatement("update prendas set nombre=?, genero=?,"
                                        + "calidad=?, marca=?, precio = ? where prendaId=?");
             ps.setString(1, vo.getNombre());
             ps.setString(2, vo.getGenero());
             ps.setString(3, vo.getCalidad());
             ps.setString(4, vo.getMarca());
             ps.setDouble(5, vo.getPrecio());
             ps.setInt(6, vo.getPrendaId());
             
             int rows = ps.executeUpdate();
             
             if(rows!=1){
                 System.out.println("E R R O R");
             }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void delete(Integer prendaId) {
        try {
             con = Conexion.SQLServer();
             ps = con.prepareStatement("delete prendas where prendaId="+ prendaId );             
             int rows = ps.executeUpdate();
             
              if(rows!=1){
                 System.out.println("E R R O R");
             }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public PrendaVO findById(Integer prendaId) {
        PrendaVO obj = new PrendaVO();
        try {
             con = Conexion.SQLServer();
             ps = con.prepareStatement("select * from prendas where prendaId = ?");
             ps.setInt(1, prendaId);
             rs = ps.executeQuery();
             if(rs.next()){
                 obj.setPrendaId(rs.getInt(1));
                 obj.setNombre(rs.getString(2));
                 obj.setGenero(rs.getString(3));
                 obj.setCalidad(rs.getString(4));
                 obj.setMarca(rs.getString(5));
                 obj.setPrecio(rs.getDouble(6));                 
             }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return obj;
    }

    @Override
    public Collection<PrendaVO> findAll() {
        Collection<PrendaVO> list = new ArrayList<>();
        
        try {
            
            con = Conexion.SQLServer();
            ps = con.prepareStatement("select * from prendas");
            rs = ps.executeQuery();
            
            while(rs.next()){
                   PrendaVO obj = new PrendaVO();
                    obj.setPrendaId(rs.getInt("prendaId"));
                    obj.setNombre(rs.getString("nombre"));
                    obj.setCalidad(rs.getString("calidad"));
                    obj.setGenero(rs.getString("genero"));
                    obj.setMarca(rs.getString("marca"));
                    obj.setPrecio(rs.getDouble("precio"));
                    
                    list.add(obj);
            }
            
            
        } catch (Exception e) {
             e.printStackTrace();
        }
        
        
        return list;
    }

    
}
