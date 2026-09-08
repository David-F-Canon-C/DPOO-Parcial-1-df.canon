package logica;

public class Mujeres extends Persona implements TMB{
	
	public Mujeres(String nombre, double peso_kg, int altura_cm, int edad){
		super(nombre, peso_kg, altura_cm, edad);
	}
	
	
	@Override
	public double tasa_met() {
		if(this.peso_kg >= 40 && this.peso_kg <= 80 && this.altura_cm >= 140 && this.altura_cm <= 180 && this.edad > 15) {
			return 447.593 + (9.247 * this.peso_kg) + (3.098 * this.altura_cm) - (4.33 * this.edad);
		}
		else {
			return -1;
		}
	}
}
