package top.xbynet;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "serviceb1", fallback = CallHelloBCtrl.CallHelloBCtrlFallback.class)
public interface CallHelloBCtrl {
	@RequestMapping(method = RequestMethod.GET, value = "/")
	String hello();

	@Component
	static class CallHelloBCtrlFallback implements CallHelloBCtrl {
		@Override
		public String hello() {
			return "fallback";
		}
	}
}