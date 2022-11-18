package com.tuempresa.coop.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Usuario {
	
	@Id
    @Hidden // La propiedad no se muestra al usuario. Es un identificador interno
    @GeneratedValue(generator="system-uuid") // Identificador Universal Único (1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;
	
	@Column() 
	String nombreUsuario;
	
	@Column()
	String claveUsuario;
	
	@Column()
	String nombre;
	
	@Column()
	String apellido;
	
	@Column()
	String correo;
	
	
	@Column()
	String cedula;
	
	@Column()
	String telefono;
	
	@Column()
	String tipoUsuario;
	
	@Column()
	Boolean estadoActivo;

}
