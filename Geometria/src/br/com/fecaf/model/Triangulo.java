package br.com.fecaf.model;

import java.util.Scanner;
//menu triangulo
public class Triangulo {
    private String tipo;
    private double lado1,lado2,base, altura, area;
    Scanner scanner = new Scanner(System.in);
    public void cadastrarTriangulo(){
        System.out.println("/* Cadastrar Triangulo */");
        System.out.println("Informe lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe a base");
        base = scanner.nextDouble();
        System.out.println("/****************************************/");
        System.out.println("Triangulo Cadastrado com Sucesso");
        System.out.println("/****************************************/");



    }

//validação do triangulo
    public boolean validarTriangulo(){
        if (lado1 + base > lado2 && lado1+lado2 >base && lado2 +base >lado1){
            System.out.println("Triangulo Valido");

            return true;


        }
        System.out.println("Triangulo Invalido");
        return false;
    }
//definição dos tipos de triangulo
    public void definirTipo(){
        System.out.println("/*** Definir tipo ***/");

        //isosceles -> Escaleno -> Equilatero

        if (lado1 == lado2 && lado2 == base){
            System.out.println("Esse triangulo é equilatero");
            tipo = "Equilatero";
        } else if (lado1 != lado2 && lado2 !=base && base != lado1) {
            System.out.println("Esse triangulo é Escaleno");
            tipo = "Escaleno";
        } else {
            System.out.println("Esse triangulo é Isosceles");
            tipo = "Isosceles";
        }    }}
