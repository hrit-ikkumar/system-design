package structural.facade.email;

import structural.facade.Order;
import structural.facade.email.stationary.Stationary;
import structural.facade.email.stationary.StationaryFactory;
import structural.facade.email.template.Email;
import structural.facade.email.template.Template;
import structural.facade.email.template.TemplateFactory;

// Facade provides simple methods for client to use
public class EmailFacade {
    // Method handles interactions with subsystem classes
    public boolean sendOrderEmail(Order order) {
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);

        Stationary stationary = StationaryFactory.createStationary();

        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();

        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }
}
