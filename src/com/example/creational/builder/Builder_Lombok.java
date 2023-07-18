package com.example.creational.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Builder_Lombok {
	private String field1;
	private String field2;
	private String field3;
	private String field4;

	public static void main(String[] args) {
		Builder_Lombok obj = Builder_Lombok.builder()
				.field1("1")
				.field3("3")
				.build();
		
		System.out.println(obj.toString());
	}

}
