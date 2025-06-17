import java.util.Scanner;

public class Main {

    public static boolean verificarExpressao(String expressao){
        Pilha pilha = new Pilha();
        for(int i = 0; i < expressao.length(); i++){
            char c = expressao.charAt(i);

            if(c == '('|| c == '[' || c == '{'){
                pilha.push(c);
            } else if(c == ')'|| c == ']' || c == '}'){
                if (pilha.estaVazia()){
                    return false;
                }
                char topo = pilha.pop();
                if((c == ')' && topo != '(') || 
                (c == ']' && topo != '[') || 
                (c == '}' && topo != '{')){
                    return false;
                }
            }
        }
        return pilha.estaVazia();
    }

    public static void main(String[]  args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressao para verificar:");
        String expressao = scanner.nextLine();
        
        if(verificarExpressao(expressao)){
            System.out.println("A expressao esta correta.");
        } else {
            System.out.println("A expressao esta incorreta.");
        }
        scanner.close();
    }
}