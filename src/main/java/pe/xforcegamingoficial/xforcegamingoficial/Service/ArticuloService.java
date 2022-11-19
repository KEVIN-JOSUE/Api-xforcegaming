package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.ArticuloEntity;



public interface ArticuloService {
    public List<ArticuloEntity> findAll();

    public  List<ArticuloEntity> findAllCustom();


    public Optional<ArticuloEntity> findById(long Id);


    public ArticuloEntity add(ArticuloEntity a);



    public ArticuloEntity update(ArticuloEntity a);


    public ArticuloEntity delete(ArticuloEntity a);




    
}
