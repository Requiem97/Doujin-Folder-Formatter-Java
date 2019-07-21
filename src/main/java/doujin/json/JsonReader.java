package doujin.json;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	public static JSONObject readJson(String file) throws IOException, ParseException {
		FileReader fr;
		JSONParser parser = new JSONParser();
		JSONObject json = null;
		fr = new FileReader(file);
		Object obj = parser.parse(fr);
		json = (JSONObject) obj;
		fr.close();
		return json;
	}

	public static String getHentaicafeTitle(JSONObject json) {
		return ((String) json.get("title")).replaceAll("[\\\\/:*?\"<>|]", "").replaceAll("’", "'")
				.replaceAll("[^\\x00-\\x7f]", "").replaceAll("  ", " ");
	}

	public static String getFakkuTitle(JSONObject json) {
		String author = (String) json.get("author");
		String title = (String) json.get("title");
		return String.format("[%s] %s", author, title).replaceAll("[\\\\/:*?\"<>|]", "").replaceAll("’", "'")
				.replaceAll("[^\\x00-\\x7f]", "").replaceAll("  ", " ");
	}

	public static String getNHentaiTitle(JSONObject json) {
		String author = (String) json.get("author");
		String title = (String) json.get("title");
		return String.format("[%s] %s", author, title).replaceAll("[\\\\/:*?\"<>|]", "").replaceAll("’", "'")
				.replaceAll("[^\\x00-\\x7f]", "").replaceAll("  ", " ");
	}

	public static String getSource(JSONObject json) {
		return (String) json.get("site");
	}
}
