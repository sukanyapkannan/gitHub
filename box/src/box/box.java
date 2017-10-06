package box;

public class box 
{
 int lenth;
 int depth;
 int height;
public box(int lenth, int depth, int height) 
{
	super();
	this.lenth = lenth;
	this.depth = depth;
	this.height = height;
}
public int getLenth() {
	return lenth;
}
public void setLenth(int lenth) {
	this.lenth = lenth;
}
public int getDepth() {
	return depth;
}
public void setDepth(int depth) {
	this.depth = depth;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
} 
void volume()
{
	int volume;
	volume=lenth*height*depth;
	System.out.println("volume is :"+volume);
}
}
