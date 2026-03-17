package ex03;

import java.util.Random;

public class BilheteUnico {
    int numBilhete;
    String nome;
    double saldo;
    String tipoTarifa;
    final static double VALORTARIFA = 5.40;
    Usuario usuario;


    public BilheteUnico(Usuario usuario){
        Random random = new Random();
        this.numBilhete = random.nextInt(1000, 9999);
        this.usuario = usuario;
        this.nome = nome;
    }

    public boolean passarCatraca(){

        double valor = VALORTARIFA;

        if (tipoTarifa.equalsIgnoreCase("estudante")
                || tipoTarifa.equalsIgnoreCase("professor")){
            valor = valor / 2;
        }

        if(saldo < valor){
            return false;
        }

        saldo = saldo - valor;

        return true;
    }

    public void carregar(double valor){
        this.saldo = this.saldo + valor;
    }


}
