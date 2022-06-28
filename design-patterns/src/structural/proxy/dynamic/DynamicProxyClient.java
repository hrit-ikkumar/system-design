package structural.proxy.dynamic;

import javafx.geometry.Point2D;
import structural.proxy.dynamic.factory.ImageFactory;
import structural.proxy.non_dynamic.image.Image;

public class DynamicProxyClient {

	public static void main(String[] args) {
		Image img = ImageFactory.getImage("A.bmp");
		img.setLocation(new Point2D(-10, 0));
		System.out.println(img.getLocation());
		System.out.println("*****************************");
		img.render();
		
	}
}
