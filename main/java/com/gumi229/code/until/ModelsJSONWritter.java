package com.gumi229.code.until;

import org.json.JSONObject;

public class ModelsJSONWritter {
	public static void BuildItemJSON(String name, String parent) {
		JSONObject json = new JSONObject();
		json.put("parent", "item/" + parent);

	}
}
