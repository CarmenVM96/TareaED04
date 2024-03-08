/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * Clase CCuenta, que contiene los constructores de la clase y sus métodos
 * @author Carmen
 * @version 3
 * 
 */

public class CCuenta {

	/**
     * Variables de clase
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Constructor vacío de CCuenta
     */
    public CCuenta()
    {
    }
    /**
     * Constructor parametrizado de la clase CCuenta
     * @param nom nombre del titular
     * @param cue cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    /**
     * Getters y setters
     * @since 05-03-2024
     * 
     * @return devuelve el nombre del titular
     */
    public String getNombre() {
		return nombre;
	}
    /**
     * Establece el nombre del propietario
     * @param nombre pasa por parámetro un nombre
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Método getCuenta
 * @return devuelve la cuenta en forma de String
 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Establece la cuenta
	 * @param cuenta pasa por parámetro una cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * Método getSaldo
	 * @return obtiene el saldo y lo devuelve
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Método setSaldo
	 * @param saldo establece el saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Método getTipoInterés
	 * @return obtiene el tipo de interés y lo devuelve
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Establece el tipo de interés de la cuenta
	 * @param tipoInterés para pasar pro parámetro un double con el tipo de interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	/**
	 * Método getErrorcantidadnegativa
	 * @return devuelve la cadena "No se puede ingresar una cantidad negativa" cuando se da el error
	 */
	public static String getErrorcantidadnegativa() {
		return ERRORCANTIDADNEGATIVA;
	}
	/**
	 * Método estado.
	 * @return devuelve el saldo de la cuenta
	 */
	public double estado(){
        return this.saldo;
    }
	
	/**
	 * Método ingresar. Suma la cantidad ingresada al saldo
	 * @param cantidad, que pasa por parámetro la cantidad a ingresar en la cuenta
	 * @throws Exception si se intenta ingresar una cantidad negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        saldo = saldo + cantidad;
    }
    /**
     * Método retirar. Resta la canridad a retirar del saldo
     * @param cantidad, que le pasa al método por parámetro la canridad a retirar
     * @throws Exception si se intenta retirar una cantidad negativa o no hay suficiente saldo para la retirada
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}


    
   