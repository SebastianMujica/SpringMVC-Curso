package unidad1.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import unidad1.config.WebApplicationContextConfig;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

     @Override
     protected Class<?>[] getRootConfigClasses() {
     return new Class[] { RootApplicationContextConfig.class
     	};
     }
     @Override
     protected Class<?>[] getServletConfigClasses() {
          return new Class[] { WebApplicationContextConfig.class };
     }

     @Override
     protected String[] getServletMappings() {
          return new String[] { "/app/*" };
     }
}
