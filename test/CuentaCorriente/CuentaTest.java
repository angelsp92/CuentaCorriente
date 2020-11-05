/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaCorriente;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CuentaTest {
    Cuenta cuenta;
    
    public CuentaTest() {
    }
    
    @Before
    protected void setUp() {
        cuenta = new Cuenta("0001.0002.12.1234567890", "Fulano de tal");
    }
    
    public void testIngresar1() {
        cuenta.ingresar(1000.0);
        assertTrue(cuenta.getSaldo() == 1000.0);
    }
    
    public void testIngresar2() {
        cuenta.ingresar(-1000.0); //No debe hacerse
        assertTrue(cuenta.getSaldo() == 1000.0); 
        //El saldo debe ser la cantidad anterior que no debe dar error
    }
    
    public void testRetirar1(){
        cuenta.retirar(500.0);
        assertTrue(cuenta.getSaldo() == 500.0); 
    }
    
    public void testRetirar2(){
        cuenta.retirar(-500.0); //No debe hacerse
        assertTrue(cuenta.getSaldo() == 500.0); 
    }
    
    public void testRetirar3(){
        cuenta.retirar(1000.0); //No debe hacerse
        assertTrue(cuenta.getSaldo() == 500.0); 
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
