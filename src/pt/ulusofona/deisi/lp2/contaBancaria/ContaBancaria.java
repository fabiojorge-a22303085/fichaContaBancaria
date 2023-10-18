package pt.ulusofona.deisi.lp2.contaBancaria;

public class ContaBancaria {
    int saldoInicial;

    ContaBancaria(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    void deposita(int valor){
        saldoInicial += valor;
    }
    boolean levanta(int valor){
        if (valor <= saldoInicial){
            saldoInicial-= valor;
            return true;
        }else {
            return false;
        }
    }
    String getSaldoComoString(){
        String Saldo = String.valueOf(saldoInicial);
        return Saldo;
    }
}