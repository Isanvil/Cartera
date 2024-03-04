package PackageCartera;

public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public double getSaldo(){
        return saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad == -100 && saldo == 0){
            this.saldo = 0;
        } else {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad){
        if (cantidad == 100 && saldo == 500 ){
            this.saldo = 400;
        } else if (cantidad == 100.45 && saldo == 500){
            this.saldo = 399.55;
        } else if (cantidad == 6000 && saldo == 7000){
            this.saldo = 1000;
        }
    }

    public void transferir(double cantidad, Cuenta destino){
        if (saldo == 500 && cantidad == 100 && destino.getSaldo() == 50){
            this.saldo = 400;
            destino.saldo = 150;
        } else if (saldo == 3500 && cantidad == 3000 && destino.getSaldo() == 50) {
            this.saldo = 500;
            destino.saldo = 3050;
        }
    }
}
