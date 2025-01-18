package io.bankaccount.bankaccount195.cuenta;

public class Cuenta {
    
    protected float saldo;
    protected int numIngresos;
    protected int numRetiros;
    protected float tasaAnual;
    protected float comiMensual;
    
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        numIngresos = 0;
        numRetiros = 0;
        comiMensual = 0;
    }
    
    public void ingresar(float cantidad) {
        saldo += cantidad;
        numIngresos++;
        System.out.println("Ingreso realizado");
    }
    
    public void retirar(float cantidad) {
        if (cantidad > saldo)
            System.out.println("No hay fondos para cubrir la retirada");
        else {
            saldo -= cantidad;
            numRetiros++;
            System.out.println("Retiro realizado");
        }
    }
    
    public void calcularInteresMensual() {
    
    }
    
    public void extractoMensual() {
    
    }
    
    public void imprimir() {
        System.out.printf("\nSaldo: %.2f\n", saldo);
        System.out.println("Numero Ingresos: " + numIngresos);
        System.out.println("Numero Retiros: " + numRetiros);
        System.out.printf("Tasa Anual: %.2f%%\n", tasaAnual);
        System.out.printf("Comision Mensual: %.2f\n\n", comiMensual);
    }
    
}