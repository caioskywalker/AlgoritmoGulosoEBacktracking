package algoritmoGuloso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrocoMinimo {
	
	public List<Integer> trocoMinimo(int valor, int[] moedas) {
        List<Integer> troco = new ArrayList<>();

        // Ordenar as moedas em ordem decrescente de valor
        List<int[]> coinList = Arrays.asList(moedas);
        Collections.sort(coinList, Collections.reverseOrder());

        int valorRestante = valor;

        // Itera sobre as moedas enquanto o valor restante for maior que zero
        for (int moeda : moedas) {
            while (valorRestante >= moeda) {
                valorRestante -= moeda;
                troco.add(moeda);
            }
        }

        return troco;
    }

}
