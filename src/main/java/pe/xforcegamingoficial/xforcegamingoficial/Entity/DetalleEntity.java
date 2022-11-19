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

@Entity(name = "DetalleEntity")
@Table(name = "detalles")
public class DetalleEntity implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "articulo_id", nullable = false)
    ArticuloEntity articulos_id;

    @ManyToOne
    @JoinColumn(name = "facturas_id", nullable = false)
    FacturaEntity facturas_id;

    @Column(name = "activo")
    private boolean activo;

    
}
