package unidad1.domain;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contacto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
    private String nombre;
    private String apodo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion = null;
    
    public Contacto() {
    	super();
    }
    public Contacto(String id,String nombre,String apodo,String correo) {
    	this.id= id;
    	this.nombre = nombre;
    	this.apodo = apodo;
    }
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion= fechaCreacion;
	}
	public Date getFechaCreacion(){
		return this.fechaCreacion;
	}
}
   
