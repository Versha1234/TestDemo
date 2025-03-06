package com.terex.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.terex.constants.FrameworkConstants;

public class ReadPropertyFile {

	public static Properties property = new Properties();

	private static final Map<String, String> CONFIGMAP = new HashMap();

	private ReadPropertyFile() {

	}

	static {
		FileInputStream file;
		try {
			file = new FileInputStream(FrameworkConstants.getConfigfilepath());
			property.load(file);
			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String get(ConfigProperties key) throws Exception {
		try {
			if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {

				// throw new Exception("Property name " + key + " is not found.Please check
				// config.properties");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return CONFIGMAP.get(key.name().toLowerCase());

	}
}
