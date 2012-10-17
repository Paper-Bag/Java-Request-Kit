package com.paperbag.javarequestkit;

import java.io.InputStream;

public interface IParser {
	Object parse(InputStream stream);
}
