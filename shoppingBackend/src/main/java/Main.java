import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ecom.shoppingBackend.config.AppConfig;
import com.ecom.shoppingBackend.dto.Category;
import com.ecom.shoppingBackend.service.CategoryService;


public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CategoryService service = (CategoryService) context.getBean("categoryService");
		
		Category category= new Category(201, "Kitchen", "Kitchen Descriprion ", "aacv.png", false);
		service.saveCategory(category);
		
		context.close();
		
		
		
	}
	
	
}
