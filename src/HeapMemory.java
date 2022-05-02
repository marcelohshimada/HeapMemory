public class HeapMemory {

	public static void main(String[] args) {

		String[] vetor = new String[1000000000];

		for (int i = 0; i < 1000000000; i++) {

			vetor[i] = "teste";
			System.out.println(vetor[i]);
		}

	}

}