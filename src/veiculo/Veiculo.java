public class Veiculo{
	// serialize serve para armazenar objetos em um array e dps em um arquivo de pesistenia
	// irei usar o serilize nas classes filhas pois assim fica mais facil
	private String marca;
	private String cor;
	private String placa;
	private String modelo;
	private int litrosCombustivel;
	private int velocidade;
	private  boolean isLigado;
	//metodo construtor
	public Veiculo(String marca, String cor, String placa, String modelo) {
		this.setMarca(marca);
		this.setCor(cor);
		this.setPlaca(placa);
		this.setModelo(modelo);
	}
	// get and seters
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String toString() {
		String retorno;
		retorno="Marca: "+ this.getMarca()+
				"Cor" + this.getCor()+
				"Placa" + this.getPlaca()+
				"Modelo" + this.getModelo();
		return retorno;

	}
	public int abastecer(int gas) {
		if(gas<80) {
			setLitrosCombustivel(gas);
			System.out.println("O tanque do carro esta cheio");
			}
		else {
			System.out.println("o valor passou 80 litros");
		}
		return gas;
	}
	public int acelerar() {
		return 0;
	}
	public String pintar(String cor) {
		String a = null;
		if(cor != getCor()) {
			setCor(cor);
			System.out.println("A cor do seu carro é "+ getCor());
		}
		else {
			System.out.println("O seu carro ja esta pintado com essa cor");
		}
		return a;
	}
	public void frear() {
		if(getVelocidade()>0) {
			setVelocidade(-10);
			}
		else {
			System.out.println("Sua velocidade esta abaixo da velocidade minima! ");
		}
	}
};
