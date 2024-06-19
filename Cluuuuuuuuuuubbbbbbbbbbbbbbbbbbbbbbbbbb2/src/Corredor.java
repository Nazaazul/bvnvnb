
public class Corredor extends Socio {

	private int distanciaPreferida;
	private int kilometrosEntrenados;
	
	public Corredor(int id, String nombre, int distanciaPreferida) {
		super(id, nombre);
		this.distanciaPreferida = distanciaPreferida;
	}

	
	public int getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(int distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}


	public int getKilometrosEntrenados() {
		return kilometrosEntrenados;
	}


	public void setKilometrosEntrenados(int kilometrosEntrenados) {
		this.kilometrosEntrenados = kilometrosEntrenados;
	}
	
	
	
	
}
