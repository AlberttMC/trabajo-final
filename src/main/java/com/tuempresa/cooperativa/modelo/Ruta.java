package com.tuempresa.cooperativa.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;


@View(name="simpleRuta",
members="origen, destino"
)
@Entity
@Getter @Setter
public class Ruta {
	
	@Id
    @Hidden // La propiedad no se muestra al usuario. Es un identificador interno
    @GeneratedValue(generator="system-uuid") // Identificador Universal Único (1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;
	
	@Column() 
	String origen;
	
	@Column()
	String destino;
	
	@Column()
	Boolean estadoActivo;

}
