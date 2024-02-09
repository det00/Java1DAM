package ejerc;

public class ArrayRandom {
	public static void main(String[] args) {

		int aleat[] = new int[300];

		for (int i = 0; i < aleat.length; i++) {
			aleat[i] = (int) Math.round(Math.random()*100);

		}
		 for (int num:aleat) {
			 System.out.println(num);
		 }

	}

}
