package io.bankaccount.bankaccount195;

import io.bankaccount.bankaccount195.cuenta.CuentaAhorros;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankAccount195Application {
    
    public static void main(String[] args) {
        CuentaAhorros ahorros = new CuentaAhorros(2300, 2.6f);
        
        ahorros.imprimir();
        ahorros.retirar(2200);
        ahorros.imprimir();
        ahorros.retirar(100);
        ahorros.imprimir();
        ahorros.ingresar(1500);
        
    }
    
}
