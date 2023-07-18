package com.example.creational.builder;

public class ComplexClass {
	private String mandatory1;
	private String mandatory2;
	private String optional1;
	private String optional2;

	private ComplexClass(ComplexClassBuilder complexClassBuilder) {
		this.mandatory1 = complexClassBuilder.mandatory1;
		this.mandatory2 = complexClassBuilder.mandatory2;
		this.optional1 = complexClassBuilder.optional1;
		this.optional2 = complexClassBuilder.optional2;
	}

	public static class ComplexClassBuilder {
		private String mandatory1;
		private String mandatory2;
		private String optional1;
		private String optional2;

		public ComplexClassBuilder(String mandatory1, String mandatory2) {
			this.mandatory1 = mandatory1;
			this.mandatory2 = mandatory2;
		}

		public ComplexClassBuilder Optional1(String optional1) {
			this.optional1 = optional1;
			return this;
		}

		public ComplexClassBuilder Optional2(String optional2) {
			this.optional2 = optional2;
			return this;
		}

		public ComplexClass build() {
			return new ComplexClass(this);
		}
	}

	@Override
	public String toString() {
		return this.mandatory1 + " " + this.mandatory2 + " " + this.optional1 + " " + this.optional2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexClass obj1 = new ComplexClass.ComplexClassBuilder("man1", "man2").build();
		System.out.println(obj1.toString());
		
		ComplexClass obj2 = new ComplexClass.ComplexClassBuilder("man11", "man22").Optional1("op11").build();
		System.out.println(obj2.toString());
	}
}
