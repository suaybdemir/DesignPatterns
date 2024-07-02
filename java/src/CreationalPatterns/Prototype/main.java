package CreationalPatterns.Prototype;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee gulizar = new Employee("Gülizar", "Yılmaz");

		Employee cloneGulizar = gulizar.clone();


		// Aynı nesne örneklerini farklı referanslarda tutuyor.
		// Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
		System.out.println(gulizar == cloneGulizar); //output: false

	}

}

interface IClonablePrototype<TPrototype> extends Cloneable {
    TPrototype clone() throws CloneNotSupportedException;
}

class Employee implements IClonablePrototype<Employee> {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
