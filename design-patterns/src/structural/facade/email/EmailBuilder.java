package structural.facade.email;

import structural.facade.email.stationary.Stationary;
import structural.facade.email.template.Email;
import structural.facade.email.template.Template;

public class EmailBuilder {

	public EmailBuilder withTemplate(Template template) {
		return this;
	}
	
	public EmailBuilder withStationary(Stationary stationary) {
		return this;
	}
	
	public EmailBuilder forObject(Object object) {
		return this;
	}
	
	public Email build() {
		return null;
	}
	
	public Email getEmail() {
		return null;
	}
}
