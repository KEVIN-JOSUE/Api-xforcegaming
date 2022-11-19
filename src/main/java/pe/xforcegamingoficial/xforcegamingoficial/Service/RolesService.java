package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.RolesEntity;



public interface RolesService {
    
    public List<RolesEntity> findAll();


    public List<RolesEntity> findAllCustom();


    public Optional<RolesEntity> findById(long Id);



    public RolesEntity add(RolesEntity r);


    public RolesEntity update(RolesEntity r);

    public RolesEntity delete(RolesEntity r);
}
