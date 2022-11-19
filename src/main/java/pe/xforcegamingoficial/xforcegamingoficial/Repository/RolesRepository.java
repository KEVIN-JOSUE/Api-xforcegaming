package pe.xforcegamingoficial.xforcegamingoficial.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import pe.xforcegamingoficial.xforcegamingoficial.Entity.RolesEntity;

@Repository
public interface RolesRepository extends JpaRepository<RolesEntity,Long> {
    @Query("select r from RolesEntity r where r.activo='1'")
    List<RolesEntity> findAllCustom();
    
}
