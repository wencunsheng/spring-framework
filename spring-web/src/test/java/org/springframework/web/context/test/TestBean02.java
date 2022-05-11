package org.springframework.web.context.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@Scope(scopeName="prototype")
public class TestBean02 {
	@Autowired
	private TestBean01 testBean01;
}
