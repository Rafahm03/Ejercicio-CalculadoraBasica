package utilidadess;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op=0;
		int num1=0, num2=0, suma=0, resta=0, multiplicar=0;
		double division=0;
		
		
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
						num1=Leer.datoInt();
						System.out.println("dime otro numero");
						num2=Leer.datoInt();
						suma=num1+num2;
						break;
					case 2:
						System.out.println("Dime un numero");
						num1=Leer.datoInt();
						System.out.println("Dime otro");
						num2=Leer.datoInt();
						resta=num1-num2;
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

}
}
}
