package DAO;

import VO.PrendaVO;
import java.util.Collection;

public interface IPrenda {
    
    public abstract void insert(PrendaVO vo);
    public abstract void update(PrendaVO vo);
    public abstract void delete(Integer prendaId);
    public abstract PrendaVO findById(Integer prendaId);
    public abstract Collection<PrendaVO> findAll();
}
