public class Principal {

    public static void main(String[] args) {
        Questao.Cabecalho.imprimirCabecalho("Unifan", "Gustavo Kenji", "Breno Pimenta");
        Questao[] questoes = new Questao[15];

        questoes[0] = new Questao();
        questoes[0].pergunta = "1 - Em qual ano foi lançado o primeiro filme da franquia Transformers, dirigido por Michael Bay?";
        questoes[0].opcaoA = " 2005";
        questoes[0].opcaoB = " 2007";
        questoes[0].opcaoC = " 2009";
        questoes[0].opcaoD = " 2011";
        questoes[0].opcaoE = " 2013";
        questoes[0].correta = "B";

        questoes[1] = new Questao();
        questoes[1].pergunta = "2 - Qual é o nome do protagonista humano no primeiro filme de Transformers?";
        questoes[1].opcaoA = " Sam Witwicky";
        questoes[1].opcaoB = " Cade Yeager";
        questoes[1].opcaoC = " Lennox";
        questoes[1].opcaoD = " Mikaela Banes";
        questoes[1].opcaoE = " Charlie Watson";
        questoes[1].correta = "A";

        questoes[2] = new Questao();
        questoes[2].pergunta = "3 - Qual é o nome do líder dos Autobots em Transformers?";
        questoes[2].opcaoA = " Bumblebee";
        questoes[2].opcaoB = " Megatron";
        questoes[2].opcaoC = " Starscream";
        questoes[2].opcaoD = " Optimus Prime";
        questoes[2].opcaoE = " Ironhide";
        questoes[2].correta = "D";

        questoes[3] = new Questao();
        questoes[3].pergunta = "4 - Qual é o nome do artefato poderoso que os Transformers buscam no primeiro filme?";
        questoes[3].opcaoA = " O AllSpark";
        questoes[3].opcaoB = " A Matriz de Liderança";
        questoes[3].opcaoC = " A Espada de Cybertron";
        questoes[3].opcaoD = " O Cubo Cósmico";
        questoes[3].opcaoE = " O Arco da Mente";
        questoes[3].correta = "A";

        questoes[4] = new Questao();
        questoes[4].pergunta = "5 - Em Transformers: A Vingança dos Derrotados, qual é o nome do antigo Prime que se torna o vilão?";
        questoes[4].opcaoA = " Sentinel Prime";
        questoes[4].opcaoB = " Rodimus Prime";
        questoes[4].opcaoC = " Fallen";
        questoes[4].opcaoD = " Nemesis Prime";
        questoes[4].opcaoE = " Alpha Trion";
        questoes[4].correta = "C";

        questoes[5] = new Questao();
        questoes[5].pergunta = "6 - Qual é o nome do personagem interpretado por Mark Wahlberg em Transformers: A Era da Extinção?";
        questoes[5].opcaoA = " Sam Witwicky";
        questoes[5].opcaoB = " Cade Yeager";
        questoes[5].opcaoC = " William Lennox";
        questoes[5].opcaoD = " Galvatron";
        questoes[5].opcaoE = " Joshua Joyce";
        questoes[5].correta = "B";

        questoes[6] = new Questao();
        questoes[6].pergunta = "7 - Em qual filme da franquia aparece pela primeira vez o dinobot Grimlock?";
        questoes[6].opcaoA = " Transformers";
        questoes[6].opcaoB = " Transformers: A Vingança dos Derrotados";
        questoes[6].opcaoC = " Transformers: O Lado Oculto da Lua";
        questoes[6].opcaoD = " Transformers: A Era da Extinção";
        questoes[6].opcaoE = " Transformers: O Último Cavaleiro";
        questoes[6].correta = "D";

        questoes[7] = new Questao();
        questoes[7].pergunta = "8 - Quem é o arqui-inimigo de Optimus Prime ao longo da franquia Transformers?";
        questoes[7].opcaoA = " Starscream";
        questoes[7].opcaoB = " Galvatron";
        questoes[7].opcaoC = " Megatron";
        questoes[7].opcaoD = " Unicron";
        questoes[7].opcaoE = " Soundwave";
        questoes[7].correta = "C";

        questoes[8] = new Questao();
        questoes[8].pergunta = "9 - Qual é o nome da primeira protagonista feminina principal da franquia Transformers, introduzida no filme Bumblebee?";
        questoes[8].opcaoA = " Mikaela Banes";
        questoes[8].opcaoB = " Charlie Watson";
        questoes[8].opcaoC = " Carly Spencer";
        questoes[8].opcaoD = " Tessa Yeager";
        questoes[8].opcaoE = " Vivian Wembley";
        questoes[8].correta = "B";

        questoes[9] = new Questao();
        questoes[9].pergunta = "10 - Em Transformers: O Último Cavaleiro, Optimus Prime é corrompido e passa a ser conhecido como?";
        questoes[9].opcaoA = " Dark Optimus";
        questoes[9].opcaoB = " Nemesis Prime";
        questoes[9].opcaoC = " Fallen Prime";
        questoes[9].opcaoD = " Shadow Prime";
        questoes[9].opcaoE = " Galvatron";
        questoes[9].correta = "B";

        questoes[10] = new Questao();
        questoes[10].pergunta = "11 - Qual é o planeta de origem dos Autobots e Decepticons?";
        questoes[10].opcaoA = " Krypton";
        questoes[10].opcaoB = " Cybertron";
        questoes[10].opcaoC = " Tatooine";
        questoes[10].opcaoD = " Vulcano";
        questoes[10].opcaoE = " Thanos";
        questoes[10].correta = "B";

        questoes[11] = new Questao();
        questoes[11].pergunta = "12 - Qual Transformer é conhecido por se transformar em um Camaro amarelo?";
        questoes[11].opcaoA = " Ratchet";
        questoes[11].opcaoB = " Jazz";
        questoes[11].opcaoC = " Bumblebee";
        questoes[11].opcaoD = " Ironhide";
        questoes[11].opcaoE = " Wheeljack";
        questoes[11].correta = "C";

        questoes[12] = new Questao();
        questoes[12].pergunta = "13 - Em Transformers: O Lado Oculto da Lua, qual é o nome do Autobot que se sacrifica para salvar os outros Autobots?";
        questoes[12].opcaoA = " Ratchet";
        questoes[12].opcaoB = " Ironhide";
        questoes[12].opcaoC = " Optimus Prime";
        questoes[12].opcaoD = " Jazz";
        questoes[12].opcaoE = " Wheeljack";
        questoes[12].correta = "D";

        questoes[13] = new Questao();
        questoes[13].pergunta = "14 - Qual desses Transformers é o segundo em comando dos Decepticons?";
        questoes[13].opcaoA = " Starscream";
        questoes[13].opcaoB = " Soundwave";
        questoes[13].opcaoC = " Shockwave";
        questoes[13].opcaoD = " Barricade";
        questoes[13].opcaoE = " Blackout";
        questoes[13].correta = "A";

        questoes[14] = new Questao();
        questoes[14].pergunta = "15 - Quem foi o diretor de todos os cinco primeiros filmes da franquia Transformers?";
        questoes[14].opcaoA = " Steven Spielberg";
        questoes[14].opcaoB = " J.J. Abrams";
        questoes[14].opcaoC = " Zack Snyder";
        questoes[14].opcaoD = " Michael Bay";
        questoes[14].opcaoE = " James Cameron";
        questoes[14].correta = "D";

        int cont = 0;

        for (Questao questoe : questoes) {
            questoe.escrevaQuestao();
            String resposta = questoe.leiaResposta();
            if (questoe.isCorreta(resposta)) {
                cont++;
            }
        }

        double totalQuestoes = 15.0;
//        for (int i = 0; i < totalQuestoes; i++) {
//            questoes[i].escrevaQuestao();
//            String respostaUsuario = questoes[i].leiaResposta();
//            if (questoes[i].isCorreta(respostaUsuario)) {
//                acertos++;
//            } else {
//                erros++;
//            }
//        }
        double porcentagemAcertos = ((double) cont / totalQuestoes) * 100;

        // Exibindo o resultado final
        System.out.println("Resultado Final:");
        System.out.println("Você acertou " + cont + " questões.");
        System.out.println("Você errou " + (totalQuestoes - cont) + " questões.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
    }
}

