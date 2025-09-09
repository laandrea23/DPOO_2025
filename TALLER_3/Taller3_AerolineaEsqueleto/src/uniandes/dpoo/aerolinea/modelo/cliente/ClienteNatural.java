package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{
	public static final String NATURAL = "Natural";
	private String nombre;
	
	public ClienteNatural(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String getTipoCliente() {
		
		return NATURAL;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return nombre;
	}

}