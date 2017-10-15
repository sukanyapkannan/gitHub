
public class Strings 
{
String x;

public Strings(String x) {
	super();
	this.x = x;
}

public String getX() {
	return x;
}

public void setX(String x) {
	this.x = x;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((x == null) ? 0 : x.hashCode());
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
	Strings other = (Strings) obj;
	if (x == null) {
		if (other.x != null)
			return false;
	} else if (!x.equals(other.x))
		return false;
	return true;
}

}
