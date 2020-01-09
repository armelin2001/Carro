import java.io.Serializable;

public class HatchBack extends Veiculo implements Serializable{
	public HatchBack(String marca, String cor, String placa, String modelo) {
		super(marca, cor, placa, modelo);
	}
	public String toString() {
		return super.toString();
	}
}
