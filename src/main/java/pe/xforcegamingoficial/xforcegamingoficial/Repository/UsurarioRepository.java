package pe.xforcegamingoficial.xforcegamingoficial.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.UsuarioEntity;


@Repository
public interface UsurarioRepository extends JpaRepository<UsuarioEntity,Long> {
    @Query("select u from UsuarioEntity u where u.activo='1'")
    List<UsuarioEntity> findAllCustom();
    
}
