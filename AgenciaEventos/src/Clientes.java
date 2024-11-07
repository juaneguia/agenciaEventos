
public class Clientes {
	
	private String nombre;
	private int ID;
	private String numeroTelefono;
	public Clientes(String nombre, int iD, String numeroTelefono) {
		super();
		this.nombre = nombre;
		ID = iD;
		this.numeroTelefono = numeroTelefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	@Override
	public String toString() {
		return "Clientes [nombre=" + nombre + ", ID=" + ID + ", numeroTelefono=" + numeroTelefono + "]";
	}
	
	
	
	

}
