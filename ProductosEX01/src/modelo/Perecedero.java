package modelo;

public class Perecedero extends Producto{
	
	private int diasACaducar;
	
	public Perecedero(int diasACaducar, String nombre, float precio) {
		this.diasACaducar=diasACaducar;
		super.nombre=nombre;
		super.precio=precio;
		
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	@Override
	public String toString() {
		return "Perecedero [diasACaducar=" + diasACaducar + ", nombre="+super.nombre+", precio="+super.precio+"]";
	}
	
	public float calcular(int cantidad) {
		float total = (float) ((float)cantidad * (float)this.precio);
		
		if(this.diasACaducar==3) {
			total=total/2;
		} else if(this.diasACaducar==2){
			total=total/3;
		}else if(this.diasACaducar==1){
			total=total/4;
		}
		
		return total;
		
		
		
	}
	
	

}
