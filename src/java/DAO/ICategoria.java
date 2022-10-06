package DAO;

import VO.CategoriaVO;
import java.util.Collection;

public interface ICategoria {
    
    public abstract void insert(CategoriaVO vo);
    public abstract void update(CategoriaVO vo);
    public abstract void delete(int categoriaId);
    public abstract CategoriaVO findById(int categoriaId);
    public abstract Collection<CategoriaVO> findAll();

    public abstract CategoriaVO findByName(String nombre);
}
