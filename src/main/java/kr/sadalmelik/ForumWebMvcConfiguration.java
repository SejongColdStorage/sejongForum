package kr.sadalmelik;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ForumWebMvcConfiguration extends WebMvcConfigurerAdapter {

    private final static int CACHE_PERIOD = 31556926;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/not-found").setViewName("common/404");
        registry.addViewController("/error").setViewName("common/500");

        registry.addViewController("/").setViewName("about");
        registry.addViewController("/about").setViewName("about");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String[] pathPatterns = new String[]{"/components/**", "/js/**", "/css/**", "/img/**"};
        String[] locations = new String[]{"assets/components/", "assets/js/", "assets/css/", "assets/img/"};
        int cachePeriod = CACHE_PERIOD;

        registry.addResourceHandler(pathPatterns)
                .addResourceLocations(locations)
                .setCachePeriod(cachePeriod);
    }

    @Bean
    public ViewResolver handlebarViewResolver() {

        HandlebarsViewResolver viewResolver = new HandlebarsViewResolver();
        viewResolver.setOrder(1);
        viewResolver.setPrefix("views/");
        viewResolver.setSuffix(".hbs");

        return viewResolver;
    }
}
