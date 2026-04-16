package br.com.fecaf.model;

public class Circulo {

    //atributos privados, utilizado para modificar o acesso
    private double raio, area, perimetro;

    //Construtor
    //O construtor define os valores iniciais do atribudo, ex: raio
    //No exato momento em que o objeto nasce cria a mensagem imprimida abaixo
       public Circulo(double raio){
           System.out.println("Criei um circulo! ");
           this.raio =raio;
       }


        //metodo de calculo do perimetro, utilizado o math.pi,para calcular PI e math.pow para calcular potenciação,
        // primeira  valor a se declarar é a base e o segundo é o valor que voce deseja elevar
        //uma biblioteca basica já inclusa no Java
        //Em caso do raio ser diferente de 0 ele passa e calcula a area utilizando as bibliotecas acima,
        //caso ele sejá 0 ou algum caractere indevido ele retornara a mensagem de erro abaixo
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

        //metodo de calculo do perimetro, utilizado o math.pi,
        //uma biblioteca basica já inclusa no Java
        //Explicação do codigo abaixo: caso o raio seja diferente de 0 ele fará o calculo,
        //caso ele sejá 0 ou algum caractere indevido ele retornara a mensagem de erro abaixo
        public double calcularPerimetro(){
            if(raio != 0){
                perimetro = 2 * Math.PI * raio;

                return perimetro;
            }else{
                System.out.println("Digite um valor valido");
                return 0;
            }
        }


        //metodo de exibição do circulo, listando raio, area e perimetro
        public void exibirCirculo(){
            System.out.println("Dados Circulo:");
            System.out.println("Raio:"+ raio);
            System.out.println("Area" + area);
            System.out.println("Perimetro" + perimetro);

        }

        //Os getters são utilizados para para pegar ou ler um valor, sempre acompanhado de um return
        //Os setters servem para definir os valores, sempre acompanhado do this. (alguma coisa),
        // sendo possivel deixar os valores mutaveis
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
