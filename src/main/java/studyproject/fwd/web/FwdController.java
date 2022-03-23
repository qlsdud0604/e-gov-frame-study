package studyproject.fwd.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import studyproject.fwd.service.FwdVO;

@Controller
public class FwdController {

    @RequestMapping(value = "/reqUrl.do", method = RequestMethod.GET)
    public String reqUrl(@ModelAttribute FwdVO searchVO, ModelMap modelMap) throws Exception {

        if (searchVO.getRequestNumber() == 1)
            return "redirect:https://www.naver.com";
        else if (searchVO.getRequestNumber() == 2)
            return "redirect:https://www.daum.net";

        return "redirect:https://www.google.co.kr";
    }
}
