package chatBoot;

public class TextMessage implements Message {
	private String value;
	
	public TextMessage(String value) {
		this.setValue(value);
	}
	@Override
	public Message value() {
		// TODO Auto-generated method stub
		System.out.println(getValue());
		return this;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
