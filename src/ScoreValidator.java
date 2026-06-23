
public class ScoreValidator {

    public static int[] validate(String[] events) {
        int score = 0,
                counter = 0;

        // for (int i = 0; i < events.length; i++) {
        //     System.out.println(events[i]);
        // }

        for (String e : events) {
            if (counter == 10) {
                break;
            } else if (e.equals("0")) {
                score += 0;
            } else if (e.equals("1")) {
                score += 1;
            } else if (e.equals("2")) {
                score += 2;
            } else if (e.equals("3")) {
                score += 3;
            } else if (e.equals("4")) {
                score += 4;
            } else if (e.equals("6")) {
                score += 6;
            } else if (e.equals("W")) {
                counter += 1;
            } else if (e.equals("WD")) {
                score += 1;
            } else if (e.equals("NB")) {
                score += 1;
            }

        }
        // System.out.println(score);
        // System.out.println(counter);
        return new int[]{score, counter};
    }

    public static void main(String[] args) {
        String[] events = {"W","W","W","W","W","W","W","W","W","W","W"};

        validate(events);
        System.out.println();
    }
}
