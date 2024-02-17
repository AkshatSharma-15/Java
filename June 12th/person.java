
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class person implements Externalizable {
	private String name;
	private int age;

	public person() {
		// Default constructor required for externalization
	}

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		person p1 = new person("John", 30);

		// Write object to file
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
		oos.writeObject(p1);
		oos.close();

		// Read object from file
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
		person p2 = (person) ois.readObject();
		ois.close();

		System.out.println("Original object: " + p1);
		System.out.println("Deserialized object: " + p2);
	}

}