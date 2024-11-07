
public class Eventos {
	
	private String tipo;
	private int lugar;
	private int cantidadInvitados;
	private int precioInvitado;
	private String fecha;
	private String estilo;
	private int musica;
	private int decoracion;
	private boolean entretenimiento;
	private boolean fotografia;
	private boolean seguridad;

	int precioEntretenimiento = 5000;
	int precioFotografia = 5000;
	int precioSeguridad = 5000;
	
	public Eventos(String tipo, int lugar, int cantidadInvitados, int precioInvitado, String fecha, String estilo,
			int musica, int decoracion, boolean entretenimiento, boolean fotografia, boolean seguridad) {
		super();
		this.tipo = tipo;
		this.lugar = lugar;
		this.cantidadInvitados = cantidadInvitados;
		this.precioInvitado = precioInvitado;
		this.fecha = fecha;
		this.estilo = estilo;
		this.musica = musica;
		this.decoracion = decoracion;
		this.entretenimiento = entretenimiento;
		this.fotografia = fotografia;
		this.seguridad = seguridad;
	}
	
	

	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getLugar() {
		return lugar;
	}



	public void setLugar(int lugar) {
		this.lugar = lugar;
	}



	public int getCantidadInvitados() {
		return cantidadInvitados;
	}



	public void setCantidadInvitados(int cantidadInvitados) {
		this.cantidadInvitados = cantidadInvitados;
	}



	public int getPrecioInvitado() {
		return precioInvitado;
	}



	public void setPrecioInvitado(int precioInvitado) {
		this.precioInvitado = precioInvitado;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getEstilo() {
		return estilo;
	}



	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}



	public int getMusica() {
		return musica;
	}



	public void setMusica(int musica) {
		this.musica = musica;
	}



	public int getDecoracion() {
		return decoracion;
	}



	public void setDecoracion(int decoracion) {
		this.decoracion = decoracion;
	}



	public boolean isEntretenimiento() {
		return entretenimiento;
	}



	public void setEntretenimiento(boolean entretenimiento) {
		this.entretenimiento = entretenimiento;
	}



	public boolean isFotografia() {
		return fotografia;
	}



	public void setFotografia(boolean fotografia) {
		this.fotografia = fotografia;
	}



	public boolean isSeguridad() {
		return seguridad;
	}



	public void setSeguridad(boolean seguridad) {
		this.seguridad = seguridad;
	}



	public int calcularCostoInvitados() {
    	int costoInvitados = cantidadInvitados * precioInvitado;
    	return costoInvitados;
    }
    
    public int calcularCostoEvento() {
    	int costoEvento = calcularCostoInvitados() + lugar + musica + decoracion;
    	
    	
    	if(entretenimiento) {
    		costoEvento = costoEvento + precioEntretenimiento;
    		
    	}
    	if(fotografia) {
    		costoEvento = costoEvento + precioFotografia;
    			
    	}
    	if(seguridad) {
    		costoEvento = costoEvento + precioSeguridad;
    			
    	}
    	return costoEvento;
    }

}
