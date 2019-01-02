import com.baba.server.JaxrsServerImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * @Author: Ant
 * @Date: 2018/12/14 15:29
 * @Version 1.0
 */
public class Server {

    public static void main(String[] args) {
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setAddress("http://localhost:8111/rs/");
        factoryBean.setServiceBean(new JaxrsServerImpl());

        // 添加日志输入输出拦截器
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

        factoryBean.create();
        System.out.println("服务发布成功！");
    }


}
