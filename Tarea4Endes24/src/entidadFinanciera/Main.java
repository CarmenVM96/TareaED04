/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        try {
			probarIngresar(miCuenta, 3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			probarRetirar(miCuenta, 2200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

	public static void probarRetirar(CCuenta miCuenta, double cantidadEsperada) throws Exception {
		try {
			double saldoActual;
			miCuenta.retirar(300);
			saldoActual = miCuenta.estado();
			System.out.println("El saldo actual después de la retirada es de " + saldoActual);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void probarIngresar(CCuenta miCuenta, double cantidadEsperada) throws Exception {
		double saldoActual;
		miCuenta.ingresar(500);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual después del ingreso es de " + saldoActual);
	}
}
