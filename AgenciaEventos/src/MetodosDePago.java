
public class MetodosDePago {
	
	
	private boolean tarjeta;
	private int cuotas;
	
	double cantidadDescuento;
	
	public MetodosDePago(boolean tarjeta, int cuotas, double cantidadDescuento) {
		super();
		
		this.tarjeta = tarjeta;
		this.cuotas = cuotas;
		this.cantidadDescuento = cantidadDescuento;
	}


	

	public boolean isTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(boolean tarjeta) {
		this.tarjeta = tarjeta;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public double getCantidadDescuento() {
		return cantidadDescuento;
	}

	public void setCantidadDescuento(double cantidadDescuento) {
		this.cantidadDescuento = cantidadDescuento;
	}


		
    	
    	
    	
    	
	}


