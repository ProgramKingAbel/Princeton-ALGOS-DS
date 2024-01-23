public class RandomWord {
    public static void main(String[] args) {
        String champion = "";

        int i = 1;

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();

            if (Math.random() < 1.0 / i) {
                champion = word;
            }
            i++;
        }
        StdOut.println(champion);
    }
}
