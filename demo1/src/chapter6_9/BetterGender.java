package chapter6_9;

public enum BetterGender {
	MALE, FEMALE;
	private String name;
	public void setName(String name) {
		switch (this) {
		case MALE:
			if(name.equals("��")) {
				this.name= name;
			} else {
				System.out.println("��������");
				return;
			}
			break;
		case FEMALE:
			if(name.equals("Ů")) {
				this.name= name;
			} else {
				System.out.println("��������");
				return;
			}
			break;
		}
	}
	public String getName() {
		return this.name;
	}
}
