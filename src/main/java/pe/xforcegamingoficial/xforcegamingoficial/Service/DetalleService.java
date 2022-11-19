package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.DetalleEntity;



public interface DetalleService {

    public List<DetalleEntity> findAll();

    public List<DetalleEntity> findAllCustom();


    public Optional<DetalleEntity> findById(long Id);


    public DetalleEntity add(DetalleEntity d);

    public DetalleEntity update(DetalleEntity d);


    public DetalleEntity delete(DetalleEntity d);

    
}
