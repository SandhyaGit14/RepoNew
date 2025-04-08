package javaPrograms;

class Data {
	private String value;
	
	public void setValue(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}

public class AccessModifiers {

	public static void main(String[] args){
		
		Data mod = new Data();
		mod.setValue("Sandhya");
		
		System.out.println(mod.getValue());
	}

}
