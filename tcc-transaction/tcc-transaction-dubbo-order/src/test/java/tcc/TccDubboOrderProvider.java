/*
 * ====
 * 陈德元：



 * ====
 */
package tcc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @描述: 启动Dubbo服务用的MainClass.
 * @作者: WuShuicheng .
 * @创建时间: 2016-06-22,下午9:47:55 .
 * @版本: 1.0 .
 */
public class TccDubboOrderProvider {
	private static final Log log = LogFactory.getLog(TccDubboOrderProvider.class);
	
    public static void main(String[] args) {
    	
        try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/spring/local/appcontext.xml");
			context.start();
		} catch (Exception e) {
			log.error("== TccDubboOrderProvider context start error:",e);
		}
        
        synchronized (TccDubboOrderProvider.class) {
            while (true) {
                try {
                    TccDubboOrderProvider.class.wait();
                } catch (InterruptedException e) {
                	log.error("== synchronized error:",e);
                }
            }
        }
    }
    
}