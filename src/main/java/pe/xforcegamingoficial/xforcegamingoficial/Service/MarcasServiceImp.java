package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.MarcasEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Repository.MarcasRepositorty;



@Service 
public class MarcasServiceImp implements MarcasService {

    @Autowired
    private MarcasRepositorty marcarepositorio;

    @Override
    public List<MarcasEntity> findAll() {
        return marcarepositorio.findAll();
    }

    @Override
    public List<MarcasEntity> findAllCustom() {
        return marcarepositorio.findAllCustom();
    }

    @Override
    public Optional<MarcasEntity> findById(long Id) {
        return marcarepositorio.findById(Id);
    }

    @Override
    public MarcasEntity add(MarcasEntity m) {
        return marcarepositorio.save(m);
    }

    @Override
    public MarcasEntity update(MarcasEntity m) {
        MarcasEntity objmarca = marcarepositorio.getById(m.getId());
        BeanUtils.copyProperties(m, objmarca);
        return marcarepositorio.save(objmarca);
    }

    @Override
    public MarcasEntity delete(MarcasEntity m) {
        MarcasEntity objmarca= marcarepositorio.getById(m.getId());
        objmarca.setActivo(false);
        return marcarepositorio.save(objmarca);
    }
    
}
