package com.mykyta.simpletodo.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class MapperService {
	private final ModelMapper modelMapper;

	@Autowired
	public MapperService(final ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	public <S, T> T map(final S source, final Class<T> targetClass) {
		return modelMapper.map(source, targetClass);
	}

	public <S, T> List<T> mapAll(final List<S> sources, final Class<T> targetClass) {
		return sources.stream()
				.map(source -> map(source, targetClass))
				.collect(toList());
	}
}
