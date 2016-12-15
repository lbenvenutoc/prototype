package lbenvenutoc.com.prototype;

/**
 * Hello world!
 *
 */
public class Principal {

	public static void main(String[] args) throws CloneNotSupportedException {

		TelevisionPrototype televisionPrototype = new TelevisionPrototype();
		Televisor televisor = (Televisor) televisionPrototype
				.prototipo("plasma");
		System.out.println(televisor.getPrecio());

	}
}
