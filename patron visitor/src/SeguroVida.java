// Clase concreta de seguro de vida
public class SeguroVida implements Seguro {
    private double costo;

    public SeguroVida(double costo) {
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