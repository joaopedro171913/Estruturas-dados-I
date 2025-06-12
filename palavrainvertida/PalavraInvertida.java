import java.util.Scanner;
import java.util.Stack;

public class PalavraInvertida {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite a frase que deseja inverter:");
        String frase = scanner.nextLine();
        
        String fraseInvertida = inverterPalavras(frase);

        System.out.println("Frase com palavras invertidas:");
        System.out.println(fraseInvertida);
        /** 
         * 
         * 
        oi, eu não sabia se era preciso só colocar essas frases que estavam no moodle
        ou incrementar um scanner para poder poder digitar a palavra que quer,
        então eu fiz as duas coisas, ai essa parte que eu coloquei como comentario é a parte dos exemplos
        que estao no moodle. 
        ai a outra ja tem a funcçao para poder digitar a palavra que deseja ser invertida
        
        System.out.println("\nExemplos moodle:");
        
        String teste1= "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String teste2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";
        String resultado1 = inverterPalavras(teste1);
        String resultado2 = inverterPalavras(teste2);
        System.out.println("questao1:");
        System.out.println("teste1:" + teste1);
        System.out.println("Invertido:" + resultado1);
        System.out.println("");
        System.out.println("questao2:");
        System.out.println("teste2" + teste2);
        System.out.println("invertido:" + resultado2);
        *///
    }
    
    public static String inverterPalavras(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder fraseInvertida = new StringBuilder();
        
        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i];
            String palavraInvertida = inverterPalavra(palavra);
            
            fraseInvertida.append(palavraInvertida);
            
            if (i < palavras.length - 1) {
                fraseInvertida.append(" ");
            }
        }
        
        return fraseInvertida.toString();
    }
    
    public static String inverterPalavra(String palavra) {
        Stack<Character> pilha = new Stack<>();
        
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }
        
        StringBuilder palavraInvertida = new StringBuilder();
        
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }
        
        return palavraInvertida.toString();
    }
}