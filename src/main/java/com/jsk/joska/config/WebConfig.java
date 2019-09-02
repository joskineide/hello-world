package main.java.com.jsk.joska.config;

import java.beans.BeanProperty;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{
    private static final Sring UTF8_ENCODING = "UTF-8";

    public WebConfig(){
        super();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("**/*.css", "**/*.js", "**/*.map", "*.html", "sagger-ui.html")
                .addResourceLocations("classpath:META-INF/resources/").setCachePeriod(0);
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:META-INF/resources/webjars/");
    }

    @Bean
    public CorsFilter corsFilter(){
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSoruce();
    }
}