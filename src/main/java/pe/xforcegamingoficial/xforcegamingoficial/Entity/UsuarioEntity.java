package pe.xforcegamingoficial.xforcegamingoficial.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "UsuarioEntity")
@Table(name = "usuarios")
public class UsuarioEntity  implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "nombres")
    private String nombres;
    
    @Column(name = "apellidos")
    private String apellidos;
    
    @Column(name = "usuario")
    private String usuario;
    
    @Column(name = "telefono")
    private long telefono;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "fecha_creacion")
    private int fecha_creacion;
    
    @Column(name = "activo")
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name = "rol_id", nullable=false)
    private RolesEntity rol_id;

    
}
