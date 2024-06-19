import java.util.HashMap;
import java.util.Map;

public class Club {

	private String nombre;
	private Map<Integer, Socio> socios;

	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashMap<>();
	}

	// M�todo para agregar un socio
	public void agregarSocio(Socio socio) {
		socios.put(socio.getId(), socio);
	}

	// M�todo para eliminar un socio
	public void eliminarSocio(int id) {
		socios.remove(id);
	}

	// M�todo para buscar un socio por ID
	public Socio buscarSocio(int id) {
		return socios.get(id);
	}

	// M�todo para listar todos los socios
	public void listarSocios() {
		for (Socio socio : socios.values()) {
			System.out.println(socio);
		}
	}
	
    public int cantidadDeSocios() {
        return socios.size();
    }
	
}