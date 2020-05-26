package patterns.proxy;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ProxyMain {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("1");

		// image will not be loaded from disk
		image.display();
		
		List<String> string = new LinkedList<>();
		string.stream().filter(x -> x.equals(":")).peek(System.out::println).collect(Collectors.toSet());
	}

}
