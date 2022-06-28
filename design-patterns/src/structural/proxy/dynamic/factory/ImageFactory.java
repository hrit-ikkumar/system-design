package structural.proxy.dynamic.factory;

import structural.proxy.dynamic.ImageInvocationHandler;
import structural.proxy.non_dynamic.image.Image;

import java.lang.reflect.Proxy;

//Factory to get image objects. 
public class ImageFactory {
	//We'll provide proxy to caller instead of real object
	
	public static Image getImage(String name) {
		return (Image)Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class},
				new ImageInvocationHandler(name));
	}
}