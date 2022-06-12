package creational.simple_factory.before;

import creational.simple_factory.before.post.BlogPost;
import creational.simple_factory.before.post.ImagePost;
import creational.simple_factory.before.post.NewsPost;
import creational.simple_factory.before.post.Post;

public class SimpleFactoryBefore {
    public static void main(String[] args) {
        Post post = getPostBasedOnType("news");
        System.out.println(post);
    }

    private static Post getPostBasedOnType(String type) {
        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ImagePost();
            default:
                throw new IllegalArgumentException("Post type is unown");
        }
    }
}

/*
	The problem with this is that we have coupled the selection of object in the same class. This class is having multiple functionality in it.

	We need to de-couple the creation of object based on the type
 */