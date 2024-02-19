class Star {
    public static void main(String args[]) {
        int i, j, s;
        for (i = 0; i <= 7; i++) {
            for (s = 0; s <= 7 - i; s++) {
                System.out.print("");
            }
            for (j = 0; j <= 7 - i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}