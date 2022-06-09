package JavaTrainingAssignments.Day3.Assignment.Assignment1;

public class ToTitleCase {
    public static String toTitleCase(String inputString) {
        inputString = " " + inputString;
        String res = "";
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == ' ') {
                char ch1 = inputString.charAt(i + 1);
                res = res + " " + Character.toUpperCase(ch1);
                i++;
            } else {
                res = res + Character.toLowerCase(ch);
            }
        }
        res = res.strip();
        return res;
    }
}
