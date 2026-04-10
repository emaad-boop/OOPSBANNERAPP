public class UC5 {
    public static void main(String[] args) {

        String[] lines = {
            String.join(" ", " *** ", " *** ", "**** ", " ****"),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "**** ", " *** "),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", "*   *", "*   *", "*    ", "*   *"),
            String.join(" ", "*   *", "*   *", "*    ", "*   *"),
            String.join(" ", " *** ", " *** ", "*    ", " ****")
        };

        // for-each loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}