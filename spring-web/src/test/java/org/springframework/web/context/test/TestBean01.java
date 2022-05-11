package org.springframework.web.context.test;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean01 {
	@Autowired
	private TestBean02 testBean02;
}
