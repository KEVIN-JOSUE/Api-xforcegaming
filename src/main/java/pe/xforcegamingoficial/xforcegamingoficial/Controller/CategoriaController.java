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
import pe.xforcegamingoficial.xforcegamingoficial.Entity.CategoriaEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Service.CategoriaService;




@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaservicio;

    @GetMapping
    public List<CategoriaEntity> findAll(){
        return categoriaservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<CategoriaEntity> findAllCustom(){
        return categoriaservicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CategoriaEntity> findById(@PathVariable Long id){
        return categoriaservicio.findById(id);
    }

    @PostMapping
    public CategoriaEntity add(@RequestBody CategoriaEntity c){
        return categoriaservicio.add(c);
    }

    @PutMapping("/{id}")
    public CategoriaEntity update(@PathVariable Long id, @RequestBody CategoriaEntity d){
        d.setId(id);
        return categoriaservicio.update(d);
    }

    @DeleteMapping("/{id}")
    public CategoriaEntity delete(@PathVariable Long id){
        CategoriaEntity objdistrito = new CategoriaEntity();
        objdistrito.setActivo(false);
        return categoriaservicio.delete(CategoriaEntity.builder().id(id).build());
    }

}
