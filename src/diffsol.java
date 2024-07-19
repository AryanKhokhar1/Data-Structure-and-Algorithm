import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class diffsol {
    public void survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Stack<Integer> Robot_Club = new Stack<>();
        List<Integer> Answer  = new ArrayList<>();

        // Convert primitive array to Integer array for use with Arrays.asList
        Integer[] sa = Arrays.stream(positions).boxed().toArray(Integer[]::new);
        Arrays.sort(sa);
        List<Integer> sortedpositions = new ArrayList<>(Arrays.asList(sa));

        int prev_index = findIndex(positions, sortedpositions.get(0));
        Robot_Club.push(healths[prev_index]);
        char prev_dir = directions.charAt(prev_index);
        int prev_health;
        int index;
        char curr_dir;

        for(int i = 1; i < sortedpositions.size(); i++){
            index = findIndex(positions, sortedpositions.get(i));
            curr_dir = directions.charAt(index);
            if(!Robot_Club.isEmpty()){
                prev_health = Robot_Club.peek();
                if(prev_dir != curr_dir){
                    if(prev_health == healths[index]){
                        Robot_Club.pop();
                    } else if(prev_health < healths[index]){
                        Robot_Club.pop();
                        Robot_Club.push(healths[index] - 1);
                    } else {
                        Robot_Club.pop();
                        Robot_Club.push(prev_health - 1);
                    }
                } else {
                    Robot_Club.push(healths[index]);
                }
            } else {
                Robot_Club.push(healths[index]);
            }
            prev_dir = curr_dir;
        }

        // Code to convert Robot_Club to Answer if needed
        while (!Robot_Club.isEmpty()) {
            Answer.add(Robot_Club.pop());
        }

        System.out.println(Answer);
    }

    // Helper function to find the index of an element in an array
    private int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // Should never happen if value is guaranteed to be in arr
    }

    public static void main(String[] args) {
        diffsol obj = new diffsol();
        int[] positions = {3, 5, 2, 6};
        int[] healths = {10, 10, 15, 12};
        String str = "RLRL";
        obj.survivedRobotsHealths(positions, healths, str);
    }
}
