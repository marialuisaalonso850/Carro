import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Procesos {
	Carro cr = new Carro();
	boolean encontrado;

	public Procesos() {
		iniciar();
		validarMenu(0);
	}

	private void iniciar() {

		String menu = "Consultar Carros \n";
		menu += "1.ingresar datos \n";
		menu += "2. consultarVehiculo \n";
		menu += "3. imprimir lista total \n";
		menu += "4. salir \n";
		menu += "Ingrese una opcion valida: ";
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			validarMenu(opc);
		} while (opc != 4);
	}

	public void validarMenu(int opc) {
		switch (opc) {
		case 1:
			cr.ingresarDatos();
			break;
		case 2:
			consultar();
			break;
		case 3:
			imprimir();
			break;
		case 4:
			System.out.println("salir gracias por ingresar");
			break;
		default:
			System.out.println("Ingrese una opcion valida");
			break;
		}
	}

	private void imprimir() {
		for (Carro carro : cr.getListaCarros()) {
			System.out.println(carro);
		}

	}

	private void consultar() {
		String codigo = JOptionPane.showInputDialog("ingrese el codigo del vehiculo");
		for (Carro carro : cr.getListaCarros()) {
			if (carro.getCodigo().equalsIgnoreCase(codigo)) {
				System.out.println("el carro esta registrado con el codigo" + carro.getCodigo());
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontró un vehiculo con el codigo ingresado");
		}
	}

}
