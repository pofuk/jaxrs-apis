package com.github.api.processor.method;

import java.lang.annotation.Annotation;

import javax.ws.rs.Path;

import com.github.api.processor.AnnotationHandler;
import com.github.api.request.RestRequest;

public class MethodPathHandler implements AnnotationHandler<Path> {

	@Override
	public boolean canHandle(Annotation annotation) {
		return annotation instanceof Path;
	}

	@Override
	public void handle(Path annotation, RestRequest request) {
		request.addPath(annotation.value());
	}
}
