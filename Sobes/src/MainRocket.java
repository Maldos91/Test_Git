import java.util.*;

public class MainRocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] logs = new int[n][5];

        for (int i = 0; i < n; i++) {
            logs[i][0] = scanner.nextInt();
            logs[i][1] = scanner.nextInt();
            logs[i][2] = scanner.nextInt();
            logs[i][3] = scanner.nextInt();
            logs[i][4] = scanner.next().charAt(0);
        }

        Arrays.sort(logs, Comparator.comparingInt(a -> a[0] * 24 * 60 + a[1] * 60 + a[2]));

        System.out.println(Arrays.toString(rocketMovementTime(logs)));
    }

    public static int[] rocketMovementTime(int[][] logs) {
        Map<Integer, Integer> rockets = new TreeMap<>();
        Map<Integer, Integer> startTime = new HashMap<>();

        for (int[] log : logs) {
            int day = log[0];
            int hour = log[1];
            int minute = log[2];
            int id = log[3];
            char status = (char)log[4];
            int time = day * 24 * 60 + hour * 60 + minute;

            if (status == 'A') {
                startTime.put(id, time);
            } else if (status == 'S' || status == 'C') {
                if (startTime.containsKey(id)) {
                    rockets.put(id, rockets.getOrDefault(id, 0) + time - startTime.get(id));
                    startTime.remove(id);
                }
            }
        }

        int[] result = new int[rockets.size()];
        int i = 0;
        for (int time : rockets.values()) {
            result[i++] = time;
        }

        return result;
    }
}