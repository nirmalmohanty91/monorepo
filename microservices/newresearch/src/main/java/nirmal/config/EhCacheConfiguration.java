//package nirmal.config;
//
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cache.ehcache.EhCacheCacheManager;
//import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//@EnableJpaRepositories(basePackages="nirmal.repository")
//@EnableCaching
//@Configuration
//public class EhCacheConfiguration {
//
//
//    @Bean
//    public CacheManager caheManager(){
//	return new EhCacheCacheManager(cacheManagerFactory().getObject());
//    }
//
//    public EhCacheManagerFactoryBean cacheManagerFactory() {
//	EhCacheManagerFactoryBean bean= new EhCacheManagerFactoryBean();
//	bean.setConfigLocation(new ClassPathResource("ehcache.xml"));
//	bean.setShared(true);
//	return bean;
//    }
//
//}
