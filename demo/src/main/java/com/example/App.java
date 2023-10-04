package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ArCondicionado arCondicionado = new ArCondicionado();
        Termostato termostato = new Termostato(25);
        FechaduraEletronica fechadura = new FechaduraEletronica();
        DetectarMovimento sensorMovimento = new DetectarMovimento();
        SistemaSeguranca sistemaSeguranca = new SistemaSeguranca();

        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("/n--------- Menu ----------");
            System.out.println("1. Controlar Luz");
            System.out.println("2. Controlar Ar Condicionado");
            System.out.println("3. Ajustar Termostato");
            System.out.println("4. Controlar Fechadura Eletrônica");
            System.out.println("5. Verificar Movimento");
            System.out.println("6. Controlar Sistema de Segurança");
            System.out.println("7. Ver status da Luz");
            System.out.println("8. Ver status do Ar Condicionado");
            System.out.println("9. Ver status do Termostato");
            System.out.println("10. Ver status da Fechadura Eletrônica");
            System.out.println("11. Ver status do Sistema de Segurança");
            System.out.println("12. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n----- Controle de Luz -----");
                    System.out.println("1. Ligar");
                    System.out.println("2. Desligar");
                    System.out.print("Escolha uma opção: ");
                    int escolhaLuz = scanner.nextInt();
                    if (escolhaLuz == 1) {
                        luz.ligar();
                    } else if (escolhaLuz == 2) {
                        luz.desligar();
                    }
                    break;
                case 2:
                    System.out.println("\n----- Controle de Ar Condicionado -----");
                    System.out.println("1. Aumentar Temperatura");
                    System.out.println("2. Diminuir Temperatura");
                    System.out.print("Escolha uma opção: ");
                    int escolhaArCondicionado = scanner.nextInt();
                    if (escolhaArCondicionado == 1) {
                        arCondicionado.aumentarTemperatura();
                    } else if (escolhaArCondicionado == 2) {
                        arCondicionado.diminuirTemperatura();
                    }
                    break;
                case 3:
                    // Menu de ajuste de termostato
                    System.out.println("\n----- Ajuste de Termostato -----");
                    System.out.print("Digite a nova temperatura desejada: ");
                    int novaTemperatura = scanner.nextInt();
                    termostato.ajustarTemperaturaDesejada(novaTemperatura);
                    break;
                case 4:
                    // Menu de controle de fechadura eletrônica
                    System.out.println("\n----- Controle de Fechadura Eletrônica -----");
                    System.out.println("1. Trancar");
                    System.out.println("2. Destrancar");
                    System.out.print("Escolha uma opção: ");
                    int escolhaFechadura = scanner.nextInt();
                    if (escolhaFechadura == 1) {
                        fechadura.trancar();
                    } else if (escolhaFechadura == 2) {
                        fechadura.destrancar();
                    }
                    break;
                case 5:
                    // Verificar movimento
                    boolean movimentoDetectado = sensorMovimento.verificarMovimento();
                    if (movimentoDetectado) {
                        System.out.println("\nMovimento detectado!");
                    } else {
                        System.out.println("\nNenhum movimento detectado.");
                    }
                    break;
                case 6:
                    // Menu de controle do sistema de segurança
                    System.out.println("\n----- Controle do Sistema de Segurança -----");
                    System.out.println("1. Ativar");
                    System.out.println("2. Desativar");
                    System.out.print("Escolha uma opção: ");
                    int escolhaSeguranca = scanner.nextInt();
                    if (escolhaSeguranca == 1) {
                        sistemaSeguranca.ativar();
                    } else if (escolhaSeguranca == 2) {
                        sistemaSeguranca.desativar();
                    }
                    break;
                case 7:
                    System.out.println("\n----- Status da Luz -----");
                    if (luz.isLigada()) {
                        System.out.println("A luz está ligada.");
                    } else {
                        System.out.println("A luz está desligada.");
                    }
                    break;
                case 8:
                    System.out.println("\n----- Status do Ar Condicionado -----");
                    System.out.println("Temperatura atual: " + arCondicionado.getTemperatura() + "°C");
                    break;
                case 9:
                    // Menu de ver status do termostato
                    System.out.println("\n----- Status do Termostato -----");
                    System.out.println("Temperatura desejada: " + termostato.getTemperaturaDesejada() + "°C");
                    break;
                case 10:
                    // Menu de ver status da fechadura eletrônica
                    System.out.println("\n----- Status da Fechadura Eletrônica -----");
                    if (fechadura.isTrancada()) {
                        System.out.println("A fechadura está trancada.");
                    } else {
                        System.out.println("A fechadura está destrancada.");
                    }
                    break;
                case 11:
                    // Menu de ver status do sistema de segurança
                    System.out.println("\n----- Status do Sistema de Segurança -----");
                    if (sistemaSeguranca.isAtivado()) {
                        System.out.println("O sistema de segurança está ativado.");
                    } else {
                        System.out.println("O sistema de segurança está desativado.");
                    }
                    break;
                case 12:
                    System.out.println("Saindo do aplicativo.");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
