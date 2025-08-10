public class Main {

    public static void main(String[] args) {
        int[][] lista = new int[4][4];
        int cont = 1;

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                lista[i][j] = cont++;
            }
        }

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                System.out.print(lista[i][j] + " ");
            }
            System.out.println();
        }
    }
}
