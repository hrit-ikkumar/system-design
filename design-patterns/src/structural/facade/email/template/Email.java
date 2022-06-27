package structural.facade.email.template;

import structural.facade.email.EmailBuilder;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
