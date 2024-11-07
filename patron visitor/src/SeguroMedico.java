// Clase concreta de seguro médico
public class SeguroMedico implements Seguro {
    private double costo;

    public SeguroMedico(double costo) {
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
