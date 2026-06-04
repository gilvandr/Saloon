import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        Usuario usuario = new Usuario(001,"João","joao123@gmail.com", "Senha123", "(62) 9 9876-5432");
        Lotacao lotacao = new Lotacao(1, "Chácara", 50, "Setor Norte",250, true, "Casamentos e cerimonial");
        Cliente cliente = new Cliente(001, "Pedro", "4002-8922", "pedro555@gmail.com");
        Reserva reserva = new Reserva(003, LocalDate.of(2026,8,11), "Disponível", 250);

        System.out.println(reserva.dataEvento);




    }
}