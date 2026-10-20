// EXAMENMicaelaRobles

public class CuerpoCeleste {

    private String nombre;
    private double masaKg;
    private double radioKm;
    private double distanciaSol;
    private int cantidadSatelites;

    public CuerpoCeleste() {
        nombre = "Cuerpo generico";
        masaKg = 1000000;
        radioKm = 100;
        distanciaSol = 100;
        cantidadSatelites = 0;
    }

    public CuerpoCeleste(String nombre, double masaKg, double radioKm) {
        this.nombre = nombre;
        this.masaKg = masaKg;
        this.radioKm = radioKm;
        this.distanciaSol = 0;
        this.cantidadSatelites = 0;
    }

    public CuerpoCeleste(String nombre, double masaKg, double radioKm, double distanciaSol, int cantidadSatelites) {
        this.nombre = nombre;
        this.masaKg = masaKg;
        this.radioKm = radioKm;
        this.distanciaSol = distanciaSol;
        this.cantidadSatelites = cantidadSatelites;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasaKg() {
        return masaKg;
    }

    public void setMasaKg(double masaKg) {
        if (masaKg > 0) {
            this.masaKg = masaKg;
        } else {
            System.out.println("La masa debe ser mayor a 0");
        }
    }

    public double getRadioKm() {
        return radioKm;
    }

    public void setRadioKm(double radioKm) {
        if (radioKm > 0) {
            this.radioKm = radioKm;
        } else {
            System.out.println("El radio debe ser mayor a 0");
        }
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        if (distanciaSol >= 0) {
            this.distanciaSol = distanciaSol;
        } else {
            System.out.println("La distancia no puede ser negativa");
        }
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        if (cantidadSatelites >= 0) {
            this.cantidadSatelites = cantidadSatelites;
        } else {
            System.out.println("La cantidad de satelites no puede ser negativa");
        }
    }

    public double calcularVolumen() {
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radioKm, 3);
        return volumen;
    }

    public double calcularDensidad() {
        double densidad = masaKg / calcularVolumen();
        return densidad;
    }

    public boolean esHabitable(double temperaturaSuperficie) {
        if (temperaturaSuperficie >= -20 && temperaturaSuperficie <= 50 && calcularDensidad() > 1) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirReporte() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masaKg + " kg");
        System.out.println("Radio: " + radioKm + " km");
        System.out.println("Distancia al sol: " + distanciaSol + " millones de km");
        System.out.println("Cantidad de satelites: " + cantidadSatelites);
        System.out.println("Volumen: " + calcularVolumen() + " km3");
        System.out.println("Densidad: " + calcularDensidad() + " kg/km3");
        System.out.println();
    }
}