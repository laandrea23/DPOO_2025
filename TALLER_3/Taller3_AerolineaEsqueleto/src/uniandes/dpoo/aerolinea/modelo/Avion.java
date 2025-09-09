package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	public Avion(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	
	private String nombre;
	private int capacidad;
	
	public String getNombre() {
		return nombre;
	}
	public int getCapacidad() {
		return capacidad;
	}

}
