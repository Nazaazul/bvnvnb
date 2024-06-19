import enumCLub.TipoDeBicicleta;

public class Triatleta extends Socio implements PuedeNadar, PuedeCorrer, PuedeBici {

	private String estilo;
	private TipoDeBicicleta tipodebicicleta;

	public Triatleta(int id, String nombre, String estilo, TipoDeBicicleta tipodebicicleta) {
		super(id, nombre);
		this.estilo = estilo;
		this.tipodebicicleta = tipodebicicleta;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public TipoDeBicicleta getTipodebicicleta() {
		return tipodebicicleta;
	}

	public void setTipodebicicleta(TipoDeBicicleta tipodebicicleta) {
		this.tipodebicicleta = tipodebicicleta;
	}

	@Override
	public void puedeBici() {
		// TODO Auto-generated method stub

	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub

	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub

	}

}
