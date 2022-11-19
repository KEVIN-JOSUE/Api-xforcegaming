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
import pe.xforcegamingoficial.xforcegamingoficial.Entity.UsuarioEntity;
import pe.xforcegamingoficial.xforcegamingoficial.Service.UsuarioService;



@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioservicio;


    @GetMapping
    public List<UsuarioEntity> findAll(){
        return usuarioservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<UsuarioEntity> findAllCustom(){
        return usuarioservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioEntity> findById(@PathVariable Long id){
        return usuarioservicio.findById(id);
    }

    @PostMapping
    public UsuarioEntity add(@RequestBody UsuarioEntity u){
        return usuarioservicio.add(u);
    }

    @PutMapping("/{id}")
    public UsuarioEntity update(@PathVariable Long id, @RequestBody UsuarioEntity u){
        u.setId(id);
        return usuarioservicio.update(u);
    }

    @DeleteMapping("/{id}")
    public UsuarioEntity delete(@PathVariable Long id){
        UsuarioEntity objusuario = new UsuarioEntity();
        objusuario.setActivo(false);
        return usuarioservicio.delete(UsuarioEntity.builder().id(id).build());
    }

}
