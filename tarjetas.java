package cap_Tres;

import java.util.Scanner;

public class tarjetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner es = new Scanner(System.in);
		double precio = 0;
		System.out.println("escribe el precio del producto");
		precio=es.nextDouble();
		double precio1=precio;
		boolean tarjetaoro = false;
		boolean tarjetaclub = false;
		boolean tarjejoven = false;
		
		System.out.println("tienes tarjeta oro ?");
		tarjetaoro = es.nextBoolean();
		System.out.println("tienes tarjeta club?");
		tarjetaclub = es.nextBoolean();
		System.out.println("tienes tarjeta joven?");
		tarjejoven = es.nextBoolean();
		if (tarjetaoro == true) {

			precio = precio*0.15;
			precio1=precio1-precio;
			if (tarjetaclub == true) {
				precio = precio*0.05;
				precio1=precio1-precio;
				if (tarjejoven == true) {
					precio = precio*0.05;
					precio1=precio1-precio;
					System.out.println(precio1);
				}
			} else {

				if (tarjejoven == true) {
					precio = precio*0.05;
					precio1=precio1-precio;
					System.out.println(precio1);
				} else {
					System.out.println(precio1);
				}

			}
		} else {
			if (tarjetaclub == true) {
				precio = precio*0.05;
				precio1=precio1-precio;

				if (tarjejoven == true) {
					precio = precio*0.05;
					precio1=precio1-precio;
					System.out.println(precio1);
				} else {
					System.out.println(precio1);
				}

			} else {
				if (tarjejoven == true) {
					precio = precio*0.05;
					precio1=precio1-precio;
					System.out.println(precio1);
				} else {
					System.out.println(precio1);
				}

			}

		}

	}

}
