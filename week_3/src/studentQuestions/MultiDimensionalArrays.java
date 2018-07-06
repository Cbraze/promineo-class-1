package studentQuestions;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		String[][] multi = new String[4][5];
		
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[i].length; j++) {
				multi[i][j] = i + ":" + j;
				System.out.print(multi[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
