import java.time.LocalDate;

public class Reserva {

    private String NomeHospede;
    private LocalDate DataDeCheck_in;
    private LocalDate DataDeCheck_out;
    private int NumDeQuartosReservados;
    private String TipoDeQuartoReservado;

    public Reserva(String nomeHospede, LocalDate dataDeCheck_in, LocalDate dataDeCheck_out, int numDeQuartosReservados, String tipoDeQuartoReservado) {
        NomeHospede = nomeHospede;
        DataDeCheck_in = dataDeCheck_in;
        DataDeCheck_out = dataDeCheck_out;
        NumDeQuartosReservados = numDeQuartosReservados;
        TipoDeQuartoReservado = tipoDeQuartoReservado;
    }

    public Reserva() {

    }

    public String getNomeHospede() {
        return NomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        NomeHospede = nomeHospede;
    }

    public LocalDate getDataDeCheck_in() {
        return DataDeCheck_in;
    }

    public void setDataDeCheck_in(LocalDate dataDeCheck_in) {
        DataDeCheck_in = dataDeCheck_in;
    }

    public LocalDate getDataDeCheck_out() {
        return DataDeCheck_out;
    }

    public void setDataDeCheck_out(LocalDate dataDeCheck_out) {
        DataDeCheck_out = dataDeCheck_out;
    }

    public int getNumDeQuartosReservados() {
        return NumDeQuartosReservados;
    }

    public void setNumDeQuartosReservados(int numDeQuartosReservados) {
        NumDeQuartosReservados = numDeQuartosReservados;
    }

    public String getTipoDeQuartoReservado() {
        return TipoDeQuartoReservado;
    }

    public void setTipoDeQuartoReservado(String tipoDeQuartoReservado) {
        TipoDeQuartoReservado = tipoDeQuartoReservado;
    }

    @Override
    public String toString() {
        return "Reservas{" +
                "Hospede - " + NomeHospede + '\'' +
                ", data de check_in - " + DataDeCheck_in +
                ", data de check_out - " + DataDeCheck_out +
                ", quartos reservados - " + NumDeQuartosReservados +
                ", tipo de quarto reservado - " + TipoDeQuartoReservado +
                '}';
    }
}
