public class SortColor {

    public static void sort(int[] tickets) {
        int left = 0;
        int traversal = 0;
        int end = tickets.length - 1;

        while (traversal <= end) {
            if (tickets[traversal] == 0) {
                int temp = tickets[traversal];
                tickets[traversal] = tickets[left];
                tickets[left] = temp;

                left++;
                traversal++;
            } 
            else if (tickets[traversal] == 1) {
                traversal++;
            } 
            else { 
                int temp = tickets[traversal];
                tickets[traversal] = tickets[end];
                tickets[end] = temp;

                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] tickets = {2, 0, 2, 1, 1, 0};

        sort(tickets);

        for (int num : tickets) {
            System.out.print(num + " ");
        }
    }
}