import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static Scanner scan  = new Scanner(System.in);
    public static Quarto quarto = new Quarto();
    public static Hotel hotel = new Hotel();
    public static Reserva reserva = new Reserva();

    public static void main(String[] args) {
        boolean rodar = true;

        System.out.println(" SISTEMA DE GERENCIAMENTO DE HOTEL \n");


        while (rodar) {
            System.out.println(" ESCOLHA ENTRE AS OPÇÕES \n");
            System.out.println("""
                        1. CADASTRO DE QUARTOS
                        2. CADASTRO DE RESERVAS
                        3. RELATORIO CHECK-IN
                        4. RELATORIO CHECK-OUT
                        5. RELATÓRIO DE OCUPAÇÃO
                        6. HISTÓRICO DE RESERVAS POR HÓSPEDE
                        7. SAIR
                    """);
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:{
                    cadastroQuartos();
                    break;
                }
                case 2:{

                }
            }

        }
    }

    public static void cadastroQuartos() {
        System.out.println("CADASTRO DE QUARTOS");
        boolean rodarMetodo = true;
        while (rodarMetodo){
            System.out.println(" DIGITE O NUMERO DO QUARTO \n");
            int numero = scan.nextInt();

            System.out.println(" TIPOS DE QUARTO \n");
            System.out.println(" 1 - SOLTEIRO | 2 - CASAL | 3 - SUITE \n");
            int opcao = scan.nextInt();

            System.out.println( " PREÇO DIARIO DO QUARTO \n");
            double preco = scan.nextDouble();

            System.out.println(" DISPONIBILIDADE \n");
            boolean disponibilidade = true;

            System.out.println(" QUARTO AUTOMATICAMENTE DEFINIDO PARA DISPONIVEL \n");

            Quarto quarto1 = new Quarto(numero, opcao, preco, disponibilidade);
            hotel.getListaQuartos().add(quarto1);

            System.out.println(" DESEJA ADICIONAR MAIS QUARTOS \n");
            System.out.println(" 1 - sim | 2 - não ");
            int opcao2 = scan.nextInt();

            if (opcao2 == 2){
                rodarMetodo = false;
                break;
            }
        }
    }

    public static void cadastroReservas() {
        System.out.println("CADASTRO DE RESERVAS");
        boolean rodarMetodo = true;

        while (rodarMetodo){
            System.out.println(" DIGITE O NOME DO HOSPEDE: \n");
            String nome = scan.next();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dia/Mes/ano");

            System.out.println("DATA DE CHECK-IN (dia/Mes/ano) ? ");
            String checkin = scan.nextLine();

            LocalDate data = LocalDate.parse(checkin, formatter);

            System.out.println("DATA DE CHECK-OUT (dia/Mes/ano) ? ");
            String checkout = scan.nextLine();

            LocalDate dataCheckout = LocalDate.parse(checkout, formatter);

            System.out.println(" QUANTOS QUARTOS RESERVADOS \n");
            int quartos = scan.nextInt();

            System.out.println(" TIPO DE QUARTO \n");
            System.out.println(" 1 - solteiro | 2 - casal | 3 - suite \n");
            int opcao = scan.nextInt();

            Reserva reserva1 = new Reserva(nome, data, dataCheckout, quartos, opcao);
            hotel.getListaReservas().add(reserva1);

            System.out.println(" DESEJA ADICIONAR MAIS RESERVAS \n");
            System.out.println(" 1 - SIM | 2 - NÃO \n");

            int opcao2 = scan.nextInt();
            if (opcao2 == 2){
                System.out.println(" RESERVAS CONCLUIDAS \n");
                rodarMetodo = false;
                break;
            }
        }
    }
    public static void relatorioCheckin() {

    }
}