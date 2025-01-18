package io.bankaccount.bankaccount195.cuenta;

import io.bankaccount.bankaccount195.cuenta.Cuenta;

public class CuentaAhorros extends Cuenta {
    
    private boolean esActiva;
    
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        esActiva = saldo >= 100;
    }
    
    @Override
    public void ingresar(float cantidad) {
        if (esActiva)
            super.ingresar(cantidad);
        else
            System.out.println("Ingreso no es posible. Cuenta inactiva");
    }
    
    @Override
    public void retirar(float cantidad) {
        if (esActiva) {
            super.retirar(cantidad);
            esActiva = saldo >= 100; //Tras retirar puede quedar inactiva
        }
        else
            System.out.println("Retiro no es posible. Cuenta inactiva");
    }
    
    @Override
    public void extractoMensual() {
    
    }
    
    @Override
    public void imprimir() {
        System.out.printf("\nSaldo: %.2f\n", saldo);
        System.out.printf("Comision Mensual: %.2f\n", comiMensual);
        System.out.println("Total Transacciones: " + (numIngresos + numRetiros) + "\n");
    }
    
}