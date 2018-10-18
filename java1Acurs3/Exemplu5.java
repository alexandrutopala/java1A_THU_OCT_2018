public class Exemplu5 {
    public static void main(String [] args) {
        int[] v1 = new int[]{5, 1, 1, 6};
        
        
        int[] v2 = new int[2];
        
        int[][] m1 = new int[3][2];
        int[][] m2 = new int[][]{{4, 3}, {1, 7}, {0, 9}};
        
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int[] x : m2) {
            for (int y : x) {
                System.out.println(y);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}