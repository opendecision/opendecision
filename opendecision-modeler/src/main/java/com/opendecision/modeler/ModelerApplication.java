package com.opendecision.modeler;


import org.apache.hadoop.fs.FileStatus;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.hadoop.fs.FsShell;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;

@EnableWebMvc
@MapperScan(basePackages = "com.opendecision.modeler.mapper")
@SpringBootApplication
public class ModelerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ModelerApplication.class, args);
	}

	@Autowired
	private FsShell shell;

	@Override
	public void run(String... args) throws IOException {

		for (FileStatus s : shell.lsr("/input")) {
			System.out.println("> " + s.getPath());
		}
	}



}
