package pe.xforcegamingoficial.xforcegamingoficial.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.ArticuloEntity;


@Repository 
public interface ArticuloRepository extends JpaRepository<ArticuloEntity, Long> {
    @Query("select a from ArticuloEntity a where a.activo='1'")
    List<ArticuloEntity> findAllCustom();
    
}
