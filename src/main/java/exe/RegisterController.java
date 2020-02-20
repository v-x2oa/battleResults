package exe;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class RegisterController {
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("message", "Hello register!!");
		return "register"; // 表示するHTMLファイルの名前（拡張子不要）を指定
	}
}
