public class Segitiga {
    public static void main(String[] args) {
        int tinggiSegitiga = 5;
        for (int i = 1; i <= tinggiSegitiga * 2 - 1; i++) {
            int batasKolom = (i <= tinggiSegitiga) ? i : (tinggiSegitiga * 2 - i);

            for (int j = 1; j <= batasKolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
