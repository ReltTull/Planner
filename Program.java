import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Task<Integer> day1 = new Task<>(5, "study", "learning the Spring framework");
        Task<String> day2 = new Task<>("medium", "movieReview", "Write the review");

        ArrayList<Task> planner = new ArrayList<>();

        planner.add(day1);
        planner.add(day2);

        for (int i = 0; i < planner.size(); i++) {
            planner.get(i).getInfo();
        }
    }
}
