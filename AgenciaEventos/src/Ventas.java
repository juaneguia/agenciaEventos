
public class Ventas {
	
	private MetodosDePago pago;
	private Eventos evento;
	private Clientes cliente;
	public Ventas(MetodosDePago pago, Eventos evento, Clientes cliente) {
		super();
		this.pago = pago;
		this.evento = evento;
		this.cliente = cliente;
	}
	public MetodosDePago getPago() {
		return pago;
	}
	public void setPago(MetodosDePago pago) {
		this.pago = pago;
	}
	public Eventos getEvento() {
		return evento;
	}
	public void setEvento(Eventos evento) {
		this.evento = evento;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	public double calcularMontoAPagar() {
		
		if(pago.isTarjeta()) {
			double montoAPagar = evento.calcularCostoEvento();
			return montoAPagar;
		}
		else {
			double montoAPagar = evento.calcularCostoEvento() - (evento.calcularCostoEvento() * pago.getCantidadDescuento());
			return montoAPagar;
			
		
		}
	

}
}
