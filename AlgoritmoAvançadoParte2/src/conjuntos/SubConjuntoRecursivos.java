package conjuntos;
import java.util.ArrayList;
import java.util.List;

public class SubConjuntoRecursivos {
	
	
	public List<List<Integer>> subConjuntoRecursivos(int[] s, int n){
		List<List<Integer>> resultado = new ArrayList<List<Integer>>();
		
		subConjuntoRecursivoHelper(s, 0, n, new ArrayList<>(), resultado);
        return resultado;
        //Faz uma lista da lista de resultado; 
        /**chama o subConjuntoRecursivoHelper, que recebe o Conjunto S
         * o índice que como 0, n= tamanho do subconjunto, um novo arrayList de subConjunto, e a Lista da lista de resultado
         * a Lista de resultado recebe a o subConjunto(que é uma lista), a qual recebe um Array de Integer.
         */
		
	}
	
	
	private static void subConjuntoRecursivoHelper(int[] s, int indice , int n , List<Integer> subConjuntoAtual, List<List<Integer>> resultado) {
		if(subConjuntoAtual.size() == n) {
			resultado.add(new ArrayList<Integer>(subConjuntoAtual));
			
			// Se o tamanho do subConjuntoAtual for igual ao número de elementos n, adicione o subConjunto ao resultado.
		}
		
		for(int j = indice; j < s.length; j++) { // j iguala ao indice atual, e intera sobre o tamanho do Conjunto S
			subConjuntoAtual.add(s[j]);//O indice atual do Conjunto S é adicionado ao subConjuntoAtual
			subConjuntoRecursivoHelper(s,  j + 1, n, subConjuntoAtual, resultado);/*chamada recursivaDinamica a este método, 
			incrementando o j para o proximo indice, atualizado subconjunto atual e a lista de resultado
			*/
			subConjuntoAtual.remove(subConjuntoAtual.size() - 1);// remove o ultio elemento do SubConjunto
			//Subtraindo 1, ajustamos o índice para o último elemento, pois os índices em Java começam em 0.
			//Isso é importante para igualar a n;
			//Se o tamanho do subconjuntoAtual for igual a n, adicionamos uma cópia do subconjuntoAtual à lista resultado.
			//Isso significa que encontramos um subconjunto válido de tamanho n.
		}
	}

}
