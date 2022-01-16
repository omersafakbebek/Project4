import java.util.ArrayList;
import java.util.HashMap;

public class Vertex {	
	HashMap<Vertex,Integer> edges=new HashMap<>();
	ArrayList<Vertex> neighbors=new ArrayList<>();
	boolean visit;
	int level=-1;
}
