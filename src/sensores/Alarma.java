package sensores;

import java.util.ArrayList;


public class Alarma {
	private Timbre timbre;
	private ArrayList <Sensor> sensores;
	
	
	public Alarma() {
		this.sensores = new ArrayList <Sensor>();
		this.timbre = new Timbre();
	}


	

	public void addSensores(Sensor s1) {
		sensores.add(s1);
	}
	
	public void disparar(int i) {
		//hace sonar el timbre
		//imprime por pantalla la zona que se activo
		this.timbre.hacerSonar();
		System.out.println("zona: " + sensores.get(i).getZonaSensor());
		
	//	sensores.get(i).getZonaSensor();
		}
	
	
	public void comprobar () {
		//checkea que ninguna este activada, es decir en True
		// si esta false llama a disparar
		for(int i = 0; i< sensores.size(); i++) {
			if(sensores.get(i).isZona()) {
				this.disparar(i);
			}
		}
	}

}
