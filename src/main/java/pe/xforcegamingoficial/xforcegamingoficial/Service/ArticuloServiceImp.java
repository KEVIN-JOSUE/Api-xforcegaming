package pe.xforcegamingoficial.xforcegamingoficial.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.ArticuloEntity;


import pe.xforcegamingoficial.xforcegamingoficial.Repository.ArticuloRepository;

@Service
public class ArticuloServiceImp  implements ArticuloService{

    @Autowired
    private ArticuloRepository articulorepositorio;

    @Override
    public List<ArticuloEntity> findAll() {
       return articulorepositorio.findAll();
    }

    @Override
    public List<ArticuloEntity> findAllCustom() {
        return articulorepositorio.findAllCustom();

    }

    @Override
    public Optional<ArticuloEntity> findById(long Id) {
        return articulorepositorio.findById(Id);
    }

    @Override
    public ArticuloEntity add(ArticuloEntity a) {
        return articulorepositorio.save(a);
    }

    @Override
    public ArticuloEntity update(ArticuloEntity a) {
        ArticuloEntity objarticulo = articulorepositorio.getById(a.getCodigo());
        BeanUtils.copyProperties(a, articulorepositorio);
        return articulorepositorio.save(objarticulo);
    }

    @Override
    public ArticuloEntity delete(ArticuloEntity a) {
        ArticuloEntity objarticulo = articulorepositorio.getById(a.getCodigo());
        objarticulo.setActivo(false);
        return articulorepositorio.save(objarticulo);
    }
    
}
