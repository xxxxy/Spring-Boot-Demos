/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2017/11/15</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package demo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: demo.helloworld
 * @ClassName: HelloWorldSpringBoot
 * @Author: huangjy
 * @Create Date: 2017/11/15
 * @Version: 1.0
 * @Description: 第一个Spring
 */
@RestController
public class HelloWorldSpringBoot {

    @RequestMapping("/")
    public String helloWorld() {
        return "helloWorld";
    }
}
