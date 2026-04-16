package br.com.fecaf.model;

public class Retangulo {
//    Criação dos atributos
private double lado1, lado2, area, perimetro;

    public Retangulo(double lado1, double lado2){
            System.out.println("Criei um retangulo!");

            this.lado1 = lado1;
            this.lado2 = lado2;

    }

    public boolean isQuadrado(){
        if (lado1 == lado2){
            System.out.println("É quadrado");
            return true;
        }else{
            System.out.println("Nâo é quadrado");
            return false;
        }
    }
    //calcular area

        public double calcularArea(){
            if (lado1 != 0 && lado2 != 0){
                area = lado1*lado2;
                return area;
            }  else{
                System.out.println("Preencha primerio os valores dos lados");
                return 0;
            }
        }

        //calcular perimetro
        public double calcularPerimetro(){
            if (lado1 != 0 && lado2 != 0){
                perimetro = lado1 *2 + lado2*2;
                return perimetro;
            }else{
                System.out.println("Preencha primeiro os valores dos lados");
                return 0;

            }
        }


    //Exibir valores do retangulo
        public void exibirRetangulo(){
        System.out.println("Dados Retangulo:");
        System.out.println("Lado 1" + lado1);
        System.out.println("Lado 2" + lado2);
        System.out.println("Area:"+ area);
        System.out.println("Perimetro" + perimetro);

        }

    //colocando o Get e o Set
        public double getLado1() {
            return lado1;
        }

        public void setLado1(double lado1) {
            this.lado1 = lado1;
        }

        public double getLado2() {
            return lado2;
        }

        public void setLado2(double lado2) {
            this.lado2 = lado2;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public double getPerimetro() {
            return perimetro;
        }

        public void setPerimetro(double perimetro) {
            this.perimetro = perimetro;
        }
    }

