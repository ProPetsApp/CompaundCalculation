package telran.java30;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CountResultController {

	 @GetMapping("/parameterForm")
	    public String parameterForm(Model model) {
	        model.addAttribute("countResult", new CountResult());
	        return "parameterForm";
	    }
	 @GetMapping("/parameterFormPercent")
	    public String parameterFormPercent(Model model) {
	        model.addAttribute("countResult", new PercentResult());
	        return "parameterFormPercent";
	    }
	 
	 @GetMapping("/parameterFormEndSum")
	    public String parameterFormEndSum(Model model) {
	        model.addAttribute("countResult", new EndSumResult());
	        return "parameterFormEndSum";
	    }

	    @PostMapping("/parameterForm")
	    public String CountResultSubmit(@ModelAttribute CountResult countResult) {
	        return "result";
	    }
	    
	    @PostMapping("/parameterFormPercent")
	    public String PercentResultSubmit(@ModelAttribute PercentResult percentResult) {
	        return "percentResult";
	    }
	    
	    @PostMapping("/parameterFormEndSum")
	    public String EndSumResultSubmit(@ModelAttribute EndSumResult endSumResult) {
	        return "endSumResult";
	    }

}