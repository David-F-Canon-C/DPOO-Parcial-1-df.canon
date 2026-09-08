package logica;

public abstract class Persona {
	protected String nombre;
	protected double peso_kg;
	protected int altura_cm;
	protected int edad;
	
	public Persona(String nombre, double peso_kg, int altura_cm, int edad) {
		this.nombre = nombre;
		this.peso_kg = peso_kg;
		this.altura_cm = altura_cm;
		this.edad = edad;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPeso() {
		return this.peso_kg;
	}
	
	public void cambiarPeso(double nuevo_peso){
		this.peso_kg = nuevo_peso;
	}
	
	
	public int getEdad() {
		return this.edad;
		
	}
	
	
	public void cambiarEdad(int nueva_edad){
		this.edad = nueva_edad;
	}
	
	
	public int getAltura() {
		return this.altura_cm;
	}
	
	public void cambiarAltura(int alt) {
		this.altura_cm = alt;
	}
	
}
