package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {
	public boolean check(String filename) throws FilenameException {
		if (filename == null || filename.isEmpty()) {
			throw new FilenameException("file is empty");
		}
		return filename.endsWith(".java");

	}

	public Map<String, Integer> map(List<String> filenames) {
		Map<String, Integer> resultMap = new HashMap<>();

		for (String fileName : filenames) {
			try {
				boolean isJavaFile = this.check(fileName);

				resultMap.put(fileName, isJavaFile ? 1 : 0);
			} catch (FilenameException e) {
				resultMap.put(fileName, -1);
			}
		}

		return resultMap;
	}
}
