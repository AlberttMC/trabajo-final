package com.tuempresa.coop.modelo;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Turno {
	
	@Id
    @Hidden // La propiedad no se muestra al usuario. Es un identificador interno
    @GeneratedValue(generator="system-uuid") // Identificador Universal Único (1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;
	
	@Column() 
	String fechaSalida;
	
	@Column()
	String horaSalida;
	
	@Column() 
	String fechaLlegada;
	
	@Column()
	String horaLlegada;
	
	 @ManyToOne( // La referencia se almacena como una relación en la base de datos
		        fetch=FetchType.LAZY, // La referencia se carga bajo demanda
		        optional=true) // La referencia puede estar sin valor
		   //@DescriptionsList // Así la referencia se visualiza usando un combo
		  
		    Bus bus; // Una referencia Java convencional
	 
	 @ManyToOne( // La referencia se almacena como una relación en la base de datos
		        fetch=FetchType.LAZY, // La referencia se carga bajo demanda
		        optional=true) // La referencia puede estar sin valor
		   //@DescriptionsList // Así la referencia se visualiza usando un combo
		  
		    Ruta ruta; // Una referencia Java convencional
	 
	 @ManyToOne( // La referencia se almacena como una relación en la base de datos
		       // fetch=FetchType.LAZY, // La referencia se carga bajo demanda
		        optional=true) // La referencia puede estar sin valor
	 
	 @JoinColumn(
		        name = "cedula",
		        nullable = true,
		        foreignKey = @ForeignKey(name = "fk_cb_turno_usuario"))
		   @DescriptionsList  // Así la referencia se visualiza usando un combo
		    Usuario usuario; // Una referencia Java convencional
	

}
