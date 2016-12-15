package lbenvenutoc.com.prototype;

import java.util.HashMap;

public class TelevisionPrototype {

	private HashMap<String, Televisor> prototipos = new HashMap<String, Televisor>();

	public TelevisionPrototype() {
		agregar("plasma", new Plasma("Sony", 21, "Plateado", 399.99, 90, 0.05));
		agregar("lcd", new LCD("Panasonic", 42, "Plateado", 599.99, 290));
	}

	public void agregar(String nombre, Televisor prototipo) {
		prototipos.put(nombre, prototipo);
	}

	public void remover(String nombre) {
		prototipos.remove(nombre);
	}

	public Object prototipo(String tipo) throws CloneNotSupportedException {
		return prototipos.get(tipo).clone();
	}

}
