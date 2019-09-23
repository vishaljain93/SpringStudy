package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Car {

	private Engine engine;
	private Engine[] engines;
	private String carname;
	private String[] id;
	private List<String> names;
	private Set<Integer> cricketers;
	private Map<String, String> map;
	private Vector v;
	private TreeSet ts;
	private Hashtable ht;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setCricketers(Set<Integer> cricketers) {
		this.cricketers = cricketers;
	}

	public void setId(String[] id) {
		this.id = id;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public Map<String, String> getMap() {
		return map;
	}

	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}

	public void setV(Vector v) {
		this.v = v;
	}

	public void setTs(TreeSet ts) {
		this.ts = ts;
	}

	public void setHt(Hashtable ht) {
		this.ht = ht;
	}

	public void printCarDetails() {
		System.out.println("Car Name: " + carname + " Model Year: " + engine.getModelYear());
		System.out.println("Names: " + names);
		System.out.println("Cricketers: " + cricketers);
		System.out.println("Map: " + map);
		System.out.println();
		/*Set<String> set = map.keySet();
		for (String s : set) {
			System.out.println(map.get(s));
		}*/
		/*for (String i : id) {
			System.out.println(i);
		}
		for (Engine e : engines) {
			System.out.println(e);
		}*/
	}
}