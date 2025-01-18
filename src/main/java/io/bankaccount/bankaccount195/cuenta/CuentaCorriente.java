package io.bankaccount.bankaccount195.cuenta;

import io.bankaccount.bankaccount195.cuenta.Cuenta;

public class CuentaCorriente extends Cuenta {
    
    private float sobreGiro;
    
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobreGiro = 0;
    }
    
    @Override
    public void retirar(float cantidad) {
        saldo -= cantidad;
        if (saldo < 0) {
            sobreGiro = saldo;
            saldo = 0;
        }
        System.out.println("Retiro realizado");
    }
    
    @Override
    public void ingresar(float cantidad) {
        //¿Hay sobregiro?
        if (sobreGiro < 0) { //Sí lo hay
            sobreGiro += cantidad;
            /*
             * Si ahora sobreGiro tiene ahora valor positivo
             * es que ha quedado cancelado (vuelve a 0)
             * y la cantidad positiva es la que se ingresa al saldo
             */
            if (sobreGiro > 0) {
                super.ingresar(sobreGiro);
                sobreGiro = 0; //Vuelve a 0
            }
            else
                System.out.println("Ingreso realizado");
        }
        else //No hay sobregiro
            super.ingresar(cantidad);
    }
    
    @Override
    public void imprimir() {
        System.out.printf("\nSaldo: %.2f\n", saldo);
        System.out.printf("Comision Mensual: %.2f\n", comiMensual);
        System.out.println("Total Transacciones: " + (numIngresos + numRetiros));
        System.out.printf("Sobregiro: %.2f\n\n", sobreGiro);
    }
    
}