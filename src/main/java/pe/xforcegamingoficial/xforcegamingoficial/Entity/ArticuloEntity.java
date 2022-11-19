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

@Entity(name = "ArticuloEntity")
@Table(name = "articulos")
public class ArticuloEntity implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    
    private long codigo;
    @Column (name = "nombre")
    private String nombre;
    
    @Column (name = "url")
    private  String url;
    
    @Column(name = "precio")
    private double precio;
    @Column(name = "cantidad")
    private double cantidad;
    @Column(name = "garantia")
    private String garantia;
    
    

    @ManyToOne
    @JoinColumn(name = "categoria_id",nullable = false)
    private CategoriaEntity categoria_id;
    
    @ManyToOne
    @JoinColumn(name = "marcas_id", nullable = false)
    private MarcasEntity marcas_id;

    @Column(name = "activo")
    private boolean activo;
    
}
