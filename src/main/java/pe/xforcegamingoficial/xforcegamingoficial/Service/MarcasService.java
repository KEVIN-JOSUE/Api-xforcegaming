package pe.xforcegamingoficial.xforcegamingoficial.Service;


import java.util.List;
import java.util.Optional;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.MarcasEntity;



public interface MarcasService {
    public List<MarcasEntity> findAll();


    public List<MarcasEntity> findAllCustom();

    public Optional<MarcasEntity> findById(long Id);


    public MarcasEntity add(MarcasEntity m);

    public MarcasEntity update(MarcasEntity m);

    public MarcasEntity delete(MarcasEntity m);


    
}
