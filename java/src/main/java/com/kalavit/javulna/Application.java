/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalavit.javulna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author peti
 */
@SpringBootApplication
public class Application {
    /* ********OpenRefactory Warning********
	 Add @Import({
	LdapConfig.class,
	MyServletConfig.class,
	WebSocketConfig.class}) instead of @EnableAutoConfiguration
	*/

	/* ********OpenRefactory Warning********
	 Add @Import({
	LdapConfig.class,
	MyServletConfig.class,
	WebSocketConfig.class}) instead of @EnableAutoConfiguration
	*/

	public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
