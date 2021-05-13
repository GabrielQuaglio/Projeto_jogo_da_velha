package Jogo;






import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

        String resposta = "nao";
        private int opçao;

    public int getOpçao() {
        return opçao;
    }

    public void setOpçao(int opçao) {

        if (opçao > 0 && opçao < 4) {
            this.opçao = opçao;
        } else {
            System.out.println("Numero de opção nao existente, selecione outra opção");
        }
    }

    BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));

        void menu() throws IOException {//metodo que oferece um menu ao usuario


            do {
                System.out.println("Menu:");
                System.out.println("1. Novo Jogo");
                System.out.println("2. Instruçoes");
                System.out.println("3. Sair");
                System.out.print("Informe o número da opçao que você quer executar: ");
                String s = enter.readLine();
                setOpçao(Integer.parseInt(s));


                if (opçao == 2) { // se o usuario selecionar a opçao de numero 2, ele é levado as instruçoes

                    while (resposta.equalsIgnoreCase("nao")) {
                        System.out.println("Para esolher uma posição, utilize os números a seguir,\n"
                                + "que representam as posições do tabuleiro\n");
                        System.out.println(" 7 | 8 | 9");
                        System.out.println("-----------");
                        System.out.println(" 4 | 5 | 6");
                        System.out.println("-----------");
                        System.out.println(" 1 | 2 | 3");
                        System.out.println("Entendeu?(Responda com sim ou nao)");
                        resposta = enter.readLine();

                        if (resposta.equalsIgnoreCase("nao")) {//se ele nao entendeu a isntruçao
                            System.out.println("Que??!! voce nao conseguiu entender isso? Sai agora do meu jogo...");
                            break;//caso ele nao tenha entedido, o break para a execuçao do while
                        }
                    }
                    if (resposta.equalsIgnoreCase("nao")) {
                        break;//esse break para a execuçao do do/while, caso a resposta sobre ter entendido as intruçoes seja "nao"
                    } else {//se ele entendeu a resposta, resposta "sim"
                        System.out.println("Otimo! Selecione a opção 1 e vamos jogar!");
                    }
                }

            } while (opçao != 3 && opçao != 1);//ele rodara as opçoes do menu até que o jogador escolha a opçao1(jogar) ou 3(sair)


        }





    }

