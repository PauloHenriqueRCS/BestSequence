package File;

public class NumBest {
	
	int best[];
	int next[];
	int num[];

	public  void Calcular(int N) {

		best = new int[N];
		next = new int[N];
		num = new int[N];

		/** for de atribuição de vetor aleatorio**/
		for (int j = 0; j < num.length; j++) {
			int aleatorio = (int) (1 + (Math.random() * 9));
			num[j] = aleatorio;
		}

		/** best recebe 1 na ultima posição **/
		best[num.length - 1] = 1;

		/**
		 * for que le da direita para esqueda o vetor e a partir da penultima
		 * posição
		 **/
		for (int i = (num.length - 2); i >= 0; i--) {
			/** a cada for best recebe 1 **/
			best[i] = 1;

			/** calcula o best e o next que informa a posição do best **/
			for (int j = (i + 1); j < (num.length - 1); j++) {

				if (num[j] > num[i] && 1 + best[j] > best[i]) {
					best[i] = 1 + best[j];
					next[i] = j;

				}
			}
		}

	
			
		/** imrpime vetores **/
		System.out.print(" Num[] = ");
		for (int j = 0; j < num.length; j++)
			System.out.print(" " + num[j]);
		System.out.print("\n");
		System.out.print("Best[] = ");
		for (int j = 0; j < best.length; j++)
			System.out.print(" " + best[j]);
		System.out.print("\n");
		System.out.print("Next[] = ");
		for (int j = 0; j < next.length; j++)
			System.out.print(" " + next[j]);

		
	}

}
