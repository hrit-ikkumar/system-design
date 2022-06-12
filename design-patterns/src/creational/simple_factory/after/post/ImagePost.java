package creational.simple_factory.after.post;

/**
 * Represents a product information post. 
 *
 */
public class ImagePost extends Post {

	private String imageUrl;
	
	private String name;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
