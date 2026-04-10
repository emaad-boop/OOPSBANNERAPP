class UC7 {
    char ch;
    String[] pattern;

    // Constructor
    Letter(char ch, String[] pattern) {
        this.ch = ch;
        this.pattern = pattern;
    }
}

public class UC7 {

    public static void main(String[] args) {

        // O pattern
        Letter O = new Letter('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        // P pattern
        Letter P = new Letter('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });

        // S pattern
        Letter S = new Letter('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "*   *",
            "*   *",
            " ****"
        });

        // Array of letters to form OOPS
        Letter[] word = {O, O, P, S};

        // Loop to print banner
        for (int i = 0; i < 7; i++) {
            for (Letter l : word) {
                System.out.print(l.pattern[i] + " ");
            }
            System.out.println();
        }
    }
}