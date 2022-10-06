package VO;

import java.util.ArrayList;
import java.util.Collection;

public class CategoriaVO {
    
    private int categoriaId;
    private String nombre;
    private String descripcion;
    
    //OneToMany
    private Collection<PrendaVO> itemsPrenda=new ArrayList<>();
    

    public CategoriaVO() {
    }

    public CategoriaVO(int categoriaId, String nombre, String descripcion) {
        this.categoriaId = categoriaId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    //add vo
    public void addPrendaVo(PrendaVO vo){
    
            itemsPrenda.add(vo);
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<PrendaVO> getItemsPrenda() {
        return itemsPrenda;
    }

    public void setItemsPrenda(Collection<PrendaVO> itemsPrenda) {
        this.itemsPrenda = itemsPrenda;
    }
        
}
