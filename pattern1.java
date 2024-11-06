
public class pattern1 {
    public static void main(String [] args) {
        int rows = 3;
        int cols = 3;

        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
         if (j == 0 || j == cols - 1) {
          System.out.print("* ");
                }
          else if (i == rows - 1 && j == 1) {
                  System.out.print("* ");
                }
               
          else {
            System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}