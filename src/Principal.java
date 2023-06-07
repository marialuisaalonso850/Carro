import java.util.ArrayList;

public class Principal {

	public  static void main(String  args[]) {
		Carro cr = new Carro();
		Procesos procesos= new Procesos();
		cr.ingresarDatos();
		cr.frena();
		cr.mover();
		
	}
}
