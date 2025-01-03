package com.sbi.oem.serviceImpl;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.InputStreamResource;

class MultipartInputStreamFileResources extends InputStreamResource {

	private final String filename;

	MultipartInputStreamFileResources(InputStream inputStream, String filename) {
		super(inputStream);
		this.filename = filename;
	}

	@Override
	public String getFilename() {
		return this.filename;
	}

	@Override
	public long contentLength() throws IOException {
		return -1;
	}
}