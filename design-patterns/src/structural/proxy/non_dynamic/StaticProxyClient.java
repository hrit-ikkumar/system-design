package structural.proxy.non_dynamic;

import javafx.geometry.Point2D;
import structural.proxy.non_dynamic.factory.ImageFactory;
import structural.proxy.non_dynamic.image.Image;

public class StaticProxyClient {

	public static void main(String[] args) {
		Image img = ImageFactory.getImage("A1.bmp");
		
		img.setLocation(new Point2D(10,10));
		System.out.println("Image location :"+img.getLocation());
		System.out.println("rendering image now.....");
		img.render();
	}

}
