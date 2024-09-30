import java.util.Scanner;


    public class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

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
            Questao[] questoes = new Questao[15];

            questoes[0] = new Questao();
            questoes[0].pergunta = "Em qual ano foi lançado o primeiro filme da franquia Transformers, dirigido por Michael Bay?";
            questoes[0].opcaoA = "A) 2005";
            questoes[0].opcaoB = "B) 2007";
            questoes[0].opcaoC = "C) 2009";
            questoes[0].opcaoD = "D) 2011";
            questoes[0].opcaoE = "E) 2013";
            questoes[0].correta = "B";

            questoes[1] = new Questao();
            questoes[1].pergunta = "Qual é o nome do protagonista humano no primeiro filme de Transformers?";
            questoes[1].opcaoA = "A) Sam Witwicky";
            questoes[1].opcaoB = "B) Cade Yeager";
            questoes[1].opcaoC = "C) Lennox";
            questoes[1].opcaoD = "D) Mikaela Banes";
            questoes[1].opcaoE = "E) Charlie Watson";
            questoes[1].correta = "A";

            questoes[2] = new Questao();
            questoes[2].pergunta = "Qual é o nome do líder dos Autobots em Transformers?";
            questoes[2].opcaoA = "A) Bumblebee";
            questoes[2].opcaoB = "B) Megatron";
            questoes[2].opcaoC = "C) Starscream";
            questoes[2].opcaoD = "D) Optimus Prime";
            questoes[2].opcaoE = "E) Ironhide";
            questoes[2].correta = "D";

            questoes[3] = new Questao();
            questoes[3].pergunta = "Qual é o menor país do mundo?";
            questoes[3].opcaoA = "A) Vaticano";
            questoes[3].opcaoB = "B) Mônaco";
            questoes[3].opcaoC = "C) San Marino";
            questoes[3].opcaoD = "D) Malta";
            questoes[3].opcaoE = "E) Liechtenstein";
            questoes[3].correta = "A";

            questoes[4] = new Questao();
            questoes[4].pergunta = "Qual país tem a maior população do mundo?";
            questoes[4].opcaoA = "A) Índia";
            questoes[4].opcaoB = "B) Estados Unidos";
            questoes[4].opcaoC = "C) Indonésia";
            questoes[4].opcaoD = "D) China";
            questoes[4].opcaoE = "E) Brasil";
            questoes[4].correta = "D";

            questoes[5] = new Questao();
            questoes[5].pergunta = "Qual oceano banha a costa leste do Brasil?";
            questoes[5].opcaoA = "A) Oceano Pacífico";
            questoes[5].opcaoB = "B) Oceano Atlântico";
            questoes[5].opcaoC = "C) Oceano Índico";
            questoes[5].opcaoD = "D) Oceano Ártico";
            questoes[5].opcaoE = "E) Mar Mediterrâneo";
            questoes[5].correta = "B";

            questoes[6] = new Questao();
            questoes[6].pergunta = "Qual é a capital da Austrália?";
            questoes[6].opcaoA = "A) Sydney";
            questoes[6].opcaoB = "B) Canberra";
            questoes[6].opcaoC = "C) Melbourne";
            questoes[6].opcaoD = "D) Brisbane";
            questoes[6].opcaoE = "E) Perth";
            questoes[6].correta = "B";

            questoes[7] = new Questao();
            questoes[7].pergunta = "Em qual país está localizada a Cordilheira dos Andes?";
            questoes[7].opcaoA = "A) Brasil";
            questoes[7].opcaoB = "B) Argentina";
            questoes[7].opcaoC = "C) Bolívia";
            questoes[7].opcaoD = "D) Peru";
            questoes[7].opcaoE = "E) Chile";
            questoes[7].correta = "E";

            questoes[8] = new Questao();
            questoes[8].pergunta = "Qual é o país com o maior número de ilhas no mundo?";
            questoes[8].opcaoA = "A) Indonésia";
            questoes[8].opcaoB = "B) Japão";
            questoes[8].opcaoC = "C) Filipinas";
            questoes[8].opcaoD = "D) Suécia";
            questoes[8].opcaoE = "E) Noruega";
            questoes[8].correta = "D";

            questoes[9] = new Questao();
            questoes[9].pergunta = "Qual é a montanha mais alta do mundo?";
            questoes[9].opcaoA = "A) Monte Everest";
            questoes[9].opcaoB = "B) K2";
            questoes[9].opcaoC = "C) Kangchenjunga";
            questoes[9].opcaoD = "D) Lhotse";
            questoes[9].opcaoE = "E) Makalu";
            questoes[9].correta = "A";

            questoes[10] = new Questao();
            questoes[10].pergunta = "Qual dos países abaixo não faz parte da América do Norte?";
            questoes[10].opcaoA = "A) México";
            questoes[10].opcaoB = "B) Estados Unidos";
            questoes[10].opcaoC = "C) Canadá";
            questoes[10].opcaoD = "D) Cuba";
            questoes[10].opcaoE = "E) Belize";
            questoes[10].correta = "D";

            questoes[11] = new Questao();
            questoes[11].pergunta = "Qual é o principal idioma falado no Egito?";
            questoes[11].opcaoA = "A) Inglês";
            questoes[11].opcaoB = "B) Árabe";
            questoes[11].opcaoC = "C) Francês";
            questoes[11].opcaoD = "D) Espanhol";
            questoes[11].opcaoE = "E) Italiano";
            questoes[11].correta = "B";

            questoes[12] = new Questao();
            questoes[12].pergunta = "Qual dos países abaixo é o maior exportador de petróleo do mundo?";
            questoes[12].opcaoA = "A) Rússia";
            questoes[12].opcaoB = "B) Estados Unidos";
            questoes[12].opcaoC = "C) Arábia Saudita";
            questoes[12].opcaoD = "D) Canadá";
            questoes[12].opcaoE = "E) Irã";
            questoes[12].correta = "C";

            questoes[13] = new Questao();
            questoes[13].pergunta = "Qual é o rio mais longo da Europa?";
            questoes[13].opcaoA = "A) Rio Volga";
            questoes[13].opcaoB = "B) Rio Danúbio";
            questoes[13].opcaoC = "C) Rio Sena";
            questoes[13].opcaoD = "D) Rio Reno";
            questoes[13].opcaoE = "E) Rio Tâmisa";
            questoes[13].correta = "A";

            questoes[14] = new Questao();
            questoes[14].pergunta = "Qual é o nome da floresta tropical mais extensa do mundo?";
            questoes[14].opcaoA = "A) Floresta do Congo";
            questoes[14].opcaoB = "B) Floresta Amazônica";
            questoes[14].opcaoC = "C) Floresta Negra";
            questoes[14].opcaoD = "D) Floresta de Borneo";
            questoes[14].opcaoE = "E) Floresta de Sumatra";
            questoes[14].correta = "B";

            for (Questao questoe : questoes) {
                questoe.escrevaQuestao();
                String resposta = questoe.leiaResposta();
                questoe.isCorreta(resposta);
            }
        }
    }


