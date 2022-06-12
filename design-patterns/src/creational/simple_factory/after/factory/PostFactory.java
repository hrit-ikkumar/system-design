package creational.simple_factory.after.factory;

import creational.simple_factory.after.post.BlogPost;
import creational.simple_factory.after.post.NewsPost;
import creational.simple_factory.after.post.Post;
import creational.simple_factory.after.post.ImagePost;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
public class PostFactory {

    public static Post createPost(String type) {
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
    If we want to extend the functionality of posts we can simply add them here for new type of posts
    When to use:
        When we have selection of object based on different types or properties
        All the classes should extend or implement the single interface
 */