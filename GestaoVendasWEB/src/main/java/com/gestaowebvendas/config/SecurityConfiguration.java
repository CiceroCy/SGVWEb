package com.gestaowebvendas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author anderson.aristides
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	@Value("${spring.queries.users.query}")
	private String usersQuery;

	@Value("${spring.queries.roles.query}")
	private String rolesQuery;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("admin");
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("//**", "/assets/**").permitAll().antMatchers(HttpMethod.OPTIONS, "/**")
				.permitAll().anyRequest().authenticated().and().httpBasic().and().csrf().disable();
	}

//	@Autowired
//	private DataSource dataSource;
//
//	@Value("${spring.queries.users.query}")
//	private String usersQuery;
//
//	@Value("${spring.queries.roles.query}")
//	private String rolesQuery;
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		ShaPasswordEncoder shaPasswordEncoder = new ShaPasswordEncoder(256);
//		auth.jdbcAuthentication().usersByUsernameQuery(usersQuery).authoritiesByUsernameQuery(rolesQuery)
//				.dataSource(dataSource).passwordEncoder(shaPasswordEncoder);
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf()
//				.disable()
//				.authorizeRequests()
//				.antMatchers("/plain/assets/**")
//				.permitAll().anyRequest()
//				.authenticated()
//			.and()
//				.formLogin()
//				.defaultSuccessUrl("/page/dashboard.html", true).loginPage("/plain/login.html").permitAll()
//			.and()
//				.logout()
//				.permitAll();
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/plain/assets/**");
//	}
//
//	@Bean
//	@Override
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}

}
