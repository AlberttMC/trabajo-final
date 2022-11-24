package com.tuempresa.cooperativa.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@View(name="simpleBus",
members="placa"
)
@Entity
@Getter @Setter
public class Bus  {
	
	
	@Id
    @Hidden // La propiedad no se muestra al usuario. Es un identificador interno
    @GeneratedValue(generator="system-uuid") // Identificador Universal Único (1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;
	
	@Column(length=10) @Required
	String placa;
	
	@Column(length=10)
	int numeroEjes;
	
	@Column()
	Boolean estadoActivo;

	
}
