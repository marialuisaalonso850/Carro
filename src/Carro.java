import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Carro {
   private String codigo;
	private TipoVehiculo vehiculo;
	private String color;
	private String velocidad;
	private String modelo;
	private ArrayList<Carro> listaCarros;

	public Carro() {
		this.color = "Azul";
		this.modelo = "2010";
		this.velocidad = "40klm";
		this.listaCarros = new ArrayList<>();
	}

	public TipoVehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(TipoVehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVelocidad() {

		return velocidad;
	}

	public void setVelocidad(String velocidad) {

		this.velocidad = velocidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void ingresarDatos() {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de carros a buscar"));
		for (int i = 0; i < cantidad; i++) {
		codigo=JOptionPane.showInputDialog("ingrese el codigo del vehiculo");
			String[] opciones = { TipoVehiculo.MAZDA.toString(), TipoVehiculo.RENAULT.toString(),
					TipoVehiculo.TOYATA.toString() };
			String tipoVehiculoSeleccionado = (String) JOptionPane.showInputDialog(null,
					"Seleccione el tipo de vehículo", "Tipo de Vehículo", JOptionPane.QUESTION_MESSAGE, null, opciones,
					opciones[0]);

			// Obtener el valor del enum seleccionado
			TipoVehiculo tipoVehiculo = TipoVehiculo.valueOf(tipoVehiculoSeleccionado);
			color = JOptionPane.showInputDialog("ingrese el color del carro" + (i + 1));
			velocidad = JOptionPane.showInputDialog("ingrese la velocidad" + (i + 1));
			modelo = JOptionPane.showInputDialog("ingrese el modelo" + (i + 1));

			Carro nuevoCarro = new Carro();
			nuevoCarro.setCodigo(getCodigo());
			nuevoCarro.setVehiculo(tipoVehiculo);
			nuevoCarro.setColor(getColor());
			nuevoCarro.setVelocidad(getVelocidad());
			nuevoCarro.setModelo(getModelo());

			// Agregar el nuevo carro a la lista
			listaCarros.add(nuevoCarro);
			System.out.println(listaCarros);

		}

	}

	@Override
	public String toString() {
		String mostrar = "Carro [vehiculo=" + vehiculo + ", color=" + color + ", velocidad=" + velocidad + ", modelo="
				+ modelo + "]";
		;
		return mostrar;
	}

	public void mover() {
		System.out.println("el carro se mueve");
	}

	public void frena() {
		System.out.println("el carro frena");
	}

	public ArrayList<Carro> getListaCarros() {
		return listaCarros;
	}

	public void setListaCarros(ArrayList<Carro> listaCarros) {
		this.listaCarros = listaCarros;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	

}
