package day65_collections02;

import java.util.*;

public class LoopMap {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("url", "qa3.vytrack.com");
		dataMap.put("username", "user1");
		dataMap.put("password", "UserUser123");
		dataMap.put("browser", "chrome");
		dataMap.put("truckdriver", "Roman");
		dataMap.put("storemanager", "John Doe");

		//keySet() -> returns all keys in the map
		System.out.println("##### KEYS #####");
		for (String key : dataMap.keySet()) {
			System.out.println(key);
		}

		// values() -> returns all values in the map
		System.out.println("##### VALUES #####");
		for (String value : dataMap.values()) {
			System.out.println(value);
		}

		System.out.println("##### KEY | VALUES #####");
		for (String key : dataMap.keySet()) {
			System.out.println(key + " | " + dataMap.get(key));
		}
		
		
		Map<Integer, Student> studentsMap = new HashMap<>();
		Map<Integer, String []> data = new HashMap<>();
		Map<Integer, List<String>> data2 = new HashMap<>();
		Map<Integer, List<String[]>> data3 = new HashMap<>();
		Map<String, Map<Integer, Integer>> data4 = new HashMap<>();
		
	}
}
