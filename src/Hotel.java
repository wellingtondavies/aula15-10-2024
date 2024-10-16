import java.util.ArrayList;

public class Hotel {

    private ArrayList<Quarto> ListaQuartos;
    private ArrayList<Reserva> ListaReservas;
    private ArrayList<Hospede> ListaHospedes ;

    public Hotel(ArrayList<Quarto> listaQuartos, ArrayList<Reserva> listaReservas, ArrayList<Hospede> listaHospedes) {
        ListaQuartos = listaQuartos;
        ListaReservas = listaReservas;
        ListaHospedes = listaHospedes;
    }

    public Hotel() {

    }

    public ArrayList<Quarto> getListaQuartos() {
        return ListaQuartos;
    }

    public void setListaQuartos(ArrayList<Quarto> listaQuartos) {
        ListaQuartos = listaQuartos;
    }

    public ArrayList<Reserva> getListaReservas() {
        return ListaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        ListaReservas = listaReservas;
    }

    public ArrayList<Hospede> getListaHospedes() {
        return ListaHospedes;
    }

    public void setListaHospedes(ArrayList<Hospede> listaHospedes) {
        ListaHospedes = listaHospedes;
    }
}
