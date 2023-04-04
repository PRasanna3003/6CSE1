package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Configuration.properties");
		Properties property = new Properties();
		property.load(fis);
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("name"));
	}

}
