import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Hospede {

    private String nome;
    private ArrayList<Reserva> reservas;

    public Hospede(String nome, ArrayList<Reserva> reservas) {
        this.nome = nome;
        this.reservas = reservas;
    }

    public Hospede() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Hospede{" +
                "nome='" + nome + '\'' +
                ", reservas=" + reservas +
                '}';
    }
}
