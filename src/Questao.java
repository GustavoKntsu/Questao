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

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println();
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println();
            return false;
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



}