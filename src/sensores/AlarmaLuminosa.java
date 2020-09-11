package sensores;

public class AlarmaLuminosa extends Alarma{
	private Luz luz;
	
	public AlarmaLuminosa () {
		super();
		this.luz = new Luz();
		
	}
	
	
	@Override
	public void comprobar() {
		//aca no estoy seguro de si esta bien, es decir llama al metodo padre, el cual se fija si esta o no activa la zona
		// tengo la duda de si poner asi el metodo hace que se encienda la luz sin importar si este o no activa la zona
		// ya que deberia encenderse solamente si la zona esta activa, es decir en true
		super.comprobar();
		this.luz.encender();
		//System.out.println(this.luz.getLuz());
	}
	
}
