package Jogo;




import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
    public class JogoMain {


        public static void main(String[] args) throws IOException {

            Tabuleiro tabuleiro = new Tabuleiro();
            Jogador jogador1 = new Jogador();
            Jogador jogador2 = new Jogador();
            Random aleatorio = new Random();
            Menu menu = new Menu();

            int numeroSorteado = aleatorio.nextInt(101);// sorteara um número de 0 a 100 para utilizarmos para ver quem
// começa

            Scanner entrada = new Scanner(System.in);

            menu.menu();//metodo menu com as opçoes do menu a serem exibidas ao usuario

            if (menu.opçao == 3) {// caso o usuario no menu escolha a opçao 3, ele saira do jogo
                System.out.println(
                        "Foi uma honra ter -lo conosco, mas pô quando\n" + "tiver tempo bora dar uma jogadinha :)");
            }

            if (menu.opçao == 1) {//caso o usuario no menu escolha a opçao 1 ele, quer jogar

                System.out.print("Insira o seu nome player 1: ");
                jogador1.setNome(entrada.next());//nome do player 1

                System.out.print("Insira o simbolo que você quer jogar,\n bolinha(o) ou xis(x): ");
                String simboloString = entrada.next();//simbolo que o jogador 1 escolhera utilizar

                jogador1.setSimbolo(simboloString.charAt(0));

                System.out.print("Insira o seu nome player 2: ");
                jogador2.setNome(entrada.next());//nome do player 2

                if (jogador1.simbolo == 'x') {//caso o jogador 1 escolha o simbolo x para jogar, automaticamente o jogador 2 ira com a bolinha

                    System.out.print("O seu simbolo, " + jogador2.nome + " é a bolinha(o)\n");
                    jogador2.setSimbolo('o');
                    ;
                } else {//caso o jogador 1 escolha a bolinha o player 2 hogara com o x
                    System.out.println("O seu simbolo, " + jogador2.nome + " é o xis(x)\n");
                    jogador2.setSimbolo('x');
                    ;
                }
                System.out.print("Agora que esta tudo definido, vamos definir na SORTE quem começara,\n"
                        + "aqui neste jogo somos contra espertinhos!\n"
                        + "Então sortearemos um número de 0 a 100, e vocês escolheram entre duas opções\n"
                        + "1-> 0 a 49 ou 2-> 50 a 100, quem acertar em qual escopo o número foi sorteado começa. \n"
                        + "E então " + jogador1.nome + ", opção 1 ou 2?");
                jogador1.setSorte(entrada.nextInt());//escopo que o jogador 1 escolhera pra ter a chance de começar

                if (jogador1.sorte == 1) {// Aqui o jogador 1 escolhe o escopo de 0 a 49
                    System.out.println("opçao 1");
                    System.out.println(jogador2.nome + ", você pode ter achado injusto ele começar escolhendo,"
                            + " mas foi mal, player1 tem que ter um pouco de vantagem, não faço magica :)\n"
                            + "Sua opção é a de número 1, boa sorte! ");

                    if (numeroSorteado <= 49) {//Aqui o jogador 1 começa, pois o numero sorteado estava entre 0 a 49, e esse foi o
// escopo escolhido pelo jogador 1
                        System.out.println("O número foi sorteado e o vencedor é o ... " + jogador1.nome + "!!!\n"
                                + "É as vezes ser o privelegiado ajuda mesmo... Mas sem choro!!!\n"
                                + "A dificuldade é a diversão dos fortes\n" + "Bom, vamos jogar e você " + jogador1.nome
                                + " começa!!!");

                        while (tabuleiro.venceu == false && tabuleiro.velha == false) {//ira rodar até for vericado pelo metodo verificar
                            tabuleiro.jogar(jogador1);                         //se alguem ganhou ou se deu velha
                            tabuleiro.mostrar();
                            tabuleiro.verificarVitoria(jogador1);
                            if (tabuleiro.venceu == false && tabuleiro.velha == false) {//foi feito isso para verificar a jogada antes do proximo jogador jogar
                                tabuleiro.jogar(jogador2);
                                tabuleiro.mostrar();
                                tabuleiro.verificarVitoria(jogador2);
                            } else
                                break;
                        }

                    } else {
// Aqui o jogador 2 começa pois o numero sorteado nao estava dentro do escopo selecionado pelo jogador1(de 0 a 49)
                        System.out.println("O número foi sorteado e o vencedor é o ..." + jogador2.nome + "!!!\n"
                                + "Viu, não foi tão ruim ser o segundo né?\n" + "Bom, vamos jogar e você " + jogador2.nome
                                + " começa!!!");

                        while (tabuleiro.venceu == false && tabuleiro.velha == false) {//ira rodar até for vericado pelo metodo verificar
                            tabuleiro.jogar(jogador2); //se alguem ganhou ou se deu velha
                            tabuleiro.mostrar();
                            tabuleiro.verificarVitoria(jogador2);
                            if (tabuleiro.venceu == false && tabuleiro.velha == false) {//foi feito isso para verificar a jogada antes do proximo jogador jogar
                                tabuleiro.jogar(jogador1);
                                tabuleiro.mostrar();
                                tabuleiro.verificarVitoria(jogador1);
                            } else
                                break;
                        }

                    }

                } else if (jogador1.sorte == 2) {// Aqui o jogador 1 escolhe o escopo de 50 a 100
                    System.out.println("opçao 2");
                    System.out.println(jogador2.nome + ", você pode ter achado injusto ele começar escolhendo,"
                            + "mas foi mal, player1 tem que ter um pouco de vantagem, nao faço magica :)\n"
                            + "Sua opção é a de número 2, boa sorte! ");

                    if (numeroSorteado >= 50) {//Aqui o jogador 1  tambem começa, pois o numero sorteado estava entre 50 a 100, e esse foi o
// escopo escolhido pelo jogador 1

                        System.out.println("O número foi sorteado e o vencedor é o ... " + jogador1.nome + "!!!\n"
                                + "É as vezes ser o privelegiado ajuda mesmo... Mas sem choro!!!\n"
                                + "A dificuldade é a diversão dos fortes\n" + "Bom, vamos jogar e você " + jogador1.nome
                                + " começa!!!");

                        while (tabuleiro.venceu == false && tabuleiro.velha == false) {//ira rodar até for vericado pelo metodo verificar
                            tabuleiro.jogar(jogador1);//se alguem ganhou ou se deu velha
                            tabuleiro.mostrar();
                            tabuleiro.verificarVitoria(jogador1);
                            if (tabuleiro.venceu == false && tabuleiro.velha == false) {//foi feito isso para verificar a jogada antes do proximo jogador jogar
                                tabuleiro.jogar(jogador2);
                                tabuleiro.mostrar();
                                tabuleiro.verificarVitoria(jogador2);
                            } else
                                break;
                        }

                    } else {
// Aqui o jogador 2 tambem começa pois o numero sorteado nao estava dentro do escopo selecionado pelo jogador1(de 50 a 100)
                        System.out.println("O número foi sorteado e o vencedor é o ..." + jogador2.nome + "!!!\n"
                                + "Viu, não foi tão ruim ser o segundo né?\n" + "Bom, vamos jogar e você " + jogador2.nome
                                + " começa!!!");

                        while (tabuleiro.venceu == false && tabuleiro.velha == false) {//ira rodar até for vericado pelo metodo verificar
                            tabuleiro.jogar(jogador2);//se alguem ganhou ou se deu velha
                            tabuleiro.mostrar();
                            tabuleiro.verificarVitoria(jogador2);
                            if (tabuleiro.venceu == false && tabuleiro.velha == false) {//foi feito isso para verificar a jogada antes do proximo jogador jogar
                                tabuleiro.jogar(jogador1);
                                tabuleiro.mostrar();
                                tabuleiro.verificarVitoria(jogador1);
                            } else
                                break;
                        }

                    }
                    entrada.close();
                }

            }
        }
    }

