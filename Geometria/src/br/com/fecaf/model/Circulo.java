package br.com.fecaf.model;

public class Circulo {

    private double raio, area, perimetro;

    //Construtor

       public Circulo(double raio){
           System.out.println("Criei um circulo! ");
           this.raio =raio;
       }

        public double calcularArea(){
            if (raio!= 0){
    //            area = raio *raio *3.14;
                area = Math.PI * Math.pow(raio, 2);

                return area;
            }else{
                System.out.println("Digite um valor valido");

                return 0;
            }
        }
        public double calcularPerimetro(){
            if(raio != 0){
                perimetro = 2 * Math.PI * raio;

                return perimetro;
            }else{
                System.out.println("Digite um valor valido");
                return 0;
            }
        }

        public void exibirCirculo(){
            System.out.println("Dados Circulo:");
            System.out.println("Raio:"+ raio);
            System.out.println("Area" + area);
            System.out.println("Perimetro" + perimetro);

        }
        public double getRaio() {
            return raio;
        }

        public void setRaio(double raio) {
            this.raio = raio;
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
