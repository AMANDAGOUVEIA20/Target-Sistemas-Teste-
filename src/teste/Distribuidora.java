package teste;

public class Distribuidora {
    public static void main(String[] args) {
        // Definindo o faturamento mensal por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Calculando o total do faturamento mensal
        double total = sp + rj + mg + es + outros;

        // Calculando o percentual de representação de cada estado
        double percentual_sp = (sp / total) * 100;
        double percentual_rj = (rj / total) * 100;
        double percentual_mg = (mg / total) * 100;
        double percentual_es = (es / total) * 100;
        double percentual_outros = (outros / total) * 100;

        // Imprimindo os resultados
        System.out.printf("Percentual de representação de SP: %.2f%%\n", percentual_sp);
        System.out.printf("Percentual de representação de RJ: %.2f%%\n", percentual_rj);
        System.out.printf("Percentual de representação de MG: %.2f%%\n", percentual_mg);
        System.out.printf("Percentual de representação de ES: %.2f%%\n", percentual_es);
        System.out.printf("Percentual de representação de outros estados: %.2f%%\n", percentual_outros);
    }
}

