package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class MapTest {
	@Test
	public void test() {
		//List : (AllayList, LinkedList) 순서 {1,2,1,4,6} 리스트는 처음부터 다검색
		//Set  : 중복값 x
		//Map<key,value>  : key, value : 검색할떄는 key를 실행하여 검색 그래서 map사용
		
		Map<String, Object> emp = new HashMap<>();
		emp.put("firstName", "scott");
		emp.put("lastName", "king");
		
		System.out.println(emp.get("firstName"));
		System.out.println(emp.get("lastName"));
	}
}
