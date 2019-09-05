package com.opendecision.modeler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.hadoop.fs.FsShell;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;

@CrossOrigin
@EnableWebMvc
@EnableEurekaClient
@SpringBootApplication
public class ModelerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ModelerApplication.class, args);
	}

	@Autowired
	private FsShell shell;

	@Override
	public void run(String... args) throws IOException {

//		for (FileStatus s : shell.lsr("/input")) {
//			System.out.println("> " + s.getPath());
//		}

//		shell.mkdir("/input/test");
//		shell.put("D:\\2.txt", "hdfs://192.168.199.117:9000/input");
//		shell.rm("/input/test");
//		shell.rm("/input/2.cba");
//		shell.get("/input/1.txt", "D:\\z");

//		shell.copyToLocal("/input/2.cba","D:\\z");

	}



}
