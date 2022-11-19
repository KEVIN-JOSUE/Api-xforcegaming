package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.FacturaEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Repository.FacturaRepository;



@Service 
public class FacturaServiceImp  implements FacturaService{

    @Autowired
    private FacturaRepository facturarepositorio;

    @Override
    public List<FacturaEntity> findAll() {
        return facturarepositorio.findAll();
    }

    @Override
    public List<FacturaEntity> findAllCustom() {
        return facturarepositorio.findAllCustom();
    }

    @Override
    public Optional<FacturaEntity> findById( long id) {
        return facturarepositorio.findById(id);
    }

    @Override
    public FacturaEntity add(FacturaEntity f) {
        return facturarepositorio.save(f);
    }

    @Override
    public FacturaEntity update(FacturaEntity f) {
        FacturaEntity objfactura = facturarepositorio.getById(f.getId());
        BeanUtils.copyProperties(f, objfactura);
        return facturarepositorio.save(objfactura);
    }

    @Override
    public FacturaEntity delete(FacturaEntity f) {
        FacturaEntity objfactura = facturarepositorio.getById(f.getId());
        objfactura.setActivo(false);
        return facturarepositorio.save(objfactura);
    }
    
}
