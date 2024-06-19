
public class Nadador  extends Socio implements PuedeNadar{
		private String estilo;

		public Nadador(int id, String nombre, String estilo) {
			super(id, nombre);
			this.estilo = estilo;
		}

		public String getEstilo() {
			return estilo;
		}

		public void setEstilo(String estilo) {
			this.estilo = estilo;
		}

		@Override
		public void nadar() {
			// TODO Auto-generated method stub
			
		}

		
}
