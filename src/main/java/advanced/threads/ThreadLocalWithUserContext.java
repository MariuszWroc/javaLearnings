package advanced.threads;

public class ThreadLocalWithUserContext implements Runnable {
    private static ThreadLocal<Context> userContext = new ThreadLocal<>();
    private Integer userId;
    private final String [] userRepository = {"Mariusz", "Ania", "Ola"};
    
    public ThreadLocalWithUserContext(Integer userId) {
		this.userId = userId;
	}

	@Override
    public void run() {
        String userName = userRepository[userId];
        userContext.set(new Context(userName));
        System.out.println("thread context for given userId: " + userId + " is: " + userContext.get());
    }   
}
