package utilidadess;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op=0;
		int num1=0, num2=0;
		
		do {
				System.out.println("------------------------------");
				System.out.println("············MENU··············");
				System.out.println("------------------------------");
				System.out.println("Opciones");
				System.out.println("______________________________");
				System.out.println("1- Sumar ");
				System.out.println("2- Restar ");
				System.out.println("3- Dividir");
				System.out.println("4- Multiplicar");
				System.out.println("0- SALIR");
				System.out.println("------------------------------");
				System.out.println("¿Qué operación desea realizar?");
				op=Leer.datoInt();
					switch (op) {
					
					case 0:
						System.out.println("SALIENDO...");
						break;
					case 1:
						System.out.println("dime un número");
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					case 5:
					
						break;	
					default:
						System.out.println("Esa opción no está disponible");
						break;
				
		} while (op!=0);
		
	}

}
}
