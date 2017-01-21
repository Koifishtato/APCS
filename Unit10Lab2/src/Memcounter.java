
public class Memcounter extends Counter{
	private int memory;
	public Memcounter(){
		this(0);
	}
	public Memcounter(int counter){
		super(counter);
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void setMemory(){
		this.memory=this.get();
	}
	
}
