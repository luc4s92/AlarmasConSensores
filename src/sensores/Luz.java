package sensores;

public class Luz {
	private String luz;
	
	public Luz() {
		this.luz = "Apagada";
	}

	public String getLuz() {
		return luz;
	}

	public void setLuz(String luz) {
		this.luz = luz;
	}
	
	public String encender() {
		return this.luz = "Prendida";
	}
	
}
