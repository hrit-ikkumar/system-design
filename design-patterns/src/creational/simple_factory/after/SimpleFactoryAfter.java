package creational.simple_factory.after;

import creational.simple_factory.after.factory.PostFactory;
import creational.simple_factory.after.post.Post;

public class SimpleFactoryAfter {
	public static void main(String[] args) {
		// get object based on the type
		Post post = PostFactory.createPost("news");
		System.out.println(post);
	}
}

/*
	Now the code is decoupled from client class. It simply needs to pass the type
 */
