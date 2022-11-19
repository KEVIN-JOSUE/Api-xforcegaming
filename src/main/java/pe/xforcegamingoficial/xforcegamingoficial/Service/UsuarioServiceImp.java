package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.UsuarioEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Repository.UsurarioRepository;



@Service 
public class UsuarioServiceImp  implements UsuarioService{

    @Autowired
    private UsurarioRepository usuariorepositorio;

    @Override
    public List<UsuarioEntity> findAll() {
        return usuariorepositorio.findAll();
    }

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return usuariorepositorio.findAllCustom();
    }

    @Override
    public Optional<UsuarioEntity> findById(long Id) {
        return usuariorepositorio.findById(Id);
    }

    @Override
    public UsuarioEntity add(UsuarioEntity u) {
        return usuariorepositorio.save(u);
    }

    @Override
    public UsuarioEntity update(UsuarioEntity u) {
        UsuarioEntity objusuario = usuariorepositorio.getById(u.getId());
        BeanUtils.copyProperties(u, objusuario);
        return usuariorepositorio.save(objusuario);
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity u) {
        UsuarioEntity objusuario= usuariorepositorio.getById(u.getId());
        objusuario.setActivo(false);
        return usuariorepositorio.save(objusuario);
    }
    
}
