package advanced.threads;

public class ProcessDemo {
	public static void main(String[] args) {
		try {
			// create a new process
			System.out.println("Creating Process");

			ProcessBuilder builder = new ProcessBuilder("notepad.exe");
			Process pro = builder.start();

			// kill the process
			pro.destroy();

			// checking the exit value of subprocess
			System.out.println("exit value: " + pro.exitValue());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
