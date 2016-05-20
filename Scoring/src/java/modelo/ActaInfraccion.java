package modelo;
// Generated 20/05/2016 16:28:02 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ActaInfraccion generated by hbm2java
 */
@Entity
@Table(name="acta_infraccion"
    ,catalog="transito"
)
public class ActaInfraccion  implements java.io.Serializable {


     private Integer id;
     private int idacta;
     private int idinfraccion;

    public ActaInfraccion() {
    }

    public ActaInfraccion(int idacta, int idinfraccion) {
       this.idacta = idacta;
       this.idinfraccion = idinfraccion;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="idacta", nullable=false)
    public int getIdacta() {
        return this.idacta;
    }
    
    public void setIdacta(int idacta) {
        this.idacta = idacta;
    }

    
    @Column(name="idinfraccion", nullable=false)
    public int getIdinfraccion() {
        return this.idinfraccion;
    }
    
    public void setIdinfraccion(int idinfraccion) {
        this.idinfraccion = idinfraccion;
    }




}


