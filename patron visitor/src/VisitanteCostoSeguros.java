 // Implementación del visitante para cálculo de costos de seguros
public class VisitanteCostoSeguros implements VisitanteSeguros {
    @Override
    public double visitar(SeguroMedico seguroMedico) {
        return seguroMedico.obtenerCosto();
    }

    @Override
    public double visitar(SeguroVida seguroVida) {
        return seguroVida.obtenerCosto();
    }

    @Override
    public double visitar(SeguroAuto seguroAuto) {
        return seguroAuto.obtenerCosto();
    }
}