package publisherBot;

public class TextMessage implements Message<String> {
	private String value;
	
	public TextMessage(String value) {
		this.setValue(value);
	}
	@Override
	public String value() {
		// TODO Auto-generated method stub
		return getValue();
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
