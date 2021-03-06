package top.xbynet;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taojiawei
 * @create 2017/12/22
 **/
@RefreshScope
@RestController
@Api
@RequestMapping("/")
public class HelloBController {
	@Value("${haha}")
	private String haha;

	@GetMapping("")
	public String hello(){
		return "hello "+haha;
	}

}
