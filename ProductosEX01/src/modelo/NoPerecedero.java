package modelo;

public class NoPerecedero extends Producto {
	
	private String tipo;
	
	public NoPerecedero(String tipo, String nombre, int precio) {
		this.tipo=tipo;
		super.nombre=nombre;
		super.precio=precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + ", nombre="+super.nombre+", precio="+super.precio+"]";
	}
	
	
	
	
	

}
