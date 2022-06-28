package structural.proxy.non_dynamic.factory;

import structural.proxy.non_dynamic.ImageProxy;
import structural.proxy.non_dynamic.image.Image;

//Factory to get image objects.
public class ImageFactory {
	//We'll provide proxy to caller instead of real object
	
	public static Image getImage(String name) {
		return new ImageProxy(name);
	}
}
