package main;

import models.*;
import treino.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // aqui eu armazeno os dados do sistema
        List<Aluno> alunos = new ArrayList<>();
        List<FichaTreino> fichas = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Sistema de Academia ===");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Criar Ficha de Treino");
            System.out.println("4. Adicionar Treino a uma Ficha");
            System.out.println("5. Listar Fichas de Treino");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: // aqui eu cadastro o aluno
                    System.out.print("Nome do Aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF do Aluno: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Idade do Aluno: ");
                    int idade = scanner.nextInt();
                    System.out.print("Irá treinar com personal ou professor: ");
                    String personal = scanner.nextLine();


                    scanner.nextLine();
                    System.out.print("Gênero do Aluno: ");
                    String genero = scanner.nextLine();
                    System.out.print("Matrícula do Aluno: ");
                    String matricula = scanner.nextLine();

                    Aluno aluno = new Aluno(nome, cpf, idade, genero, matricula, personal);
                    alunos.add(aluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2: //Aqui eu vou listar os alunos cadastrados
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println("\nLista de Alunos:");
                        for (Aluno a : alunos) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 3: // aqui vou criar uma ficha de treino
                    System.out.print("Matrícula do Aluno para a Ficha: ");
                    String matriculaFicha = scanner.nextLine();
                    Aluno alunoFicha = buscarAlunoPorMatricula(alunos, matriculaFicha);

                    if (alunoFicha != null) {
                        FichaTreino ficha = new FichaTreino(alunoFicha);
                        fichas.add(ficha);
                        System.out.println("Ficha de treino criada para o aluno" + alunoFicha.getNome());
                                               
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Matrícula do Aluno para Adicionar Treino: ");
                    String matriculaTreino = scanner.nextLine();
                    FichaTreino fichaTreino = buscarFichaPorAluno(fichas, matriculaTreino);

                    if (fichaTreino != null) {
                        System.out.print("Nome do Exercício: ");
                        String nomeExercicio = scanner.nextLine();
                        System.out.print("Séries: ");
                        int series = scanner.nextInt();
                        System.out.print("Repetições: ");
                        int repeticoes = scanner.nextInt();
                        System.out.print("Intervalo (segundos): ");
                        int intervalo = scanner.nextInt();
                        scanner.nextLine();

                        Treino treino = new Treino(nomeExercicio, series, repeticoes, intervalo);
                        fichaTreino.adicionarTreino(treino);
                        System.out.println("Treino adicionado com sucesso!");
                    } else {
                        System.out.println("Ficha de treino não encontrada.");
                    }
                    break;

                case 5: // Listar Fichas de Treino cadastradas
                    if (fichas.isEmpty()) {
                        System.out.println("Nenhuma ficha de treino cadastrada.");
                    } else {
                        System.out.println("\nFichas de Treino:");
                        for (FichaTreino f : fichas) {
                            System.out.println(f);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

        private static Aluno buscarAlunoPorMatricula(List<Aluno> alunos, String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

        private static FichaTreino buscarFichaPorAluno(List<FichaTreino> fichas, String matricula) {
        for (FichaTreino ficha : fichas) {
            if (ficha.getAluno().getMatricula().equals(matricula)) {
                return ficha;
            }
        }
        return null;
    }
}