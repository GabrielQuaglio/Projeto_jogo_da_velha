package Jogo;



    public class Jogador {

        String nome;
        char simbolo;
        int sorte;
        boolean venceu = false;


        public void setNome(String nome) {//metodo para atribuir nome ao objeto jogador
            this.nome = nome;
        }

        public void setSimbolo(char simbolo) {//metodo para atribuir o simbolo o qual o jogador utilizara para jogar
            this.simbolo = simbolo;
        }

        public void setSorte(int sorte) {//metodo para atribuir se o jogador escolhe na classe main, o escopo 1 ou 2 do sorteio
            this.sorte = sorte; //para quem começar a jogar
        }


    }




