package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int c = 0;
		for(int i = 0;i < asientos.length;i++) {
			if(asientos[i]!=null) {
				c++;
			}
		}
		return c;
	}
	
	String verificarIntegridad() {
		if(registro==motor.registro) {
			for(int i = 0;i < asientos.length;i++) {
				if(asientos[i]!=null) {
					if(registro!=asientos[i].registro) {
						return "Las piezas no son originales";
					}
				}
			}
		} else {
			return "Las piezas no son originales";
		}
		return "Auto original";
	}
}
