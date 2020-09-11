package sensores;

public class Sensor {
	private String zonaSensor;
	private boolean zona; 
	
	public Sensor(String zona ) {
		this.zonaSensor = zona;
	}
	
	public String getZonaSensor() {
		return zonaSensor;
	}

	public void setZonaSensor(String zonaSensor) {
		this.zonaSensor = zonaSensor;
	}
	
	public boolean isZona() {
		return zona;
	}

	public void setZona(boolean zona) {
		this.zona = zona;
	}
	
}
