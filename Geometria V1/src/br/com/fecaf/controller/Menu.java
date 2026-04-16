package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Circulo circulo = null;

    Retangulo retangulo = null;

    public void executarMenu(){

        boolean continuar = true;

        do{

            System.out.println("/*******************************/");
            System.out.println("/**************MENU*************/");
            System.out.println("/*******************************/");
            System.out.println("1 -  Circulo");
            System.out.println("2 -  Retangulo");
            System.out.println("3 - Triangulo (666)");
            System.out.println("/**********************scanner*********/");

            System.out.println("Escolha uma opção: ");

            String userOption = scanner.nextLine();

            String userOptionMin = userOption.toLowerCase();

            switch (userOption){
                case "circulo":
                    boolean exitCirculo = false;


                    while (!exitCirculo){

                        System.out.println("/******* Menu Circulo ********/");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Calcular Area");
                        System.out.println("3 - Calcular Perimetro");
                        System.out.println("4 - Exibir");
                        System.out.println("5 - Menu Principal");

                        System.out.println("Escolha uma opção: ");

                        int userOptionCirculo = scanner.nextInt();
                        scanner.nextLine();

                        switch (userOptionCirculo){
                            case 1:

                                System.out.println("Informe o valor dor raio: ");

                                double raio = scanner.nextDouble();


                                //instanciar o CIrculo
                                this.circulo = new Circulo(raio);
                                break;
                                case 2:
                                this.circulo.calcularArea();
                                circulo.calcularArea();
                                break;
                            case 3:
                                this.circulo.calcularPerimetro();
                                break;
                            case 4:
                                this.circulo.exibirCirculo();
                                break;
                            case 5:
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida!");

                        }
                    }
                    break;
                case "retangulo":
                    exitCirculo = false;

                    while(!exitCirculo){
                    System.out.println("/* Menu Retangulo */");
                    System.out.println("1 - Cadastrar retangulo");
                    System.out.println("2 - Calcular Area");
                    System.out.println("3 - Calcular Perimetro");
                    System.out.println("4 - Exibir");
                    System.out.println("5 - Menu Principal");


                        int userRetangulo = scanner.nextInt();

                        switch (userRetangulo){
                            case 1:
                                System.out.println("Informe o lado 1 do retangulo:");

                                double lado1 = scanner.nextDouble();

                                System.out.println("Informe o lado 2 do retangulo:");

                                double lado2 = scanner.nextDouble();

                                this.retangulo = new Retangulo(lado1,lado2);


                            case 2:
                                this.retangulo.calcularArea();
                                retangulo.calcularArea();
                                break;
                            case 3:
                                this.retangulo.calcularPerimetro();
                                retangulo.calcularPerimetro();
                                break;
                            case 4:
                                this.retangulo.exibirRetangulo();
                                break;
                            case 5:
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida! ");

                        }
                    }
                    break;
                case "triangulo":

                    break;

                default:
                    System.out.println("Escolha uma opção valida");
            }

        }while(continuar);
    }
}
