package teste;
import java.util.ArrayList;

    public class FaturamentoMensal {
        public static void main(String[] args) {
            // Criando a lista com os valores de faturamento diário
            ArrayList<Double> faturamentoDiario = new ArrayList<>();
            faturamentoDiario.add(1500.0);
            faturamentoDiario.add(2000.0);
            faturamentoDiario.add(1800.0);
            faturamentoDiario.add(0.0);
            faturamentoDiario.add(2200.0);
            faturamentoDiario.add(1900.0);
            faturamentoDiario.add(0.0);

            // Calculando o menor e o maior valor de faturamento
            double menor = faturamentoDiario.get(0);
            double maior = faturamentoDiario.get(0);
            for (int i = 1; i < faturamentoDiario.size(); i++) {
                double valor = faturamentoDiario.get(i);
                if (valor < menor) {
                    menor = valor;
                }
                if (valor > maior) {
                    maior = valor;
                }
            }
            System.out.println("Menor valor de faturamento: " + menor);
            System.out.println("Maior valor de faturamento: " + maior);

            // Calculando a média mensal
            double soma = 0.0;
            int diasComFaturamento = 0;
            for (double valor : faturamentoDiario) {
                if (valor > 0) {
                    soma += valor;
                    diasComFaturamento++;
                }
            }
            double mediaMensal = soma / diasComFaturamento;
            System.out.println("Média mensal de faturamento: " + mediaMensal);

            // Contando o número de dias com faturamento acima da média mensal
            int diasAcimaDaMedia = 0;
            for (double valor : faturamentoDiario) {
                if (valor > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
        }
    }
