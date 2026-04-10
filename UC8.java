import java.util.*;

public class UC8 {

    // Method to create and return the map
    public static Map<Character, String[]> getPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        // O
        map.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        // P
        map.put('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });

        // S
        map.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "*   *",
            "*   *",
            " ****"
        });

        return map;
    }

    public static void main(String[] args) {

        String text = "OOPS";
        Map<Character, String[]> patterns = getPatterns();

        // Outer loop → rows
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            // Inner loop → characters
            for (char ch : text.toCharArray()) {
                line.append(patterns.get(ch)[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}