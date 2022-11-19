package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.UsuarioEntity;



public interface UsuarioService {
    
    public List<UsuarioEntity> findAll();

    public List<UsuarioEntity> findAllCustom();


    public Optional<UsuarioEntity> findById(long Id);

    public UsuarioEntity add(UsuarioEntity u);

    public UsuarioEntity update(UsuarioEntity u);

    public UsuarioEntity delete(UsuarioEntity u);

}
