package com.edu.tarea.inyeccion.banco;

public class CuentaPoliza extends Cuenta{
	private String fechaVig = "10 de Diciembre de 2021";
	
	public void aperCuenta(float valorInteres) {
		System.out.println("Cuenta de Poliza abierta");
		float res = valorInteres * 15/100;
		System.out.println("El valor del interes para esta cuenta es: " + res);
		
	}

	public String getFechaVig() {
		return fechaVig;
	}

	public void setFechaVig(String fechaVig) {
		this.fechaVig = fechaVig;
	}

	@Override
	public String toString() {
		return "[Fecha de Vigencia= " + fechaVig + " ]";
	}
	
	
}
