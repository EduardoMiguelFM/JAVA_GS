package Teste;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

import Models.*;

public class Main {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Conteudo> conteudos = new ArrayList<>();
    private static List<Doacao> doacoes = new ArrayList<>();
    private static List<Local> locais = new ArrayList<>();
    private static List<Eventos> eventos = new ArrayList<>();
    private static List<RecursoMarinho> recursosMarinhos = new ArrayList<>();
    private static List<DadosPoluicao> dadosPoluicaoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            exibirMenu();
            escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (escolha) {
                case 1:
                    criarOuAtualizarUsuario(scanner);
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    criarOuAtualizarConteudo(scanner);
                    break;
                case 4:
                    listarConteudos();
                    break;
                case 5:
                    criarOuAtualizarDoacao(scanner);
                    break;
                case 6:
                    listarDoacoes();
                    break;
                case 7:
                    criarOuAtualizarLocal(scanner);
                    break;
                case 8:
                    listarLocais();
                    break;
                case 9:
                    criarOuAtualizarEvento(scanner);
                    break;
                case 10:
                    listarEventos();
                    break;
                case 11:
                    criarOuAtualizarRecursoMarinho(scanner);
                    break;
                case 12:
                    listarRecursosMarinhos();
                    break;
                case 13:
                    criarOuAtualizarDadosPoluicao(scanner);
                    break;
                case 14:
                    listarDadosPoluicao();
                    break;
                case 15:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (escolha != 15);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n----- Menu -----");
        System.out.println("1. Criar/Atualizar Usuário\t\t2. Listar Usuários");
        System.out.println("3. Criar/Atualizar Conteúdo\t\t4. Listar Conteúdos");
        System.out.println("5. Criar/Atualizar Doação\t\t6. Listar Doações");
        System.out.println("7. Criar/Atualizar Local\t\t8. Listar Locais");
        System.out.println("9. Criar/Atualizar Evento\t\t10. Listar Eventos");
        System.out.println("11. Criar/Atualizar Recursos Marinhos\t\t12. Listar Recursos Marinhos");
        System.out.println("13. Criar/Atualizar Dados de Poluição\t\t14. Listar Dados de Poluição");
        System.out.println("15. Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Métodos para criar/atualizar/listar Usuario
    private static void criarOuAtualizarUsuario(Scanner scanner) {
        System.out.print("Deseja criar um novo usuário (S/N)? ");
        String resposta = scanner.nextLine().toUpperCase();
        if (resposta.equals("S")) {
            criarUsuario(scanner);
        } else if (resposta.equals("N")) {
            // Implementar atualização de usuário
            System.out.println("Atualizando usuário...");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void criarUsuario(Scanner scanner) {
        System.out.print("Nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Email do usuário: ");
        String email = scanner.nextLine();
        System.out.print("Senha do usuário: ");
        String senha = scanner.nextLine();

        Usuario novoUsuario = new Usuario(nome, email, senha);
        usuarios.add(novoUsuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void listarUsuarios() {
        System.out.println("\n----- Usuários -----");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario.exibirInfo());
                System.out.println("-------------------");
            }
        }
    }

    // Métodos para criar/atualizar/listar Conteudo
    private static void criarOuAtualizarConteudo(Scanner scanner) {
        System.out.print("Deseja criar um novo conteúdo (S/N)? ");
        String resposta = scanner.nextLine().toUpperCase();
        if (resposta.equals("S")) {
            criarConteudo(scanner);
        } else if (resposta.equals("N")) {
            // Implementar atualização de conteúdo
            System.out.println("Atualizando conteúdo...");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void criarConteudo(Scanner scanner) {
        System.out.print("Título do conteúdo: ");
        String titulo = scanner.nextLine();
        System.out.print("Descrição do conteúdo: ");
        String descricao = scanner.nextLine();
        System.out.print("Tipo do conteúdo: ");
        String tipo = scanner.nextLine();
        Conteudo conteudo = new Conteudo(titulo, descricao, tipo);
        conteudos.add(conteudo);
        System.out.println("Conteúdo criado com sucesso:");
        System.out.println(conteudo.exibirInfo());
    }

    private static void listarConteudos() {
        System.out.println("\n----- Conteúdos -----");
        if (conteudos.isEmpty()) {
            System.out.println("Nenhum conteúdo cadastrado.");
        } else {
            for (Conteudo conteudo : conteudos) {
                System.out.println(conteudo.exibirInfo());
                System.out.println("---------------------");
            }
        }
    }

    // Métodos para criar/atualizar/listar Doacao
    private static void criarOuAtualizarDoacao(Scanner scanner) {
        System.out.print("Deseja criar uma nova doação (S/N)? ");
        String resposta = scanner.nextLine().toUpperCase();
        if (resposta.equals("S")) {
            criarDoacao(scanner);
        } else if (resposta.equals("N")) {
            // Implementar atualização de doação
            System.out.println("Atualizando doação...");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void criarDoacao(Scanner scanner) {
        System.out.print("ID do usuário: ");
        String usuarioId = scanner.nextLine();
        System.out.print("Valor da doação: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir quebra de linha
        System.out.print("Forma de pagamento: ");
        String formaPagamento = scanner.nextLine();
        Doacao doacao = new Doacao(usuarioId, valor, formaPagamento);
        doacoes.add(doacao);
        System.out.println("Doação criada com sucesso:");
        System.out.println(doacao.exibirInfo());
    }

    private static void listarDoacoes() {
        System.out.println("\n----- Doações -----");
        if (doacoes.isEmpty()) {
            System.out.println("Nenhuma doação cadastrada.");
        } else {
            for (Doacao doacao : doacoes) {
                System.out.println(doacao.exibirInfo());
                System.out.println("-------------------");
            }
        }
    }

    // Métodos para criar/atualizar/listar Local
    private static void criarOuAtualizarLocal(Scanner scanner) {
        System.out.print("Deseja criar um novo local (S/N)? ");
        String resposta = scanner.nextLine().toUpperCase();
        if (resposta.equals("S")) {
            criarLocal(scanner);
        } else if (resposta.equals("N")) {
            // Implementar atualização de local
            System.out.println("Atualizando local...");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void criarLocal(Scanner scanner) {
        System.out.print("Nome do local: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição do local: ");
        String descricao = scanner.nextLine();
        Local local = new Local(nome, descricao);
        locais.add(local);
        System.out.println("Local criado com sucesso:");
        System.out.println(local.exibirInfo());
    }

    private static void listarLocais() {
        System.out.println("\n----- Locais -----");
        if (locais.isEmpty()) {
            System.out.println("Nenhum local cadastrado.");
        } else {
            for (Local local : locais) {
                System.out.println(local.exibirInfo());
                System.out.println("-----------------");
            }
        }
    }

    // Métodos para criar/atualizar/listar Eventos
    private static void criarOuAtualizarEvento(Scanner scanner) {
        System.out.print("Deseja criar um novo evento (S/N)? ");
        String resposta = scanner.nextLine().toUpperCase();
        if (resposta.equals("S")) {
            criarEvento(scanner);
        } else if (resposta.equals("N")) {
            // Implementar atualização de evento
            System.out.println("Atualizando evento...");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void criarEvento(Scanner scanner) {
        System.out.print("Nome do evento: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição do evento: ");
        String descricao = scanner.nextLine();
        System.out.print("Data do evento (dd/MM/yyyy): ");
        String dataEventoStr = scanner.nextLine();
        System.out.print("Local do evento: ");
        String local = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataEvento = sdf.parse(dataEventoStr);
            Eventos evento = new Eventos(nome, descricao, dataEvento, local);
            eventos.add(evento);
            System.out.println("Evento criado com sucesso:");
            System.out.println(evento.exibirInfo());
        } catch (ParseException e) {
            System.out.println("Data no formato incorreto. Utilize o formato dd/MM/yyyy.");
        }
    }

    private static void listarEventos() {
        System.out.println("\n----- Eventos -----");
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            for (Eventos evento : eventos) {
                System.out.println(evento.exibirInfo());
                System.out.println("------------------");
            }
        }
    }

    // Métodos para criar/atualizar/listar RecursoMarinho
    private static void criarOuAtualizarRecursoMarinho(Scanner scanner) {
        System.out.print("Deseja criar um novo recurso marinho (S/N)? ");
        String resposta = scanner.nextLine().toUpperCase();
        if (resposta.equals("S")) {
            criarRecursoMarinho(scanner);
        } else if (resposta.equals("N")) {
            // Implementar atualização de recurso marinho
            System.out.println("Atualizando recurso marinho...");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void criarRecursoMarinho(Scanner scanner) {
        System.out.print("Nome do recurso marinho: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo do recurso marinho: ");
        String tipo = scanner.nextLine();
        System.out.print("Descrição do recurso marinho: ");
        String descricao = scanner.nextLine();
        RecursoMarinho recursoMarinho = new RecursoMarinho(nome, tipo, descricao);
        recursosMarinhos.add(recursoMarinho);
        System.out.println("Recurso marinho criado com sucesso:");
        System.out.println(recursoMarinho.exibirInfo());
    }

    private static void listarRecursosMarinhos() {
        System.out.println("\n----- Recursos Marinhos -----");
        if (recursosMarinhos.isEmpty()) {
            System.out.println("Nenhum recurso marinho cadastrado.");
        } else {
            for (RecursoMarinho recursoMarinho : recursosMarinhos) {
                System.out.println(recursoMarinho.exibirInfo());
                System.out.println("---------------------------");
            }
        }
    }

    // Métodos para criar/atualizar/listar DadosPoluicao
    private static void criarOuAtualizarDadosPoluicao(Scanner scanner) {
        System.out.print("Deseja criar novos dados de poluição (S/N)? ");
        String resposta = scanner.nextLine().toUpperCase();
        if (resposta.equals("S")) {
            criarDadosPoluicao(scanner);
        } else if (resposta.equals("N")) {
            atualizarDadosPoluicao(scanner);
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void criarDadosPoluicao(Scanner scanner) {
        System.out.print("Tipo de poluição: ");
        String tipoPoluicao = scanner.nextLine();
        System.out.print("Nível de poluição: ");
        double nivelPoluicao = Double.parseDouble(scanner.nextLine());
        System.out.print("Fonte de poluição: ");
        String fontePoluicao = scanner.nextLine();
        System.out.print("Impacto ambiental: ");
        String impactoAmbiental = scanner.nextLine();

        DadosPoluicao novoDadosPoluicao = new DadosPoluicao(tipoPoluicao, nivelPoluicao, fontePoluicao, impactoAmbiental);
        dadosPoluicaoList.add(novoDadosPoluicao);
        System.out.println("Dados de poluição cadastrados com sucesso!");
    }

    private static void atualizarDadosPoluicao(Scanner scanner) {
        System.out.print("ID do dado de poluição a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        DadosPoluicao dadosPoluicao = encontrarDadosPoluicaoPorId(id);
        if (dadosPoluicao != null) {
            System.out.print("Novo tipo de poluição: ");
            String tipoPoluicao = scanner.nextLine();
            System.out.print("Novo nível de poluição: ");
            double nivelPoluicao = Double.parseDouble(scanner.nextLine());
            System.out.print("Nova fonte de poluição: ");
            String fontePoluicao = scanner.nextLine();
            System.out.print("Novo impacto ambiental: ");
            String impactoAmbiental = scanner.nextLine();

            dadosPoluicao.setTipoPoluicao(tipoPoluicao);
            dadosPoluicao.setNivelPoluicao(nivelPoluicao);
            dadosPoluicao.setFontePoluicao(fontePoluicao);
            dadosPoluicao.setImpactoAmbiental(impactoAmbiental);
            System.out.println("Dados de poluição atualizados com sucesso!");
        } else {
            System.out.println("Dados de poluição com ID " + id + " não encontrado.");
        }
    }

    private static DadosPoluicao encontrarDadosPoluicaoPorId(int id) {
        for (DadosPoluicao dadosPoluicao : dadosPoluicaoList) {
            if (dadosPoluicao.getId() == id) {
                return dadosPoluicao;
            }
        }
        return null;
    }


    private static void listarDadosPoluicao() {
        System.out.println("\n----- Dados de Poluição -----");
        if (dadosPoluicaoList.isEmpty()) {
            System.out.println("Nenhum dado de poluição cadastrado.");
        } else {
            for (DadosPoluicao dadosPoluicao : dadosPoluicaoList) {
                System.out.println(dadosPoluicao.exibirInfo());
                System.out.println("-------------------");
            }
        }
    }
}
