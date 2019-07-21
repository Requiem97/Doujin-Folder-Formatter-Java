package doujin.formatter;

import java.io.File;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import doujin.json.JsonReader;
import doujin.util.SourceController;

public class FormatterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] fileList = new File("input").listFiles();
		for (File file : fileList) {
			try {
				String jsonPath = file.getPath() + "\\contentV2.json";
				String thumbPath = file.getPath() + "\\thumb.jpg";
				JSONObject json = JsonReader.readJson(jsonPath);
				String title = SourceController.getTitleBySource(json);
				System.out.println(title);
				deleteJson(jsonPath);
				renameThumb(thumbPath);
				file.renameTo(new File("output\\" + title));
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			} catch (ParseException e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	private static void renameThumb(String path) {
		File thumb = new File(path);
		thumb.renameTo(new File(thumb.getParentFile() + "\\folder.jpg"));
		System.out.println("\tthumb.jpg renamed to folder.jpg");
	}

	private static void deleteJson(String path) {
		File json = new File(path);
		json.delete();
		System.out.println("\tJSON deleted");
	}

}
