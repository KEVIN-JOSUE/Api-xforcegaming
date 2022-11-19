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
import pe.xforcegamingoficial.xforcegamingoficial.Entity.MarcasEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Service.MarcasService;



@RestController
@RequestMapping("/marcas")
public class MarcasController {
    @Autowired
    private MarcasService marcaservicio;

    @GetMapping
    public List<MarcasEntity> findAll(){
        return marcaservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<MarcasEntity> findAllCustom(){
        return marcaservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<MarcasEntity> findById(@PathVariable Long id){
        return marcaservicio.findById(id);
    }

    @PostMapping
    public MarcasEntity add(@RequestBody MarcasEntity m){
        return marcaservicio.add(m);
    }

    @PutMapping("/{id}")
    public MarcasEntity update(@PathVariable Long id, @RequestBody MarcasEntity m){
        m.setId(id);
        return marcaservicio.update(m);
    }

    @DeleteMapping("/{id}")
    public MarcasEntity delete(@PathVariable Long id){
        MarcasEntity objmarca= new MarcasEntity();
        objmarca.setActivo(false);
        return marcaservicio.delete(MarcasEntity.builder().id(id).build());
    }

}
