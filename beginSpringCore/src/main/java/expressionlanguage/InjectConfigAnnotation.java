package expressionlanguage;

import org.springframework.stereotype.Service;

@Service("configAnnotation")
public class InjectConfigAnnotation {

	private String name = "Berkay";
	private String surname = "ANNOTATION";
	private int age = 99;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
