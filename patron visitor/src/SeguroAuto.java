// Clase concreta de seguro de automóvil
public class SeguroAuto implements Seguro {
    private double costo;

    public SeguroAuto(double costo) {
        this.costo = costo;
    }

    public double obtenerCosto() {
        return costo;
    }

    @Override
    public double aceptar(VisitanteSeguros visitante) {
        return visitante.visitar(this);
    }
}