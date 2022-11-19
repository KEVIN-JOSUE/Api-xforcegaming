package pe.xforcegamingoficial.xforcegamingoficial.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.CategoriaEntity;
@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity,Long> {
    @Query("select c from CategoriaEntity c where c.activo='1'")
    List<CategoriaEntity> findAllCustom();
    
}
