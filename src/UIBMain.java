import java.util.Scanner;

public class UIBMain {

	public static void main(String[] args) {
		
		Scanner leTeclado = new Scanner(System.in);
		final int TOTAL_CLIENTE = 2;
		Cliente [] clientes = new cliente[TOTAL_CLIENTE];
	
		System.out.println("*******SEJA BEM-VINDO*******");
		System.out.println("--------- UIIB BANK---------");
		
		
		int i;
		for (i=0; i<2; i++) {
			System.out.println("DIGITE O NOME");
			clientes[i].setNome(leTeclado.next);
			
		}
		
		for (i=0; i<2; i++) {
			
			
		}
		
		
		
		
		

}
