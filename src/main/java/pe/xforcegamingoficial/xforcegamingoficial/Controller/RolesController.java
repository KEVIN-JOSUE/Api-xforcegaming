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
import pe.xforcegamingoficial.xforcegamingoficial.Entity.RolesEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Service.RolesService;



@RestController
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    private RolesService rolservicio;

    @GetMapping
    public List<RolesEntity> findAll() {
        return rolservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<RolesEntity> findAllCustom() {
        return rolservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<RolesEntity> findById(@PathVariable Long id) {
        return rolservicio.findById(id);
    }

    @PostMapping
    public RolesEntity add(@RequestBody RolesEntity r) {
        return rolservicio.add(r);
    }

    @PutMapping("/{id}")
    public RolesEntity update(@PathVariable Long id, @RequestBody RolesEntity r) {
        r.setId(id);
        return rolservicio.update(r);
    }

    @DeleteMapping("/{id}")
    public RolesEntity delete(@PathVariable Long id) {
        RolesEntity objrol = new RolesEntity();
        objrol.setActivo(false);
        return rolservicio.delete(RolesEntity.builder().id(id).build());
    }

}
