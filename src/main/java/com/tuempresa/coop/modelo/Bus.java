package com.tuempresa.coop.modelo;


import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

/**
 * Esto es un ejemplo de una entidad.
 * 
 * Siï¿½ntete libre de renombrarla, modificarla o borrarla a tu gusto.
 */

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
	
	//LocalDate fecha;
	
	//BigDecimal importe;
	
}
