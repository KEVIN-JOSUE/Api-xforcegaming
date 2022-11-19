package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.DetalleEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Repository.DetalleRepoditory;



@Service 
public class DetalleServiceImp implements DetalleService {

    @Autowired
    private DetalleRepoditory detallerepositorio;

    @Override
    public List<DetalleEntity> findAll() {
        return detallerepositorio.findAll();
    }

    @Override
    public List<DetalleEntity> findAllCustom() {
       return detallerepositorio.findAllCustom();
    }

    @Override
    public Optional<DetalleEntity> findById(long Id) {
        return detallerepositorio.findById(Id);
    }

    @Override
    public DetalleEntity add(DetalleEntity d) {
        return detallerepositorio.save(d);
    }

    @Override
    public DetalleEntity update(DetalleEntity d) {
        DetalleEntity objdetalle=detallerepositorio.getById(d.getId());
        BeanUtils.copyProperties(d, objdetalle);
        return detallerepositorio.save(objdetalle);
    }

    @Override
    public DetalleEntity delete(DetalleEntity d) {
        DetalleEntity objdetalle= detallerepositorio.getById(d.getId());
        objdetalle.setActivo(false);
        return detallerepositorio.save(objdetalle);
    }
    
}
