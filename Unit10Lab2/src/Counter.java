/**
 * Counter class for creating counter objects
 * @author Alexander Loeffler
 *@version 1.0
 */
public class Counter {
	private int Counter;
	public Counter(){
		this(0);
	}
	public Counter(int counter){
		this.Counter=counter;
	}
	public int get(){
		return this.Counter;
	}
	public void inc(){
		this.Counter++;
	}
	public void dec(){
		this.Counter--;
	}
	public void set(int counter){
		this.Counter=counter;
	}
	public void inc(int times){
		for(int x = 0; x != times; x++){
			this.inc();
		}
	}
	public void dec(int times){
		for(int x = 0; x != times; x++){
			this.dec();
		}
	}
}
