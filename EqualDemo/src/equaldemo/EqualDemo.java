package equaldemo;

public class EqualDemo 
{
	 int length;
	 int breadth;
 public EqualDemo(int length, int breadth) 
 {
		super();
		this.length = length;
		this.breadth = breadth;
	}
 @Override
 public String toString() {
 	return "EqualDemo [length=" + length + ", breadth=" + breadth + "]";
 }
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + breadth;
	result = prime * result + length;
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
	EqualDemo other = (EqualDemo) obj;
	if (breadth != other.breadth)
		return false;
	if (length != other.length)
		return false;
	return true;
}
 
}
