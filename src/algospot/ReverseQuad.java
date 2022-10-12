import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Scanner;

public class ReverseQuad {
    static String input;
    static char[][] decompressed;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        sc.close();

        Long size = 16L;
        decompressed = new char[size.intValue()][size.intValue()];
        CharacterIterator ci = new StringCharacterIterator(input);
        decompress(ci, 0, 0, size.intValue());
        for (char[] ver : decompressed) {
            for (char ch : ver) {
                if (ch == 'b') System.out.print("■");
                else System.out.print("□");
            }
            System.out.println();
        }

    }

    static void decompress(CharacterIterator ci, int y, int x, int size) {
        char head = ci.current();
        ci.next();
        if (head == 'b' || head == 'w') {
            for (int dy = 0; dy < size; dy++) {
                for (int dx = 0; dx < size; dx++) {
                    decompressed[y+dy][x+dx] = head;
                }
            }
        } else {
            int half = size / 2;
            decompress(ci, y, x, half);
            decompress(ci, y, x + half, half);
            decompress(ci, y + half, x, half);
            decompress(ci, y + half, x + half, half);
        }
    }
}
