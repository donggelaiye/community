package life.majiang.community.community.controller;

import life.majiang.community.community.DTO.AccessTokenDTO;
import life.majiang.community.community.DTO.GitHubUser;
import life.majiang.community.community.provider.GitHubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author chendong <dong.chen03@ucarinc.com>
 * @Version V1.0.0
 * @Date 2019/8/23
 */
@Controller
public class AuthorizeController {
    @Autowired
    GitHubProvider gitHubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_id("54a68da54eff89b86d2a");
        accessTokenDTO.setClient_secret("f1c14ebdd328ae5838cade04527e72bd82f42050");
        accessTokenDTO.setState(state);
        accessTokenDTO.setRedirect_url("http://localhost:8887/callback");
        String accessToken = gitHubProvider.getAccessToken(accessTokenDTO);
        GitHubUser user = gitHubProvider.getUser(accessToken);
        System.out.println(user.getName());
        return "index";
    }
}
