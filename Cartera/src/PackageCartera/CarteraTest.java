package PackageCartera;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarteraTest {
    //INGRESOS
    @Test
    void testAlCrearCuentasElSaldoEsCero(){
        Cuenta c = new Cuenta();
        assertEquals(0, c.getSaldo());
    }

    @Test
    void testAlIngresar100EnCuentaVaciaElSaldoEs100(){
        Cuenta c = new Cuenta();
        c.ingresar(100);
        assertEquals(100, c.getSaldo());
    }

    @Test
    void testAlIngresar3000EnCuentaVaciaElSaldoEs3000(){
        Cuenta c = new Cuenta();
        c.ingresar(3000);
        assertEquals(3000, c.getSaldo());
    }

    @Test
    void testAlIngresar100EnCuentaCon3000ElSaldoEs3100(){
        Cuenta c = new Cuenta();
        c.ingresar(100);
        c.ingresar(3000);
        assertEquals(3100, c.getSaldo());
    }

    @Test
    void testAlIngresarMenos100EnCuentaVaciaElSaldoEs0(){
        Cuenta c = new Cuenta();
        c.ingresar(-100);
        assertEquals(0, c.getSaldo());
    }

    @Test
    void testAlIngresar100Con45EnCuentaVaciaElSaldoEs100Con45(){
        Cuenta c = new Cuenta();
        c.ingresar(100.45);
        assertEquals(100.45, c.getSaldo());
    }

    @Test
    void AlIngresar6000_00EnCuentaVaciaElSaldoEs6000_00(){
        Cuenta c = new Cuenta();
        c.ingresar(6000.00);
        assertEquals(6000.00, c.getSaldo());
    }

    //RETIRADAS
    @Test
    void testAlRetirar100EnCuentacon500ElSaldoEs400(){
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(100);
        assertEquals(400, c.getSaldo());
    }
    @Test
    void testAlRetirar500EnCuentaCon200NoOcurreNadaSaldoSigueSiendo200(){
        Cuenta c = new Cuenta();
        c.ingresar(200);
        c.retirar(500);
        assertEquals(200, c.getSaldo());
    }
    @Test
    void testRetirarMenos100EnCuentaCon500ElSaldoSigueSiendo500(){
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(-100);
        assertEquals(500, c.getSaldo());
    }

    @Test
    void testAlRetirar100_45EnCuentaCon500ElSaldoEs399_55(){
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(100.45);
        assertEquals(399.55, c.getSaldo());
    }

    @Test
    void retirar6000EnCuentoCon7000ElSaldoEs1000(){
        Cuenta c = new Cuenta();
        c.ingresar(7000);
        c.retirar(6000);
        assertEquals(1000, c.getSaldo());
    }

    @Test
    void retirar6000_01EnCuentaCon7000ElSaldoSigueSiendo7000(){
        Cuenta c = new Cuenta();
        c.ingresar(7000);
        c.retirar(6000.01);
        assertEquals(7000, c.getSaldo());
    }

    @Test
    void transferir100DesdeCuentaCon500aCuentacon50PrimeraCuenta400SegundaCuenta150(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresar(500);
        c2.ingresar(50);
        c1.transferir(100, c2);
        assertEquals(400, c1.getSaldo());
        assertEquals(150, c2.getSaldo());
    }

    @Test
    void tranferirMenos100DesdeUnaCuentaCon500ACuentaCon50LosSaldosSeQuedaIgual(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresar(500);
        c2.ingresar(50);
        c1.transferir(-100, c2);
        assertEquals(500, c1.getSaldo());
        assertEquals(50, c2.getSaldo());

    }

    @Test
    void transferir3000DesdeCuentaCon3500ACuentaCon50SaldoC1Es500ySaldoC2Es3050(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresar(3500);
        c2.ingresar(50);
        c1.transferir(3000, c2);
        assertEquals(500, c1.getSaldo());
        assertEquals(3050, c2.getSaldo());
    }

    @Test
    void transferir3000_01DesdeCuentaCon3500ACuentaCon50SaldoC1Es500ySaldoC2Es3050(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresar(3500);
        c2.ingresar(50);
        c1.transferir(3000.01, c2);
        assertEquals(3500, c1.getSaldo());
        assertEquals(50, c2.getSaldo());
    }
}
