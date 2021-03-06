package modelo;
// Generated 20/05/2016 16:28:02 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Infraccion generated by hbm2java
 */
@Entity
@Table(name="infraccion"
    ,catalog="transito"
)
public class Infraccion  implements java.io.Serializable {


     private int idinfraccion;
     private String articulo;
     private String descripcion;

    public Infraccion() {
    }

    public Infraccion(int idinfraccion, String articulo, String descripcion) {
       this.idinfraccion = idinfraccion;
       this.articulo = articulo;
       this.descripcion = descripcion;
    }
   
     @Id 

    
    @Column(name="idinfraccion", unique=true, nullable=false)
    public int getIdinfraccion() {
        return this.idinfraccion;
    }
    
    public void setIdinfraccion(int idinfraccion) {
        this.idinfraccion = idinfraccion;
    }

    
    @Column(name="articulo", nullable=false, length=100)
    public String getArticulo() {
        return this.articulo;
    }
    
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    
    @Column(name="descripcion", nullable=false, length=65535)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


