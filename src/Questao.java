import java.util.Scanner;


    public class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";


        public static class Cabecalho {

            public static void main(String[] args) {
                String faculdade = "Unifan Alfredo Nasser";
                String aluno = "Gustavo Kenji Nunes Tsukioka";
                String professor = "Breno Pimenta";


            }

            public static void imprimirCabecalho(String faculdade, String aluno, String professor) {
                System.out.println("=================================");
                System.out.println("Faculdade: " + faculdade);
                System.out.println("Aluno: " + aluno);
                System.out.println("Professor: " + professor);
                System.out.println("Olá usuário você agora ira responder um quiz sobre a franquia Transformers, Boa sorte!");
                System.out.println("=================================");
            }
        }


        public void isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                System.out.println();
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                System.out.println();
            }
        }

        public String leiaResposta() {
            Scanner ler = new Scanner(System.in);
            String resp;
            do {
                System.out.println("Digite a resposta: ");
                resp = ler.next();
            } while (!respostaValida(resp));
            return resp;
        }

        private boolean respostaValida(String resp) {
            if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
                return true;
            }
            System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
            System.out.println();
            return false;
        }

        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println("A) " + this.opcaoA);
            System.out.println("B) " + this.opcaoB);
            System.out.println("C) " + this.opcaoC);
            System.out.println("D) " + this.opcaoD);
            System.out.println("E) " + this.opcaoE);
            System.out.println();
        }


        public static void main(String[] args) {
            Cabecalho.imprimirCabecalho("Unifan", "Gustavo Kenji", "Breno Pimenta");
            Questao[] questoes = new Questao[15];

            questoes[0] = new Questao();
            questoes[0].pergunta = "1 - Em qual ano foi lançado o primeiro filme da franquia Transformers, dirigido por Michael Bay?";
            questoes[0].opcaoA = "A) 2005";
            questoes[0].opcaoB = "B) 2007";
            questoes[0].opcaoC = "C) 2009";
            questoes[0].opcaoD = "D) 2011";
            questoes[0].opcaoE = "E) 2013";
            questoes[0].correta = "B";

            questoes[1] = new Questao();
            questoes[1].pergunta = "2 - Qual é o nome do protagonista humano no primeiro filme de Transformers?";
            questoes[1].opcaoA = "A) Sam Witwicky";
            questoes[1].opcaoB = "B) Cade Yeager";
            questoes[1].opcaoC = "C) Lennox";
            questoes[1].opcaoD = "D) Mikaela Banes";
            questoes[1].opcaoE = "E) Charlie Watson";
            questoes[1].correta = "A";

            questoes[2] = new Questao();
            questoes[2].pergunta = "3 - Qual é o nome do líder dos Autobots em Transformers?";
            questoes[2].opcaoA = "A) Bumblebee";
            questoes[2].opcaoB = "B) Megatron";
            questoes[2].opcaoC = "C) Starscream";
            questoes[2].opcaoD = "D) Optimus Prime";
            questoes[2].opcaoE = "E) Ironhide";
            questoes[2].correta = "D";

            questoes[3] = new Questao();
            questoes[3].pergunta = "4 - Qual é o nome do artefato poderoso que os Transformers buscam no primeiro filme?";
            questoes[3].opcaoA = "A) O AllSpark";
            questoes[3].opcaoB = "B) A Matriz de Liderança";
            questoes[3].opcaoC = "C) A Espada de Cybertron";
            questoes[3].opcaoD = "D) O Cubo Cósmico";
            questoes[3].opcaoE = "E) O Arco da Mente";
            questoes[3].correta = "A";

            questoes[4] = new Questao();
            questoes[4].pergunta = "5 - Em Transformers: A Vingança dos Derrotados, qual é o nome do antigo Prime que se torna o vilão?";
            questoes[4].opcaoA = "A) Sentinel Prime";
            questoes[4].opcaoB = "B) Rodimus Prime";
            questoes[4].opcaoC = "C) Fallen";
            questoes[4].opcaoD = "D) Nemesis Prime";
            questoes[4].opcaoE = "E) Alpha Trion";
            questoes[4].correta = "C";

            questoes[5] = new Questao();
            questoes[5].pergunta = "6 - Qual é o nome do personagem interpretado por Mark Wahlberg em Transformers: A Era da Extinção?";
            questoes[5].opcaoA = "A) Sam Witwicky";
            questoes[5].opcaoB = "B) Cade Yeager";
            questoes[5].opcaoC = "C) William Lennox";
            questoes[5].opcaoD = "D) Galvatron";
            questoes[5].opcaoE = "E) Joshua Joyce";
            questoes[5].correta = "B";

            questoes[6] = new Questao();
            questoes[6].pergunta = "7 - Em qual filme da franquia aparece pela primeira vez o dinobot Grimlock?";
            questoes[6].opcaoA = "A) Transformers";
            questoes[6].opcaoB = "B) Transformers: A Vingança dos Derrotados";
            questoes[6].opcaoC = "C) Transformers: O Lado Oculto da Lua";
            questoes[6].opcaoD = "D) Transformers: A Era da Extinção";
            questoes[6].opcaoE = "E) Transformers: O Último Cavaleiro";
            questoes[6].correta = "D";

            questoes[7] = new Questao();
            questoes[7].pergunta = "8 - Quem é o arqui-inimigo de Optimus Prime ao longo da franquia Transformers?";
            questoes[7].opcaoA = "A) Starscream";
            questoes[7].opcaoB = "B) Galvatron";
            questoes[7].opcaoC = "C) Megatron";
            questoes[7].opcaoD = "D) Unicron";
            questoes[7].opcaoE = "E) Soundwave";
            questoes[7].correta = "C";

            questoes[8] = new Questao();
            questoes[8].pergunta = "9 - Qual é o nome da primeira protagonista feminina principal da franquia Transformers, introduzida no filme Bumblebee?";
            questoes[8].opcaoA = "A) Mikaela Banes";
            questoes[8].opcaoB = "B) Charlie Watson";
            questoes[8].opcaoC = "C) Carly Spencer";
            questoes[8].opcaoD = "D) Tessa Yeager";
            questoes[8].opcaoE = "E) Vivian Wembley";
            questoes[8].correta = "B";

            questoes[9] = new Questao();
            questoes[9].pergunta = "10 - Em Transformers: O Último Cavaleiro, Optimus Prime é corrompido e passa a ser conhecido como?";
            questoes[9].opcaoA = "A) Dark Optimus";
            questoes[9].opcaoB = "B) Nemesis Prime";
            questoes[9].opcaoC = "C) Fallen Prime";
            questoes[9].opcaoD = "D) Shadow Prime";
            questoes[9].opcaoE = "E) Galvatron";
            questoes[9].correta = "B";

            questoes[10] = new Questao();
            questoes[10].pergunta = "11 - Qual é o planeta de origem dos Autobots e Decepticons?";
            questoes[10].opcaoA = "A) Krypton";
            questoes[10].opcaoB = "B) Cybertron";
            questoes[10].opcaoC = "C) Tatooine";
            questoes[10].opcaoD = "D) Vulcano";
            questoes[10].opcaoE = "E) Thanos";
            questoes[10].correta = "B";

            questoes[11] = new Questao();
            questoes[11].pergunta = "12 - Qual Transformer é conhecido por se transformar em um Camaro amarelo?";
            questoes[11].opcaoA = "A) Ratchet";
            questoes[11].opcaoB = "B) Jazz";
            questoes[11].opcaoC = "C) Bumblebee";
            questoes[11].opcaoD = "D) Ironhide";
            questoes[11].opcaoE = "E) Wheeljack";
            questoes[11].correta = "C";

            questoes[12] = new Questao();
            questoes[12].pergunta = "13 - Em Transformers: O Lado Oculto da Lua, qual é o nome do Autobot que se sacrifica para salvar os outros Autobots?";
            questoes[12].opcaoA = "A) Ratchet";
            questoes[12].opcaoB = "B) Ironhide";
            questoes[12].opcaoC = "C) Optimus Prime";
            questoes[12].opcaoD = "D) Jazz";
            questoes[12].opcaoE = "E) Wheeljack";
            questoes[12].correta = "D";

            questoes[13] = new Questao();
            questoes[13].pergunta = "14 - Qual desses Transformers é o segundo em comando dos Decepticons?";
            questoes[13].opcaoA = "A) Starscream";
            questoes[13].opcaoB = "B) Soundwave";
            questoes[13].opcaoC = "C) Shockwave";
            questoes[13].opcaoD = "D) Barricade";
            questoes[13].opcaoE = "E) Blackout";
            questoes[13].correta = "A";

            questoes[14] = new Questao();
            questoes[14].pergunta = "15 - Quem foi o diretor de todos os cinco primeiros filmes da franquia Transformers?";
            questoes[14].opcaoA = "A) Steven Spielberg";
            questoes[14].opcaoB = "B) J.J. Abrams";
            questoes[14].opcaoC = "C) Zack Snyder";
            questoes[14].opcaoD = "D) Michael Bay";
            questoes[14].opcaoE = "E) James Cameron";
            questoes[14].correta = "D";

            for (Questao questoe : questoes) {
                questoe.escrevaQuestao();
                String resposta = questoe.leiaResposta();
                questoe.isCorreta(resposta);
            }
        }
    }


