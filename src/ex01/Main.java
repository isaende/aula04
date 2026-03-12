package ex01;

public class Main {

    static void main(String[] args) {

    MonitorEnergia monitor = new MonitorEnergia(200);

    monitor.registraConsumo(3);
    monitor.registraConsumo(1);
    monitor.registraConsumo(2);
    monitor.registraConsumo(3);
    monitor.registraConsumo(2);

        System.out.println("Média dos consumos registrados: "+ monitor.media());
        System.out.println("Média de consumo no intervalo: "+ monitor.media(2,4));
    }

}
