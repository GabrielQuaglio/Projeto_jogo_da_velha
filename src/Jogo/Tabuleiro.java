package Jogo;


    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Tabuleiro {

        int jogada2;
        int jogada3;
        int jogada4;
        int jogada5;
        int jogada6;
        int jogada7;
        int jogada8;
        int jogada9;
        boolean venceu = false;
        boolean velha = false;

        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        char[][] tabuleiro = new char[3][3];//Array de caracter que simula um tabuleiro de jogo da velha 3x3

        public void mostrar() { //metodo para percorrer o array tabuleiro e exibir sua posições
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    System.out.print(tabuleiro[i][j] + "|");
                }
                System.out.println();
            }
        }

        public void jogar(Jogador object) throws IOException {//metodo para o objeto jogador realizar sua jogadas

            System.out.print(object.getNome() + ", qual a posiçao que você gostaria do jogar?");
            String jogadaTexto = enter.readLine();
            int jogada = Integer.parseInt(jogadaTexto);

            if (jogada == 1 && tabuleiro[2][0] == 0) {//se a jogada tiver valor 1 e a posiçao de linha 2 e coluna 0 estiver vazia, ele faz a jogada

                tabuleiro[2][0] = object.getSimbolo();//põe o simbolo do objeto jogador na posiçao de linha 2 e coluna 0 - posiçao 1


            } else if (jogada == 1 && (tabuleiro[2][0] == 'x' || tabuleiro[2][0] == 'o')) {//se a posiçao de linha 2 e coluna 0 estiver ocupada
                System.out.println("Jogada invalida, a posiçao já esta ocupada");          // ele alertara o erro e pedirá uma nova posiçao ao
                System.out.print("Escolha outra posiçao: ");                               // objeto jogador
                String jogadaTexto2 = enter.readLine();
                jogada2 = Integer.parseInt(jogadaTexto2);

            }
            if ((jogada == 2 || jogada2 == 2) && tabuleiro[2][1] == 0) {//se a jogada tiver valor 2 ou a nova posiçao(jogada2) for 2
                //e a posiçao de linha 2 e coluna 1 estiver vazia, ele faz a jogada


                tabuleiro[2][1] = object.getSimbolo();//põe o simbolo do objeto jogador na posiçao de linha 2 e coluna 1 - posiçao 2

            } else if ((jogada == 2 || jogada2 == 2) && (tabuleiro[2][1] == 'x' || tabuleiro[2][1] == 'o')) {//se a posiçao de linha 2 e coluna 1 estiver ocupada
                System.out.println("Jogada invalida, a posiçao já esta ocupada");                           // ele alertara o erro e pedirá uma nova posiçao ao
                System.out.print("Escolha outra posiçao: ");                                                 // objeto jogador
                String jogadaTexto3 = enter.readLine();
                jogada3 = Integer.parseInt(jogadaTexto3);


            }
            if ((jogada == 3 || jogada3 == 3) && tabuleiro[2][2] == 0) {//se a jogada tiver valor 3 ou a nova posiçao(jogada3) for 3
                //e a posiçao de linha 2 e coluna 2 estiver vazia, ele faz a jogada

                tabuleiro[2][2] = object.getSimbolo();//põe o simbolo do objeto jogador na posiçao de linha 2 e coluna 2 - posiçao 3

            } else if ((jogada == 3 || jogada3 == 3) && (tabuleiro[2][2] == 'x' || tabuleiro[2][2] == 'o')) {//se a posiçao de linha 2 e coluna 2 estiver ocupada
                System.out.println("Jogada invalida, a posiçao já esta ocupada");                            // ele alertara o erro e pedirá uma nova posiçao ao
                System.out.print("Escolha outra posiçao: ");                                                  // objeto jogador
                String jogadaTexto4 = enter.readLine();
                jogada4 = Integer.parseInt(jogadaTexto4);


            }
            if ((jogada == 4 || jogada4 == 4) && tabuleiro[1][0] == 0) {//se a jogada tiver valor 4 ou a nova posiçao(jogada4) for 4
                //e a posiçao de linha 1 e coluna 0 estiver vazia, ele faz a jogada


                tabuleiro[1][0] = object.getSimbolo();//põe o simbolo do objeto jogador na posiçao de linha 1 e coluna 0 - posiçao 4

            } else if ((jogada == 4 || jogada4 == 4) && (tabuleiro[1][0] == 'x' || tabuleiro[1][0] == 'o')) {//se a posiçao de linha 1 e coluna 0 estiver ocupada
// ele alertara o erro e pedirá uma nova posiçao ao
// objeto jogador
                System.out.println("Jogada invalida, a posiçao já esta ocupada");
                System.out.print("Escolha outra posiçao: ");
                String jogadaTexto5 = enter.readLine();
                jogada5 = Integer.parseInt(jogadaTexto5);

            }
            if ((jogada == 5 || jogada5 == 5) && tabuleiro[1][1] == 0) {//se a jogada tiver valor 5 ou a nova posiçao(jogada5) for 5
                //e a posiçao de linha 1 e coluna 1 estiver vazia, ele faz a jogada


                tabuleiro[1][1] = object.getSimbolo();//põe o simbolo do objeto jogador na posiçao de linha 1 e coluna 1 - posiçao 5

            } else if ((jogada == 5 || jogada5 == 5) && (tabuleiro[1][1] == 'x' || tabuleiro[1][1] == 'o')) {//se a posiçao de linha 1 e coluna 1 estiver ocupada
// ele alertara o erro e pedirá uma nova posiçao ao
// objeto jogador
                System.out.println("Jogada invalida, a posiçao já esta ocupada");
                System.out.print("Escolha outra posiçao: ");
                String jogadaTexto6 = enter.readLine();
                jogada6 = Integer.parseInt(jogadaTexto6);
                System.out.println("erro no 5 else if");
            }
            if ((jogada == 6 || jogada6 == 6) && tabuleiro[1][2] == 0) {//se a jogada tiver valor 6 ou a nova posiçao(jogada6) for 6
                //e a posiçao de linha 1 e coluna 2 estiver vazia, ele faz a jogada


                tabuleiro[1][2] = object.getSimbolo();//põe o simbolo do objeto jogador na posiçao de linha 1 e coluna 2 - posiçao 6

            } else if ((jogada == 6 || jogada6 == 6) && (tabuleiro[1][2] == 'x' || tabuleiro[1][2] == 'o')) {//se a posiçao de linha 1 e coluna 2 estiver ocupada
// ele alertara o erro e pedirá uma nova posiçao ao
// objeto jogador
                System.out.println("Jogada invalida, a posiçao já esta ocupada");
                System.out.print("Escolha outra posiçao: ");
                String jogadaTexto7 = enter.readLine();
                jogada7 = Integer.parseInt(jogadaTexto7);
                System.out.println("erro no 6 else if");
            }
            if ((jogada == 7 || jogada7 == 7) && tabuleiro[0][0] == 0) {//se a jogada tiver valor 7 ou a nova posiçao(jogada7) for 7
                //e a posiçao de linha 0 e coluna o estiver vazia, ele faz a jogada


                tabuleiro[0][0] = object.getSimbolo();//põe o simbolo do objeto jogador na posiçao de linha 0 e coluna 0 - posiçao 7

            } else if ((jogada == 7 || jogada7 == 7) && (tabuleiro[0][0] == 'x' || tabuleiro[0][0] == 'o')) {//se a posiçao de linha 0 e coluna 0 estiver ocupada
// ele alertara o erro e pedirá uma nova posiçao ao
// objeto jogador
                System.out.println("Jogada invalida, a posiçao já esta ocupada");
                System.out.print("Escolha outra posiçao: ");
                String jogadaTexto8 = enter.readLine();
                jogada8 = Integer.parseInt(jogadaTexto8);
                System.out.println("erro no 7 else if");
            }
            if ((jogada == 8 || jogada8 == 8) && tabuleiro[0][1] == 0) {//se a jogada tiver valor 8 ou a nova posiçao(jogada8) for 8
                //e a posiçao de linha 0 e coluna 1 estiver vazia, ele faz a jogada


                tabuleiro[0][1] = object.getSimbolo();//põe o simbolo do objeto jogador na posiçao de linha 0 e coluna 1 - posiçao 8

            } else if ((jogada == 8 || jogada8 == 8) && (tabuleiro[0][1] == 'x' || tabuleiro[0][1] == 'o')) {//se a posiçao de linha 0 e coluna 1 estiver ocupada
// ele alertara o erro e pedirá uma nova posiçao ao
// objeto jogador
                System.out.println("Jogada invalida, a posiçao já esta ocupada");
                System.out.print("Escolha outra posiçao: ");
                String jogadaTexto9 = enter.readLine();
                jogada9 = Integer.parseInt(jogadaTexto9);
                System.out.println("erro no 8 else if");
            }
            if ((jogada == 9 || jogada9 == 9) && tabuleiro[0][2] == 0) {//se a jogada tiver valor 9 ou a nova posiçao(jogada9) for 9
                //e a posiçao de linha 0 e coluna 2 estiver vazia, ele faz a jogada


                tabuleiro[0][2] = object.getSimbolo();//põe o simbolo do objeto jogador na posiçao de linha 0 e coluna 2 - posiçao 9

            } else if ((jogada == 9 || jogada9 == 9) && (tabuleiro[0][2] == 'x' || tabuleiro[0][2] == 'o')) {//se a posiçao de linha 0 e coluna 2 estiver ocupada
// ele alertara o erro e pedirá uma nova posiçao ao
// objeto jogador
                System.out.println("Jogada invalida, a posiçao já esta ocupada");
                System.out.print("Escolha outra posiçao: ");
                String jogadaTexto9 = enter.readLine();
                jogada3 = Integer.parseInt(jogadaTexto9);
                System.out.println("erro no 9 else if");
            }

        }

        public void verificarVitoria(Jogador object) {//metodo para verificar a se existe a vitoria de um jogador ou se deu velha
            for (int i = 0; i < 3; i++) {//verifica vitoria na linha
                if ((tabuleiro[i][0] == tabuleiro[i][1]) &&
                        (tabuleiro[i][0] == tabuleiro[i][2])) {
                    if (tabuleiro[i][0] != 0) {
                        venceu = true;//usada para parar a execuçao do while no jogo main
                        System.out.println("Parabéns!!! "+ object.getNome() + " você venceu!!");
                    }
                }
            }
            for (int j = 0; j < 3; j++) {//verifica vitoria na coluna
                if ((tabuleiro[0][j] == tabuleiro[1][j]) &&
                        (tabuleiro[0][j] == tabuleiro[2][j]) &&
                        (tabuleiro[0][j] != 0)) {
                    if(tabuleiro[0][j] != 0) {

                        venceu = true;//usada para parar a execuçao do while no jogo main
                        System.out.println("Parabéns!!! "+ object.getNome() + " você venceu!!");
                    }
                }
            }
            if ((tabuleiro[0][0] == tabuleiro[1][1]) && //aqui é verificado se ha vitoria nas diagonais
                    (tabuleiro[0][0] == tabuleiro[2][2]) &&
                    (tabuleiro[0][0] != 0)) {
                if(tabuleiro[0][0] != 0) {
                    venceu = true;//usada para parar a execuçao do while no jogo main
                    System.out.println("Parabéns!!! "+ object.getNome() + " você venceu!!");
                }
            }



            if ((tabuleiro[0][2] == tabuleiro[1][1]) &&
                    (tabuleiro[0][2] == tabuleiro[2][0]) &&
                    (tabuleiro[0][2] != 0)) {
                if(tabuleiro[0][2] != 0) {
                    venceu = true;//usada para parar a execuçao do while no jogo main
                    System.out.println("Parabéns!!! "+ object.getNome() + " você venceu!!");
                }


            }
            {
                if(tabuleiro[0][0] != 0 && tabuleiro[0][1] != 0 && tabuleiro[0][2] != 0 && tabuleiro[1][0] != 0
                        && tabuleiro[1][1] != 0 && tabuleiro[1][2] != 0 &&
                        tabuleiro[2][0] != 0 && tabuleiro[2][1] != 0 && tabuleiro[2][2] != 0) {
                    System.out.println("Mas vocês são muito inteligentes mesmo!!, DEU VELHA!!");
                    velha = true;

                }

            }
        }
    }

