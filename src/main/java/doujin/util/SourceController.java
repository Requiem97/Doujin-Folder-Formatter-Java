package doujin.util;

import org.json.simple.JSONObject;

import doujin.json.JsonReader;

public class SourceController {
	public static String getTitleBySource(JSONObject json) {
		String source = JsonReader.getSource(json).toLowerCase();
		switch (source){
			case "fakku2":
				return JsonReader.getFakkuTitle(json);
			case "nhentai":
				return JsonReader.getNHentaiTitle(json);
			case "hentaicafe":
				return JsonReader.getHentaicafeTitle(json);
			default:
				return "";
		}
	}
}
