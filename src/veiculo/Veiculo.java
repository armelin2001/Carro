package veiculo;

import java.util.Scanner;
public class Veiculo {
	static String marca;
	static String modelo;
	static String placa;
	static String cor;
	static float km;
	static int litrosCombustivel;
	static int velocidade;
	static double preco;
	static boolean isLigado;
	public Veiculo() {
		
	}
	public static boolean isLigado() {
		return isLigado;
	}
	public static void setLigado(boolean isLigado) {
		Veiculo.isLigado = isLigado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		Veiculo.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		Veiculo.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		Veiculo.placa = placa;
	}
	public static String getCor() {
		return cor;
	}
	public static void setCor(String cor) {
		Veiculo.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		Veiculo.km = km;
	}
	public static int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public static void setLitrosCombustivel(int litrosCombustivel) {
		Veiculo.litrosCombustivel = litrosCombustivel;
	}
	public static int getVelocidade() {
		return velocidade;
	}
	public static void setVelocidade(int velocidade) {
		Veiculo.velocidade = velocidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		Veiculo.preco = preco;
	}
	public static void acelerar() {
		setVelocidade(20);
		setLitrosCombustivel(-1);
	}
	public static void abastecer(int qtdLitros) {
		if(qtdLitros>100) {
			System.out.println("O tanque do carro esta cheio");
		}
	}
	public static void frear(){
		if(getVelocidade()>0) {
			setVelocidade(-10);
		}
	}
	public static void pintar(String cor) {
		setCor(cor);
	}
	public static void ligar() {
		setLigado(true);
	}
	public static void desligar() {
		setLigado(false);
	}
	public static void main(String[] args) {
		while (true) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite 1 para ligar\n"
				+ "Digite 2 para acelerar\n"
				+ "Digite 3 para frear o carro\n"
				+ "Digite 4 para abastecer\n"
				+ "Digite 5 para desligar o carro\n"
				+ "Digite 6 para definir ou trocar a cor do carro\n"
				+ "Digite 7 para sair do programa\n");
		int escolha = leitura.nextInt();
		if (escolha == 1) {
			ligar();
			continue;
		}
		if (escolha ==2) {
			if(isLigado()==true) {
				 acelerar();
				 System.out.println("Sua velocidade é de " + getVelocidade());
				 continue;
			 }
			else {
				System.out.println("Por favor ligue o veiculo antes\n");
				continue;
			}
		}
		if (escolha == 3) {
			 if(isLigado()==true) {
				 frear();
				 continue;
			 }
			 else {
				 System.out.println("Por favor ligue o veiculo antes\n");
				 continue;
			 }
		}
		if (escolha == 4) {
			System.out.println("Digite a quantidade desejada a ser abstecida");
			System.out.println("Quantidade maxima 100 litros");
			int gas = leitura.nextInt();
			abastecer(gas);
			System.out.println("voce possui"+getLitrosCombustivel()+"de combustivel\n");
			continue;
		}
		if (escolha == 5) {
			if(isLigado == false){
				System.out.println("O veiculo ja esta desligado\n");
				continue;
			}
			desligar();
			continue;
		}
		if (escolha == 6) {
			System.out.println("Escreva o nome da cor que deseja que o carro tenha\n");
			cor = leitura.nextLine();
			pintar(cor);
			System.out.println("sua cor é" + getCor());
		}
		if (escolha == 7) {
			System.exit(0);;
			break;
		}
		
	}
	}	
}
