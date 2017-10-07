package toStringDemo;

public class ToStringDemo 
{
String name;
String id;
int age;

	public ToStringDemo(String name, String id, int age) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
}

	@Override
	public String toString()
	{
		return "ToStringDemo [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToStringDemo other = (ToStringDemo) obj;
		if (age != other.age)
		{
			return  false;
		}
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
