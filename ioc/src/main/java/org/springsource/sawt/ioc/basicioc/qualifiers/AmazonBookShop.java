package org.springsource.sawt.ioc.basicioc.qualifiers;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component 
public class AmazonBookShop implements BookShop {
	
	@PostConstruct 
	public void setUp()  { 
	 System.out.println( "starting the "+getClass().getName()+ ".");	
	}
	
	@Override
	public long sell(String isbn) {
		 
		return 0;
	}

	@Override
	public long buy(String isbn) {
		 
		return 0;
	}
	
}
