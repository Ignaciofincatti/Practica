package modelo;
// Generated 20/05/2016 16:28:02 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Roles generated by hbm2java
 */
@Entity
@Table(name="roles"
    ,catalog="transito"
)
public class Roles  implements java.io.Serializable {


     private Integer idrol;
     private String nombrerol;
     private String descripcionRol;

    public Roles() {
    }

    public Roles(String nombrerol, String descripcionRol) {
       this.nombrerol = nombrerol;
       this.descripcionRol = descripcionRol;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idrol", unique=true, nullable=false)
    public Integer getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    
    @Column(name="nombrerol", nullable=false, length=100)
    public String getNombrerol() {
        return this.nombrerol;
    }
    
    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }

    
    @Column(name="descripcionRol", nullable=false, length=150)
    public String getDescripcionRol() {
        return this.descripcionRol;
    }
    
    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }




}

