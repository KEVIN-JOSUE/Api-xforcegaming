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
import pe.xforcegamingoficial.xforcegamingoficial.Entity.FacturaEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Service.FacturaService;



@RestController
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    private FacturaService facturaservicio;

    @GetMapping 
    public List<FacturaEntity> findAll(){
        return facturaservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<FacturaEntity> findAllCustom(){
        return facturaservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<FacturaEntity> findById(@PathVariable Long id){
        return facturaservicio.findById(id);
    }

    @PostMapping
    public FacturaEntity add(@RequestBody FacturaEntity f){
        return facturaservicio.add(f);
    }

    @PutMapping("/{id}")
    public FacturaEntity update(@PathVariable Long id, @RequestBody FacturaEntity f){
        f.setId(id);
        return facturaservicio.update(f);
    }

    @DeleteMapping("/{id}")
    public FacturaEntity delete(@PathVariable Long id){
        FacturaEntity objfactura = new FacturaEntity();
        objfactura.setActivo(false);
        return facturaservicio.delete(FacturaEntity.builder().id(id).build());
    }


}
