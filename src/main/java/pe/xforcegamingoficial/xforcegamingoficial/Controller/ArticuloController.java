package pe.xforcegamingoficial.xforcegamingoficial.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.xforcegamingoficial.xforcegamingoficial.Entity.ArticuloEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Service.ArticuloService;



@RestController
@RequestMapping("/articulos")
public class ArticuloController {
    @Autowired
    private ArticuloService articuloservicio;

    @GetMapping
    public List<ArticuloEntity> findAll(){
        return articuloservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<ArticuloEntity> findAllCustom(){
        return articuloservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<ArticuloEntity> findById(@PathVariable Long id){
        return articuloservicio.findById(id);
    }

    @PostMapping
    public ArticuloEntity add(@RequestBody ArticuloEntity a){
        return articuloservicio.add(a);
    }

    @PutMapping("/{id}")
    public ArticuloEntity update(@PathVariable Long id, @RequestBody ArticuloEntity a){
        a.setCodigo(id);
        return articuloservicio.update(a);
    }

    @DeleteMapping("/{id}")
    public ArticuloEntity delete(@PathVariable Long id){
        ArticuloEntity objarticulo = new ArticuloEntity();
        objarticulo.setActivo(false);
        return articuloservicio.delete(ArticuloEntity.builder().codigo(id).build());
    }

}
