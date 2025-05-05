package Thread;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class example {

    // Simulates fetching user data (e.g., from a DB or API)
    public static String fetchUserData(String userId) {
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Data for user " + userId;
    }

    public static void main(String[] args) {
        List<String> userIds = Arrays.asList("U101", "U102", "U103", "U104", "U105");

        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Use CompletionService to retrieve results as they become available
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        // Submit tasks
        for (String userId : userIds) {
            completionService.submit(() -> fetchUserData(userId));
        }

        // Retrieve and print results
        for (int i = 0; i < userIds.size(); i++) {
            try {
                Future<String> future = completionService.take(); // blocks if none available
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}
