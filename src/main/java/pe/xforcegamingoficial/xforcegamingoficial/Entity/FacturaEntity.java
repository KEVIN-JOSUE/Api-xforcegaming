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

@Entity(name = "FacturaEntity")
@Table(name = "facturas")
public class FacturaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fecha_compra")
    private int fecha_compra;

    @Column(name = "cod_de_venta")
    private int cod_de_venta;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioEntity id_usuario;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private ArticuloEntity id_producto;

    @Column(name = "fecha_devolucion")
    private int fecha_devolucion;

    @Column(name = "activo")
    private boolean activo;

}
