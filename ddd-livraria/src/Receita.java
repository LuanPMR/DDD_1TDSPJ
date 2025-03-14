public class Receita {
    String nomeReceita ;
    String ingrendientes;
    String autorReceita;
    String dificuldade;
    int tempo;
    int porcoes;
    String descricao;
    String modoDePreparo;

    public void exibirReceita(){
        System.out.println("Receita de " + nomeReceita);
        System.out.println("=========================");
        System.out.println("Publicado por:" + autorReceita);
        System.out.println(dificuldade + "\t" + tempo + "\t" + porcoes);
        System.out.println(descricao);
        System.out.println("Ingrendientes\n" + ingrendientes);
        System.out.println("Modo de Preparo\n" + modoDePreparo);
    }
    //metodo com retorno
    public String exibirReceita2(){
        String mensagem = "Receita de \" + nomeReceita"+
                "\n ========================="+
                "\n Publicado por:\" + autorReceita"+
                "\n dificuldade + \"\\t\" + tempo + \"\\t\" + porcoes"+
                "\n descricao";
        return "";
    }
}