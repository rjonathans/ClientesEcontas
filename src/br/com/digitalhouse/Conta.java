package br.com.digitalhouse;


public class Conta {

    public static Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public static void setNumeroDaConta(Integer numeroDaConta) {
        Conta.numeroDaConta = numeroDaConta;
    }

    public static Integer getSaldo() {
        return saldo;
    }

    public static void setSaldo(Integer saldo) {
        Conta.saldo = saldo;
    }

    public static Integer getTitular() {
        return titular;
    }

    public static void setTitular(Integer titular) {
        Conta.titular = titular;
    }

    public static Integer getValor() {
        return valor;
    }

    public static void setValor(Integer valor) {
        Conta.valor = valor;
    }

    private static Integer numeroDaConta;
    private static Integer saldo;
    private static Integer titular;
    private static Integer valor;

     public void sacar(float this.valor){
        System.out.println("Favor insira o Valor que deseja sacar");
        if(valor>saldo) {
            System.out.println("Não é possivel fazer este saque, aldo insuficiente!"+saldo);
        }else if (valor-saldo){
            System.out.println("Seu saque foi feito com sucesso! \n Seu saldo atual é de R$ "+saldo);
        }

    }

    public void depositar()
    
}
