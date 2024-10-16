public class Quarto {

    private int NumeroQuarto;
    private String TipoQuarto;
    private double Preco;
    private boolean Disponibilidade;

    public Quarto(int numeroQuarto, String tipoQuarto, double preco, boolean disponibilidade) {
        NumeroQuarto = numeroQuarto;
        TipoQuarto = tipoQuarto;
        Preco = preco;
        Disponibilidade = disponibilidade;
    }

    public Quarto() {

    }

    public int getNumeroQuarto() {
        return NumeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        NumeroQuarto = numeroQuarto;
    }

    public String getTipoQuarto() {
        return TipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        TipoQuarto = tipoQuarto;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public boolean isDisponibilidade() {
        return Disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        Disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "NumeroQuarto=" + NumeroQuarto +
                ", TipoQuarto=" + TipoQuarto +
                ", Preco=" + Preco +
                ", Disponibilidade=" + Disponibilidade +
                '}';
    }
}
