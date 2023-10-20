package com.mykyta.simpletodo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.lang.Boolean.TRUE;
import static org.modelmapper.config.Configuration.AccessLevel.PRIVATE;
import static org.modelmapper.convention.MatchingStrategies.STRICT;

@Configuration
public class Config {

	@Bean
	public ModelMapper modelMapper() {
		final ModelMapper modelMapper = new ModelMapper();

		modelMapper.getConfiguration()
				.setMatchingStrategy(STRICT)
				.setFieldMatchingEnabled(TRUE)
				.setSkipNullEnabled(TRUE)
				.setFieldAccessLevel(PRIVATE)
				.setDeepCopyEnabled(TRUE);

		return modelMapper;
	}
}
