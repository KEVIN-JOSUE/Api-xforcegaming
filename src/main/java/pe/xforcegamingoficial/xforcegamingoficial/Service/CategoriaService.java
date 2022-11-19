package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.CategoriaEntity;



public interface CategoriaService {

    public List<CategoriaEntity> findAll();

    public List<CategoriaEntity> findAllCustom();

    public Optional<CategoriaEntity> findById( long id);


    public CategoriaEntity add(CategoriaEntity c);


    public CategoriaEntity update(CategoriaEntity c);



    public CategoriaEntity delete(CategoriaEntity c);
    
}
