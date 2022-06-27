package structural.facade.email.template;

import structural.facade.email.template.strategy.OrderEmailTemplate;

public class TemplateFactory {

	public static Template createTemplateFor(Template.TemplateType type) {
		switch (type) {
		case Email:
			return new OrderEmailTemplate();
		default:
			throw new IllegalArgumentException("Unknown TemplateType");
		}
		
	}
}
