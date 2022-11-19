package pe.xforcegamingoficial.xforcegamingoficial.Service;



import java.util.List;
import java.util.Optional;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.CategoriaEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Repository.CategoriaRepository;



@Service 
public class CategoriaServiceImp  implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriarepositorio;

    @Override
    public List<CategoriaEntity> findAll() {
       return categoriarepositorio.findAll();
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return categoriarepositorio.findAllCustom();
    }

    @Override
    public Optional<CategoriaEntity> findById(long Id) {
        return categoriarepositorio.findById(Id);
    }

    @Override
    public CategoriaEntity add(CategoriaEntity c) {
        return categoriarepositorio.save(c);
    }

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
        CategoriaEntity objcategoria = categoriarepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objcategoria);
        return categoriarepositorio.save(objcategoria);

    }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objcategoria = categoriarepositorio.getById(c.getId());
        objcategoria.setActivo(false);
        return categoriarepositorio.save(objcategoria);
    }
    
}
