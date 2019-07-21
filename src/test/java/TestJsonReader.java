import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.*;

import doujin.json.JsonReader;

public class TestJsonReader {
	@Test
	public void jsonReaderTest() {
		String file = "doujins\\hentaicafe\\Puyocha - _Puyocha__Love___Vibe - [7872]\\contentV2.json";
		try {
			assertNotNull(JsonReader.readJson(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void getHentaicafeTitleTest() {
		String file = "doujins\\hentaicafe\\Puyocha - _Puyocha__Love___Vibe - [7872]\\contentV2.json";
		JSONObject json;
		try {
			json = JsonReader.readJson(file);
			String title = JsonReader.getHentaicafeTitle(json);
			System.out.println(title);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void getFakkuTitleTest() {
		String file = "doujins\\Fakku\\Yahiro_Pochi - Flower_s_Nectar - [flowerbgbs-nectar-english]\\contentV2.json";
		JSONObject json;
		try {
			json = JsonReader.readJson(file);
			String title = JsonReader.getFakkuTitle(json);
			// System.out.println(new String("❤", "UTF-8"));
			System.out.println(title);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void getNHentaiTitleTest() {
		String file = "doujins\\nhentai\\kakao - Koakuma_Setsuko_no_Himitsu_Vol._4 - [277607]\\contentV2.json";
		JSONObject json;
		try {
			json = JsonReader.readJson(file);
			String title = JsonReader.getNHentaiTitle(json);
			// System.out.println(new String("❤", "UTF-8"));
			System.out.println(title);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void getSourceTest() {
		String file = "doujins\\nhentai\\kakao - Koakuma_Setsuko_no_Himitsu_Vol._4 - [277607]\\contentV2.json";
		JSONObject json;
		try {
			json = JsonReader.readJson(file);
			String site = JsonReader.getSource(json);
			// System.out.println(new String("❤", "UTF-8"));
			System.out.println(site);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
