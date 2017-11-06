package com.example.jdbcdemo.service;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.jdbcdemo.domain.Brand;
import com.example.jdbcdemo.domain.Console;

public class ConsoleManagerTest {

	ConsoleManager consoleManager = new ConsoleManager();
	
	private final static String NAME_1 = "PlayStation";
	private final static Brand BRAND_1 = Sony;
	private final static int PREMIERE_1 = 1997;
	private final static double PRICE_1 = 899.00;
	
	@Test
	public void checkConnection(){
		assertNotNull(consoleManager.getConnection());
	}
	
	@Test
	public void checkAdding(){
		Console console = new Console(NAME_1, BRAND_1, PREMIERE_1, PRICE_1);
		
		consoleManager.clearConsoles();
		assertEquals(1,consoleManager.addConsole(console));
		
		List<Console> consoles = consoleManager.getAllConsoles();
		Console consoleRetrieved = consoles.get(0);
		
		assertEquals(NAME_1, consoleRetrieved.getName());
		assertEquals(BRAND_1, consoleRetrieved.getBrand());
		assertEquals(PREMIERE_1, consoleRetrieved.getPremiere());
		assertEquals(PRICE_1, consoleRetrieved.getPrice());
	}
	
	@Test
	public void checkAddAll(){
		consoleManager.clearConsoles();
		
		Console console1 = new Console(NAME_1, BRAND_1, PREMIERE_1, PRICE_1);
//		Console console2 = new Console(NAME_2, BRAND_2, YEAROFPREMIERE_2, PRICE_2);
//		Console console3 = new Console(NAME_3, BRAND_3, YEAROFPREMIERE_3, PRICE_3);
		
		List<Console> consoles = new ArrayList<>();
		consoles.add(console1);
//		consoles.add(console2);
//		consoles.add(console3);
		
		consoleManager.addAllConsoles(consoles);
		int size = consoleManager.getAllConsoles().size();
		assertThat(size, either(is(3)).or(is(0)));
	}
}
