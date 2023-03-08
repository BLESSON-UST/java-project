package hashmapexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Employees {
	
	private String name;
	private int age;
	private String dept;
	
	
	@Override
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, dept, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return age == other.age && Objects.equals(dept, other.dept) && Objects.equals(name, other.name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public Employees(String name,int age,String dept)
	{
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
}

	