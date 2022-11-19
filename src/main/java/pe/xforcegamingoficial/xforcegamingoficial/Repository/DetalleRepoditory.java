package pe.xforcegamingoficial.xforcegamingoficial.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.DetalleEntity;


@Repository
public interface DetalleRepoditory extends JpaRepository<DetalleEntity,Long>{
    @Query("select d from DetalleEntity d where d.activo='1'")
    List<DetalleEntity> findAllCustom();
    
}
