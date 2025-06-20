import java.util.Arrays;

public class IRCTC {
    public static void main(String[] args) {
        int[] tickets = {2, 0, 0, 1, 0, 2, 0, 1};

        // Dutch National Flag Algorithm
        int low = 0, mid = 0, high = tickets.length - 1;

        while (mid <= high) {
            if (tickets[mid] == 0) {
                // Swap mid and low
                int temp = tickets[mid];
                tickets[mid] = tickets[low];
                tickets[low] = temp;
                low++;
                mid++;
            } else if (tickets[mid] == 1) {
                mid++;
            } else {
                // Swap mid and high
                int temp = tickets[mid];
                tickets[mid] = tickets[high];
                tickets[high] = temp;
                high--;
            }
        }

        // Output the result
        System.out.println("Sorted Tickets by Priority: " + Arrays.toString(tickets));
    }
}

