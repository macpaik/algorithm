import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class ReverseQuad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        while (n-- > 0) {
            String input = br.readLine();
            CharacterIterator ci = new StringCharacterIterator(input);
            System.out.println(reverse(ci));
        }
    }

    static String reverse(CharacterIterator ci) {
        char head = ci.current();
        ci.next();

        if (head == 'w' || head == 'b') {
            return Character.toString(head);
        }

        String upperLeft = reverse(ci);
        String upperRight = reverse(ci);
        String lowerLeft = reverse(ci);
        String lowerRight = reverse(ci);

        return "x" + lowerLeft + lowerRight + upperLeft + upperRight;
    }
}