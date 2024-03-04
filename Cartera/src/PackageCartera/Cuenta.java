package PackageCartera;

public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad <= 6000 && cantidad > 0) {
            saldo += cantidad;
        } else {
            this.saldo = saldo;
        }

    }

    public void retirar(double cantidad) {
        if (cantidad > 6000 || cantidad > saldo || cantidad < 0 ){
            this.saldo = saldo;
        } else {
            this.saldo -= cantidad;
        }
    }

    public void transferir(double cantidad, Cuenta destino) {
        if (cantidad > saldo || cantidad < 0 || cantidad > 3000){
            this.saldo = saldo;
        } else {
            this.saldo -= cantidad;
            destino.saldo += cantidad;
        }
    }
}
