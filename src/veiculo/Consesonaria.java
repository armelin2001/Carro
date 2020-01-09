import java.util.Scanner;	
import java.util.ArrayList;
public class Consesonaria {
	private	ArrayList<Veiculo> Veiculos;
	public Consesonaria() {
		Veiculos = new ArrayList<Veiculo>();
	}
	Scanner ler = new Scanner(System.in);
	
	public void menuCarros() {
		int menu = ler.nextInt();
		while(true) {
			System.out.println("Digite 1 para criar um carro\n"
								+ "2 para dirigir o mesmo\n ");
			if(menu==1) {
				
			}
			else if(menu==2) {
			int opc = ler.nextInt();
			System.out.println("Digite 1 para dirigir um hatch back\n");
			switch(opc) {
			case 1 :
				int a = 1;
				Object abastecer = HatchBack.abastecer(a);
				}
			}
			else if(menu==3) {
			break;
			}
		}	
	}
	public static void main(String[] args) {

	}

}
