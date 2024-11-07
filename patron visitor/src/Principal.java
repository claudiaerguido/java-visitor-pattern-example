public class Principal {
    public static void main(String[] args) {
        SeguroMedico seguroMedico = new SeguroMedico(500);
        SeguroVida seguroVida = new SeguroVida(1000);
        SeguroAuto seguroAuto = new SeguroAuto(800);

        VisitanteCostoSeguros visitanteCostoSeguros = new VisitanteCostoSeguros();

        double costoMedico = seguroMedico.aceptar(visitanteCostoSeguros);
        double costoVida = seguroVida.aceptar(visitanteCostoSeguros);
        double costoAuto = seguroAuto.aceptar(visitanteCostoSeguros);

        System.out.println("Costo del seguro médico: " + costoMedico);
        System.out.println("Costo del seguro de vida: " + costoVida);
        System.out.println("Costo del seguro de automóvil: " + costoAuto);
    }
}
