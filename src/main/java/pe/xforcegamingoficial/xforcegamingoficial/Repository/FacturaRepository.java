package pe.xforcegamingoficial.xforcegamingoficial.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.FacturaEntity;

@Repository
public interface FacturaRepository  extends JpaRepository<FacturaEntity,Long>{
    @Query("select f from FacturaEntity f where f.activo='1'")
    List<FacturaEntity> findAllCustom();
    
}
