package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.FacturaEntity;



public interface FacturaService {

    public List<FacturaEntity> findAll();

    public List<FacturaEntity> findAllCustom();

    public Optional<FacturaEntity> findById(long Id);

    public FacturaEntity add(FacturaEntity f);

    public FacturaEntity update(FacturaEntity f);

    public FacturaEntity delete(FacturaEntity f);
    
}
