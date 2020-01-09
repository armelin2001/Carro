import java.io.Serializable;

public class Suv extends Veiculo implements Serializable{

	public Suv(String marca, String cor, String placa, String modelo) {
		super(marca, cor, placa, modelo);
	}
	public String toString() {
		return super.toString();
	}

}
