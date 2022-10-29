package Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListArrays {

	static List<Integer> halo(){
		List<Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(6);
		return lista;
	}
	
	
	public static void main(String[] args) {
		System.out.println(halo());

	}

}
