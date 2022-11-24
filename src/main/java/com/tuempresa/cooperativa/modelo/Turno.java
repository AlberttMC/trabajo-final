package com.tuempresa.cooperativa.modelo;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

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
	
	@DefaultValueCalculator(CurrentLocalDateCalculator.class) // Fecha actual
    LocalDate fechaSalida;
	
	@Column()
	String horaSalida;
	
	@DefaultValueCalculator(CurrentLocalDateCalculator.class) // Fecha actual
    LocalDate fechaLlegada;
	
	@Column()
	String horaLlegada;
	
	 @ManyToOne( // La referencia se almacena como una relación en la base de datos
		        fetch=FetchType.LAZY, // La referencia se carga bajo demanda
		        optional=true) // La referencia puede estar sin valor
		   //@DescriptionsList // Así la referencia se visualiza usando un combo
	@ReferenceView("simpleBus")  
	 Bus bus; // Una referencia Java convencional
	 
	 @ManyToOne( // La referencia se almacena como una relación en la base de datos
		        fetch=FetchType.LAZY, // La referencia se carga bajo demanda
		        optional=true) // La referencia puede estar sin valor
		   //@DescriptionsList // Así la referencia se visualiza usando un combo
	 @ReferenceView("simpleRuta")  
    Ruta ruta; // Una referencia Java convencional
	 
	 @ManyToOne( // La referencia se almacena como una relación en la base de datos
		       // fetch=FetchType.LAZY, // La referencia se carga bajo demanda
		        optional=true) // La referencia puede estar sin valor
	 @Required
	 @DescriptionsList(
			 condition="${TIPOEMPLEADO} = 0"
			 )
	 Empleado conductor;
	 @ManyToOne( // La referencia se almacena como una relación en la base de datos
		       // fetch=FetchType.LAZY, // La referencia se carga bajo demanda
		        optional=true) // La referencia puede estar sin valor
	 @Required
	 @DescriptionsList(
			 condition="${TIPOEMPLEADO} = 1"
			 )
	 Empleado ayudante;
	
	

}