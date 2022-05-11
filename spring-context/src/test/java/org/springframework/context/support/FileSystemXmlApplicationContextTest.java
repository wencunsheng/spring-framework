package org.springframework.context.support;

import org.junit.jupiter.api.Test;

public class FileSystemXmlApplicationContextTest {
	@Test
	public void securityManagerDisallowsAccessToSystemEnvironmentButAllowsAccessToIndividualKeys() {
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("classpath:org/springframework/context/support/ClassPathXmlApplicationContextTests-resourceImport.xml");
		Object myMessageSource = fileSystemXmlApplicationContext.getBean("resource1");
		System.out.println(myMessageSource+"===============>");
	}
}
