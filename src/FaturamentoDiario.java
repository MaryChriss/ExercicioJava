public class FaturamentoDiario {

    static class DiaFaturamento {
        int dia;
        double valor;

        public DiaFaturamento(int dia, double valor) {
            this.dia = dia;
            this.valor = valor;
        }
    }

    public static void main(String[] args) {

        DiaFaturamento[] faturamentos = {
                new DiaFaturamento(1, 22174.1664),
                new DiaFaturamento(2, 24537.6698),
                new DiaFaturamento(3, 26139.6134),
                new DiaFaturamento(4, 0.0),
                new DiaFaturamento(5, 0.0),
                new DiaFaturamento(6, 26742.6612),
                new DiaFaturamento(7, 0.0),
                new DiaFaturamento(8, 42889.2258),
                new DiaFaturamento(9, 46251.174),
                new DiaFaturamento(10, 11191.4722),
                new DiaFaturamento(11, 0.0),
                new DiaFaturamento(12, 0.0),
                new DiaFaturamento(13, 3847.4823),
                new DiaFaturamento(14, 373.7838),
                new DiaFaturamento(15, 2659.7563),
                new DiaFaturamento(16, 48924.2448),
                new DiaFaturamento(17, 18419.2614),
                new DiaFaturamento(18, 0.0),
                new DiaFaturamento(19, 0.0),
                new DiaFaturamento(20, 35240.1826),
                new DiaFaturamento(21, 43829.1667),
                new DiaFaturamento(22, 18235.6852),
                new DiaFaturamento(23, 4355.0662),
                new DiaFaturamento(24, 13327.1025),
                new DiaFaturamento(25, 0.0),
                new DiaFaturamento(26, 0.0),
                new DiaFaturamento(27, 25681.8318),
                new DiaFaturamento(28, 1718.1221),
                new DiaFaturamento(29, 13220.495),
                new DiaFaturamento(30, 8414.61)
        };

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasValidos = 0;

        for (DiaFaturamento faturamento : faturamentos) {
            if (faturamento.valor > 0) { // Ignorar dias sem faturamento
                somaFaturamento += faturamento.valor;
                diasValidos++;

                if (faturamento.valor < menorFaturamento) {
                    menorFaturamento = faturamento.valor;
                }
                if (faturamento.valor > maiorFaturamento) {
                    maiorFaturamento = faturamento.valor;
                }
            }
        }

        double mediaMensal = somaFaturamento / diasValidos;
        int diasAcimaMedia = 0;

        for (DiaFaturamento faturamento : faturamentos) {
            if (faturamento.valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
    }
}
