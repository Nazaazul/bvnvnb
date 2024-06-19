import enumCLub.TipoDeBicicleta;

public class Ciclista extends Socio{

    private TipoDeBicicleta tipoBicicleta;

	public Ciclista(int id, String nombre, TipoDeBicicleta tipoBicicleta) {
		super(id, nombre);
		this.tipoBicicleta = tipoBicicleta;
	}

	public TipoDeBicicleta getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(TipoDeBicicleta tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
    
	
}
