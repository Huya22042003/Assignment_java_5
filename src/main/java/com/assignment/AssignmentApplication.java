package com.assignment;

import com.assignment.infrastructure.contants.KhachHangTestContants;
import com.assignment.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class AssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication.class, args);
    }

}
