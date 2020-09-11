package sensores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alarma a1 = new Alarma();
		Sensor s1 = new Sensor("patio");
		Sensor s2 = new Sensor("dormitorio");
		Sensor s3 = new Sensor("quincho");
		a1.addSensores(s1);
		a1.addSensores(s2);
		a1.addSensores(s3);
		//s1.setZona(true);
		s2.setZona(true);
		s3.setZona(true);
		a1.comprobar();
		
		AlarmaLuminosa a2 = new AlarmaLuminosa();
		Sensor s4 = new Sensor("patio luminoso");
		s4.setZona(true);
		a2.addSensores(s4);
		a2.comprobar();
		
		
	}

}
