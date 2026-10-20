// EXAMENMicaelaRobles

public class SimuladorAstronomico {

    public static void main(String[] args) {

        CuerpoCeleste c1 = new CuerpoCeleste();
        CuerpoCeleste c2 = new CuerpoCeleste("Gliese 581g", 2.2e25, 8900);
        CuerpoCeleste c3 = new CuerpoCeleste("Kepler-186f", 7.2e24, 7200, 64.3, 0);

        System.out.println("CUERPOS CELESTES REGISTRADOS");
        System.out.println();
        c1.imprimirReporte();
        c2.imprimirReporte();
        c3.imprimirReporte();

        System.out.println("ACTUALIZANDO DATOS CON SETTERS");
        System.out.println();
        c1.setNombre("Tidally Locked Exoplanet");
        c1.setMasaKg(5.0e24);
        c1.setRadioKm(6000);
        c1.setDistanciaSol(30.5);
        c1.setCantidadSatelites(2);
        c2.setDistanciaSol(19.5);
        c2.setCantidadSatelites(1);

        System.out.println("PRUEBA DE VALIDACIONES");
        c3.setMasaKg(-100);
        c3.setRadioKm(0);
        c3.setCantidadSatelites(-1);
        System.out.println();

        System.out.println("PRUEBA DE CALCULOS");
        System.out.println("Volumen de " + c1.getNombre() + ": " + c1.calcularVolumen());
        System.out.println("Densidad de " + c1.getNombre() + ": " + c1.calcularDensidad());
        System.out.println("Volumen de " + c2.getNombre() + ": " + c2.calcularVolumen());
        System.out.println("Densidad de " + c2.getNombre() + ": " + c2.calcularDensidad());
        System.out.println("Volumen de " + c3.getNombre() + ": " + c3.calcularVolumen());
        System.out.println("Densidad de " + c3.getNombre() + ": " + c3.calcularDensidad());
        System.out.println();

        System.out.println("PRUEBA DE HABITABILIDAD");
        if (c1.esHabitable(15)) {
            System.out.println(c1.getNombre() + " a 15 C es habitable");
        } else {
            System.out.println(c1.getNombre() + " a 15 C no es habitable");
        }
        if (c2.esHabitable(80)) {
            System.out.println(c2.getNombre() + " a 80 C es habitable");
        } else {
            System.out.println(c2.getNombre() + " a 80 C no es habitable");
        }
        if (c3.esHabitable(-10)) {
            System.out.println(c3.getNombre() + " a -10 C es habitable");
        } else {
            System.out.println(c3.getNombre() + " a -10 C no es habitable");
        }
        System.out.println();

        System.out.println("FICHAS TECNICAS FINALES");
        System.out.println();
        c1.imprimirReporte();
        c2.imprimirReporte();
        c3.imprimirReporte();
    }
}