package advanced.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(4);
		executor.schedule(() -> {
			System.out.println("..later");
		}, 1, TimeUnit.SECONDS);
	}
}
