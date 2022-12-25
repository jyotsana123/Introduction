import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class url {
	
	public static void main(String[] args) throws IOException {

	URL abc = new URL("https://www.geeksforgeeks.org");
	abc.openConnection();
	
}
}
