package ex01;

public class MonitorEnergia {

    double [] consumoEnergia;
    int indice;

    public MonitorEnergia(int tamanho){

        this.consumoEnergia = new double[tamanho];

    }

    public void registraConsumo(double valor){
        if(indice < consumoEnergia.length) {
            consumoEnergia[indice] = valor;
            indice++;
        }
    }

    public double media(){

        /*double aux = 0;

        for (int i = 0; i < indice; i++) {
            aux += consumoEnergia[i];
        }
        return aux/indice;*/
        return media(1, indice);
    }
    // sobrecarga de método

    public double media(int inicio, int fim){

        double aux = 0;

        for (int i = inicio - 1; i < fim; i++) {
            aux += consumoEnergia[i];
        }
        return aux / (fim - inicio + 1) ;

    }




}
