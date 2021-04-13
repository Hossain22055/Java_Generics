import javax.sound.midi.Soundbank;

class Data<K,V>{
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	} 
	
}
public class Generic {
	public static void main(String[] args) {
		Data<Integer, String> data = new Data<Integer, String>(1, "Hossain");
		
		System.out.println("key:" + data.getKey() +" "+ "Value:"+ data.getValue());
		

	
	}

}
