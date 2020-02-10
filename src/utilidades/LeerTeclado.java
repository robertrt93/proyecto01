package utilidades;

import java.util.Scanner;

public class LeerTeclado {
	
	public static String leerLinea() {
		return new Scanner(System.in).nextLine();
	}

	public static String leerLinea(String mensaje) {
		System.out.println(mensaje);
		return leerLinea();
	}

	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int leerInt(String mensaje) {
		System.out.println(mensaje);
		return leerInt();
	}

	public static short leerShort() {
		return new Scanner(System.in).nextShort();
	}

	public static short leerShort(String mensaje) {
		System.out.println(mensaje);
		return leerShort();
	}

	public static float leerFloat() {
		return new Scanner(System.in).nextFloat();
	}

	public static float leerFloat(String mensaje) {
		System.out.println(mensaje);
		return leerFloat();
	}

	public static long leerLong() {
		return new Scanner(System.in).nextLong();
	}

	public static long leerLong(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextLong();
	}

	public static double leerDouble() {
		return new Scanner(System.in).nextDouble();
	}

	public static double leerDouble(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextDouble();
	}

	public static byte leerByte() {
		return new Scanner(System.in).nextByte();
	}

	public static byte leerByte(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextByte();
	}

	public static String leerPalabra() {
		return new Scanner(System.in).next();
	}

	public static String leerPalabra(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).next();
	}

}
