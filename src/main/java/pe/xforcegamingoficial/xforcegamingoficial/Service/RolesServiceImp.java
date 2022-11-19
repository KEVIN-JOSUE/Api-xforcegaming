package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.RolesEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Repository.RolesRepository;



@Service 
public class RolesServiceImp implements RolesService {
    @Autowired
    private RolesRepository rolrepositorio;

    @Override
    public List<RolesEntity> findAll() {
        return rolrepositorio.findAll();
    }

    @Override
    public List<RolesEntity> findAllCustom() {
        return rolrepositorio.findAllCustom();

    }

    @Override
    public Optional<RolesEntity> findById(long Id) {
        return rolrepositorio.findById(Id);
    }

    @Override
    public RolesEntity add(RolesEntity r) {
        return rolrepositorio.save(r);
    }

    @Override
    public RolesEntity update(RolesEntity r) {
        RolesEntity objrol = rolrepositorio.getById(r.getId());
        BeanUtils.copyProperties(r, objrol);
        return rolrepositorio.save(objrol);
    }

    @Override
    public RolesEntity delete(RolesEntity r) {
        RolesEntity objrol = rolrepositorio.getById(r.getId());
        objrol.setActivo(false);
        return rolrepositorio.save(objrol);
    }
    
}
