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
import pe.xforcegamingoficial.xforcegamingoficial.Entity.DetalleEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Service.DetalleService;



@RestController
@RequestMapping("/detalles")
public class DetalleController {
    @Autowired
    private DetalleService detalleservicio;

    @GetMapping
    public List<DetalleEntity> findAll(){
        return detalleservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<DetalleEntity> findAllCustom(){
        return detalleservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<DetalleEntity> findById(@PathVariable Long id){
        return detalleservicio.findById(id);
    }


    @PostMapping
    public DetalleEntity add(@RequestBody DetalleEntity d){
        return detalleservicio.add(d);
    }

    @PutMapping("/{id}")
    public DetalleEntity update(@PathVariable Long id, @RequestBody DetalleEntity d){
        d.setId(id);
        return detalleservicio.update(d);
    }

    @DeleteMapping("/{id}")
    public DetalleEntity delete(@PathVariable long id){
        DetalleEntity objdetalle = new DetalleEntity();
        objdetalle.setActivo(false);
        return detalleservicio.delete(DetalleEntity.builder().id(id).build());
    }
}
