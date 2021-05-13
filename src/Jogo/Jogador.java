package Jogo;



    public class Jogador {

       private String nome;
        private  char simbolo;
        private int sorte;
        boolean venceu = false;
        private boolean foi;




        public void setNome(String nome) {//metodo para atribuir nome ao objeto jogador
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setSimbolo(char simbolo) {//metodo para atribuir o simbolo o qual o jogador utilizara para jogar
                    this.simbolo = simbolo;

                if (getSimbolo() == 'x' || getSimbolo() == 'o' ) {
                    this.simbolo = simbolo;
                    setFoi(true);
                } else {
                    System.out.println("O simbolo não esta presente nas opções, tente novamente");
                   //Logica que evita o jogador escolher outro simbolo
                    //a nao ser x ou o
            }
        }

        public char getSimbolo() {
            return simbolo;
        }

        public void setSorte(int sorte) {//metodo para atribuir se o jogador escolhe na classe main, o escopo 1 ou 2 do sorteio
            this.sorte = sorte; //para quem começar a jogar
        }

        public int getSorte() {
            return sorte;
        }
        public boolean getFoi(){
            return foi;
        }

        private void setFoi(boolean foi) {
            this.foi = foi;
        }
    }




