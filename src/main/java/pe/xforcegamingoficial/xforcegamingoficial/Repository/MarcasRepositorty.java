package pe.xforcegamingoficial.xforcegamingoficial.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.MarcasEntity;


@Repository
public interface MarcasRepositorty extends JpaRepository<MarcasEntity,Long> {
    @Query("select m from  MarcasEntity m where m.activo='1'")
    List<MarcasEntity> findAllCustom();

    
}
