import java.util.Scanner;
public class Algoritmo360 {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
    
            int[] ultimoDias = {20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21}; // eu fiz isso para facilitar no codigo, colocando os dias em que cada signo começa
            String[] signos = {
                "Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos",
                "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"
            };
    
            int data, dia, mes;
    
            System.out.print("Digite a data de nascimento no formato ddmm (ou 9999 para sair): ");
            data = sc.nextInt();
    
            while (data != 9999) {
                dia = data / 100;
                mes = data % 100;
    
                int indiceMes = mes - 1;
    
                if (indiceMes < 0 || indiceMes > 11 || dia < 1 || dia > 31) {
                    System.out.println("Data inválida.");
                } else {
                    if (dia > ultimoDias[indiceMes]) {
                        indiceMes = (indiceMes + 1) % 12;
                    }
                    System.out.println("Signo: " + signos[indiceMes]);
                }
    
                System.out.print("\nDigite a data de nascimento no formato ddmm (ou 9999 para sair): ");
                data = sc.nextInt();
            }
    
            System.out.println("Fim do programa.");
            sc.close();
        }
    }
