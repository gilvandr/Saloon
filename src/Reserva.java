import java.time.LocalDate;

public class Reserva {

    public int idReserva;
    public LocalDate dataEvento;
    public String status;
    public float valorTotal;

    public Reserva(int idReserva, LocalDate dataEvento, String status, float valorTotal) {
        this.idReserva = idReserva;
        this.dataEvento = dataEvento;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public void reservar () {}
    public void cancelar () {}
    public void confirmar () {}

}
