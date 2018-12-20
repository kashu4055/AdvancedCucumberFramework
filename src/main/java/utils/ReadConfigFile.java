package utils;

import java.io.IOException;
import java.util.Properties;

import gherkin.deps.net.iharder.Base64.InputStream;

public class ReadConfigFile {
	
	protected java.io.InputStream input = null;
	protected Properties prop = null;
	
	//reads information from the config file as an input stream
	public ReadConfigFile (){
		try {
			input = ReadConfigFile.class.getClassLoader().getResourceAsStream(Constant.CONFIG_PROPERTIES_DIRECTORY);
			prop = new Properties();
			prop.load(input);
			
			
			
		}catch ( IOException e ) {
			e.printStackTrace();
		}
				
	}
	
	//check what type of browser it is
	public String getBrowser(){
		if (prop.getProperty("browser") == null)
			return "";
		return prop.getProperty("browser");
	}
}
