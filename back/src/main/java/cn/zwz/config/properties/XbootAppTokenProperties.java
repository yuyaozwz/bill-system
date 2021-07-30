package cn.zwz.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郑为中
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "xboot.app-token")
public class XbootAppTokenProperties {

    /**
     * 单平台登陆
     */
    private Boolean spl = true;

    /**
     * token过期时间（天）
     */
    private Integer tokenExpireTime = 30;
}