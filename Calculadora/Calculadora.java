import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
 //(A + B) * C = Infixa
// AB+  C* = POS FIXA
// *+  ABC = PRÉ FIXA 

public class Calculadora{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tipo de notação:");
        System.out.println("1 - infixa");
        System.out.println("2 - prefixa");
        System.out.println("3 - pós-fixa");
        String opcao = entrada.nextLine();
        String tipo = "";
        switch(opcao) {
            case "1": tipo = "infixa"; break;
            case "2": tipo = "prefixa"; break;
            case "3": tipo = "posfixa"; break;
            default: 
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Digite a expressão:");
        String expressao = entrada.nextLine();

        int resultado = 0;
        String expressaoInfixa = "";
        String expressaoPrefixa = "";
        String expressaoPosfixa = "";

        if (tipo.equals("posfixa")) {
            resultado = calcularPosfixa(expressao);
            expressaoPosfixa = expressao;
            expressaoInfixa = posfixaParaInfixa(expressao);
            expressaoPrefixa = infixaParaPrefixa(expressaoInfixa);
        } else if (tipo.equals("prefixa")) {
            resultado = calcularPrefixa(expressao);
            expressaoPrefixa = expressao;
            expressaoInfixa = prefixaParaInfixa(expressao);
            expressaoPosfixa = infixaParaPosfixa(expressaoInfixa);
        } else if (tipo.equals("infixa")) {
            expressaoInfixa = expressao;
            expressaoPosfixa = infixaParaPosfixa(expressao);
            expressaoPrefixa = infixaParaPrefixa(expressao);
            resultado = calcularPosfixa(expressaoPosfixa);
        }

        System.out.println("\nResultado: " + resultado);
        System.out.println("\nExpressão nas três notações:");
        System.out.println("Infixa: " + expressaoInfixa);
        System.out.println("Prefixa: " + expressaoPrefixa);
        System.out.println("Pós-fixa: "  + expressaoPosfixa);
    }

    public static int calcularPosfixa(String expr) {
        Stack<Integer> pilha = new Stack<>();
        String[] partes = expr.split(" ");
        for (String parte : partes) {
            if (parte.equals("+") || parte.equals("-") || parte.equals("*") || parte.equals("/")) {
                if (pilha.size() < 2) {
                    System.out.println("Expressão inválida!");
                    return 0;
                }
                int b = pilha.pop();
                int a = pilha.pop();
                int r = 0;
                if (parte.equals("+")) r = a + b;
                if (parte.equals("-")) r = a - b;
                if (parte.equals("*")) r = a * b;
                if (parte.equals("/")) {
                    if (b == 0) {
                        System.out.println("Divisão por zero!");
                        return 0;
                    }
                    r = a / b;
                }
                pilha.push(r);
            } else {
                try {
                    pilha.push(Integer.parseInt(parte));
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido: " + parte);
                    return 0;
                }
            }
        }

        if (pilha.size() != 1) {
            System.out.println("Expressão pós-fixa inválida!");
            return 0;
        }
        return pilha.pop();
    }

    public static int calcularPrefixa(String expr) {
        Stack<Integer> pilha = new Stack<>();
        String[] partes = expr.split(" ");

        for (int i = partes.length - 1; i >= 0; i--) {
            String parte = partes[i];
            if (parte.equals("+") || parte.equals("-") || parte.equals("*") || parte.equals("/")) {
                if (pilha.size() < 2) {
                    System.out.println("Expressão inválida!");
                    return 0;
                }
                int a = pilha.pop();
                int b = pilha.pop();
                int r = 0;
                if (parte.equals("+")) r = a + b;
                if (parte.equals("-")) r = a - b;
                if (parte.equals("*")) r = a * b;
                if (parte.equals("/")) {
                    if (b == 0) {
                
                        System.out.println("Divisão por zero!");
                        return 0;
                    }
                    r = a / b;
                }
                pilha.push(r);
            } else {
                try {
                    pilha.push(Integer.parseInt(parte));
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido: " + parte);
                    return 0;
                }
            }
        }

        if (pilha.size() != 1) {
            System.out.println("Expressão prefixa inválida!");
            return 0;
        }
        return pilha.pop();
    }


    public static String infixaParaPosfixa(String expr) {
        StringBuilder resultado = new StringBuilder();
        Stack<String> operadores = new Stack<>();
        String[] partes = expr.split(" ");
        
        Map<String, Integer> precedencia = new HashMap<>();
        precedencia.put("+", 1);
        precedencia.put("-", 1);
        precedencia.put("*", 2);
        precedencia.put("/", 2);
        precedencia.put("(", 0);

        for (String parte : partes) {
            if (parte.equals("(")) {
                operadores.push(parte);
            } else if (parte.equals(")")) {
                while (!operadores.isEmpty() && !operadores.peek().equals("(")) {
                    resultado.append(operadores.pop()).append(" ");
                }
                if (!operadores.isEmpty() && operadores.peek().equals("(")) {
                    operadores.pop();
                }
            } else if (parte.equals("+") || parte.equals("-") || parte.equals("*") || parte.equals("/")) {
                while (!operadores.isEmpty() && precedencia.getOrDefault(operadores.peek(), 0) >= precedencia.get(parte)) {
                    resultado.append(operadores.pop()).append(" ");
                }
                operadores.push(parte);
            } else {
                resultado.append(parte).append(" ");
            }
        }

        while (!operadores.isEmpty()) {
            resultado.append(operadores.pop()).append(" ");
        }

        return resultado.toString().trim();
    }

    public static String infixaParaPrefixa(String expr) {
        String posfixaExpr = infixaParaPosfixa(expr);
        return posfixaParaPrefixa(posfixaExpr);
    }

    public static String posfixaParaPrefixa(String expr) {
        Stack<String> pilha = new Stack<>();
        String[] partes = expr.split(" ");

        for (String parte : partes) {
            if (parte.equals("+") || parte.equals("-") || parte.equals("*") || parte.equals("/")) {
                String b = pilha.pop();
                String a = pilha.pop();
                pilha.push(parte + " " + a + " " + b);
            } else {
                pilha.push(parte);
            }
        }

        return pilha.pop();
    }

    public static String posfixaParaInfixa(String expr) {
        Stack<String> pilha = new Stack<>();
        String[] partes = expr.split(" ");

        for (String parte : partes) {
            if (parte.equals("+") || parte.equals("-") || parte.equals("*") || parte.equals("/")) {
                String b = pilha.pop();
                String a = pilha.pop();
                pilha.push("( " + a + " " + parte + " " + b + " )");
            } else {
                pilha.push(parte);
            }
        }

        String resultado = pilha.pop();

        if (resultado.startsWith("( ") && resultado.endsWith(" )")) {
            resultado = resultado.substring(2, resultado.length() - 2);
        }
        return resultado;
    }

    public static String prefixaParaInfixa(String expr) {
        Stack<String> pilha = new Stack<>();
        String[] partes = expr.split(" ");

        for (int i = partes.length - 1; i >= 0; i--) {
            String parte = partes[i];
            if (parte.equals("+") || parte.equals("-") || parte.equals("*") || parte.equals("/")) {
                String a = pilha.pop();
                String b = pilha.pop();
                pilha.push("( " + a + " " + parte + " " + b + " )");
            } else {
                pilha.push(parte);
            }
        }

        String resultado = pilha.pop();

        if (resultado.startsWith("( ") && resultado.endsWith(" )")) {
            resultado = resultado.substring(2, resultado.length() - 2);
        }
        return resultado;
    }
    
    public static String prefixaParaPosfixa(String expr) {
        String infixaExpr = prefixaParaInfixa(expr);
        return infixaParaPosfixa(infixaExpr);
    }
}