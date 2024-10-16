import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static Scanner scan  = new Scanner(System.in);
    public static Quarto quarto = new Quarto();
    public static Hotel hotel = new Hotel();
    public static Reserva reserva = new Reserva();

    public static void main(String[] args) {
        inicializador();
        boolean rodar = true;

        System.out.println(" SISTEMA DE GERENCIAMENTO DE HOTEL \n");

        // Main temporariamente inacabado.
        while (rodar) {
            System.out.println(" ESCOLHA ENTRE AS OPÇÕES \n");
            System.out.println("""
                        1. CADASTRO DE QUARTOS
                        2. CADASTRO DE RESERVAS
                        3. RELATORIO CHECK-IN / CHECK-OUT
                        4. HISTÓRICO DE RESERVAS POR HÓSPEDE
                        5. SAIR
                    """);
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:{
                    cadastroQuartos();
                    break;
                }
                case 2:{
                    cadastroReservas();
                    break;
                }
                case 3:{
                    relatorioCheckin();
                    break;
                }
                case 4:{
                    relatorioReservas();
                    break;
                }
                case 5:{
                   rodar = false;
                   break;
                }
                default:{
                    System.out.println("****** ERRO ****** ");
                    System.out.println(" TENTE NOVAMENTE ");
                    break;
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
            System.out.println(" - SOLTEIRO | - CASAL | - SUITE \n");
            String opcao = scan.next();

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

            System.out.println(" QUARTOS DISPONIVEIS ");
            for (int i = 0; i < hotel.getListaQuartos().size(); i++) {
                System.out.println(hotel.getListaQuartos().get(i).toString());
            }

            System.out.println(" QUAL QUARTO DESEJA? ");
            int opcaoo = scan.nextInt();

            for (Quarto quarto1 : hotel.getListaQuartos()) {
                if (opcaoo == quarto1.getNumeroQuarto()) {
                    System.out.println("QUARTO SELECIONADO");
                    quarto1.setDisponibilidade(false);
                }
            }

            System.out.println(" QUANTOS QUARTOS RESERVADOS \n");
            int quartos = scan.nextInt();

            System.out.println(" TIPO DE QUARTO \n");
            System.out.println(" - solteiro | - casal | - suite \n");
            String opcao = scan.next();

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
        int atualizador = 0;

        System.out.println(" EXIBINDO QUARTOS OCUPADOS ");
        for (Quarto quarto1 : hotel.getListaQuartos()) {
            if(quarto1.isDisponibilidade() == false ){
                atualizador++;
                System.out.println(quarto1.toString());
                LocalDate datain = reserva.getDataDeCheck_in();
                LocalDate dataout = reserva.getDataDeCheck_out();

                System.out.println("o periodo de ocupação vai de: "+datain+" a "+dataout);
            }
        }
        System.out.println(" existem "+atualizador+" quartos ocupados \n");


        System.out.println("deseja eliminar alguma reserva? ( 1 - sim | 2 - não ) ");
        int opcao = scan.nextInt();

        System.out.println(" digite o numero do quarto que deseja eliminar a reserva: ");
        int id = scan.nextInt();

            if (opcao == 1){
                for (Quarto quarto1 : hotel.getListaQuartos()) {
                    if(id == quarto1.getNumeroQuarto()){
                        quarto1.setDisponibilidade(true);
                        hotel.getListaReservas().remove(quarto1);
                        System.out.println(" status do quarto alterado para disponivel ");
                    }
                }
            }
    }
    public static void relatorioReservas() {
        System.out.println(" historico de reservas ");
        for (Reserva reserva1 : hotel.getListaReservas()) {
            System.out.println(reserva1.toString());
        }
    }
    public static void inicializador(){
        Quarto quartofixo1 = new Quarto(10, " solteiro ", 150.0, true);
        hotel.getListaQuartos().add(quartofixo1);
        Quarto quartofixo2 = new Quarto(11, " casal ", 300.0, true);
        hotel.getListaQuartos().add(quartofixo2);
        Quarto quartofixo3 = new Quarto(12, " suite ", 400.0, true);
        hotel.getListaQuartos().add(quartofixo3);

        Reserva reservaFixa1 = new Reserva(" adao ", LocalDate.of(24,10,16), LocalDate.of(24,10,17), 1, " solteiro ");
        hotel.getListaReservas().add(reservaFixa1);
        Reserva reservaFixa2 = new Reserva(" eva ", LocalDate.of(24,10,16), LocalDate.of(24,10,17), 1, " casal ");
        hotel.getListaReservas().add(reservaFixa2);
        Reserva reservaFixa3 = new Reserva(" lili ", LocalDate.of(24,10,16), LocalDate.of(24,10,17), 1, " suite ");
    }
}