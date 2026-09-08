package logica;

public class Hombres extends Persona implements TMB{
	
	public Hombres(String nombre, double peso_kg, int altura_cm, int edad){
		super(nombre, peso_kg, altura_cm, edad);
	}
	
	
	@Override
	public double tasa_met() {
		if(this.peso_kg >= 60 && this.peso_kg <= 110 && this.altura_cm >= 160 && this.altura_cm <= 195 && this.edad > 15) {
			return 88.362 + (13.397 * this.peso_kg) + (4.799 * this.altura_cm) - (5.677 * this.edad);
		}
		else {
			return -1;
		}
	}
	
}
