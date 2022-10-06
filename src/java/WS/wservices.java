/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import DAO.IPrenda;
import DAO.PrendaDAO;
import VO.PrendaVO;
import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
//import javax.jws.WebParam;

@WebService(serviceName = "wservices")
public class wservices {
    
    //Instanciamos
    private IPrenda prendaDao=new PrendaDAO();
    
    @WebMethod(operationName = "prenda_listar")
    public Collection<PrendaVO> prenda_listar() {
        return prendaDao.findAll();
    }
    
    @WebMethod(operationName = "prenda_registrar")
    public void prenda_registrar(PrendaVO vo){
        prendaDao.insert(vo);
    }
    
     @WebMethod(operationName = "prenda_actualizar")
    public void prenda_actualizar(PrendaVO obj){
        prendaDao.update(obj);
    }
    
     @WebMethod(operationName = "prenda_eliminar")
    public void prenda_eliminar(Integer prendaid){
        prendaDao.delete(prendaid);
    }
    
     @WebMethod(operationName = "prenda_buscar")
    public PrendaVO prenda_buscar(Integer prendaid){
        PrendaVO obj = prendaDao.findById(prendaid);
        return obj;
    }
    
}
