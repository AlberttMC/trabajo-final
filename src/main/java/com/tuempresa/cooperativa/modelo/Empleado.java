package com.tuempresa.cooperativa.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Empleado {
	@Id
    @Hidden // La propiedad no se muestra al usuario. Es un identificador interno
    @GeneratedValue(generator="system-uuid") // Identificador Universal Único (1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;
	
	@Column()
	String cedula;
	
	@Column()
	String nombre;
	
	@Column()
	String apellido;
	
	@Column()
	String correo;
	
	@Column()
	String telefono;
	
	@Required
	@Column()
	private TipoEmpleado tipoEmpleado;
	public enum TipoEmpleado {Conductor, Ayudante}
	
	@Column()
	Boolean estadoActivo;
}
