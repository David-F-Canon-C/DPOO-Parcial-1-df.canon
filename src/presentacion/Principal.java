package presentacion;

import logica.TMB;
import logica.Persona;
import logica.Hombres;
import logica.Mujeres;

public class Principal{
	
	public Principal() {
		Persona p;
		TMB tasa;
		
		p = new Hombres("Paco", 80, 170, 18);
		
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
		System.out.println(p.getPeso());
		System.out.println(p.getAltura());
		
		Hombres c = p;
		
		tasa = System.out.println(c.tasa_met());
		
		p = new Mujeres("Luisa", 60, 150, 19);
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
		System.out.println(p.getPeso());
		System.out.println(p.getAltura());
		
		Mujeres T = p;
		
		tasa = System.out.println(c.tasa_met());
		
		
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Principal();
		
	}

}
