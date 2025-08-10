public class Main

    public static void main(String[] args) {
        int[][] var0 = new int[4][4];
        int var3 = 1;

        for (int var1 = 0; var1 < 4; ++var1) {
            for (int var2 = 0; var2 < 4; ++var2) {
                var0[var1][var2] = var3++;
            }
        }

        for (int var1 = 0; var1 < 4; ++var1) {
            for (int var2 = 0; var2 < 4; ++var2) {
                System.out.print(var0[var1][var2] + " ");
            }
            System.out.println();
        }
    }
}
