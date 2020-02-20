package exe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TopController {
	 @Autowired
	 TotalResultsService totalResultsService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		System.out.println("index");
		String totalMatch = "1000";
		String totalWin = "600";
		String totalRate = "60";
		String vicOrDef[] = {"Win", "Lose"};
		String thisMonthRate[] = {"60", "40"};
		String cost[] = {"1500", "2000", "2500", "3000"};
		String costRate[] = {"10", "30", "30", "30"};
		String monthLabel[] = { "1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月"};
		String rule[] = {"シャッフル", "フリー"};
		int ruleRate[] = {40, 60};
		int monthWinRate[] = { 50, 55, 50, 60, 55, 65, 60, 63, 66, 71, 68, 69};
		List<TotalResults> dataList = totalResultsService.findAll();
		
		model.addAttribute("totalMatch", totalMatch);
		model.addAttribute("totalWin", totalWin);
		model.addAttribute("totalRate", totalRate);
		model.addAttribute("vicOrDef", vicOrDef);
		model.addAttribute("thisMonthRate", thisMonthRate);
		model.addAttribute("cost", cost);
		model.addAttribute("costRate", costRate);
		model.addAttribute("rule", rule);
		model.addAttribute("ruleRate", ruleRate);
		model.addAttribute("monthLabel", monthLabel);
		model.addAttribute("monthWinRate", monthWinRate);
		return "index"; // 表示するHTMLファイルの名前（拡張子不要）を指定
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		System.out.println("register");
		return "register"; // 表示するHTMLファイルの名前（拡張子不要）を指定
	}
}
