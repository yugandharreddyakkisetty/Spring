package com.siemens.payroll.model;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.siemens.payroll.dao.*;
import com.siemens.payroll.dao.*;
@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository employeeRepositoryitory,OrderRepository orderRepository) {

    return args -> {
      log.info("Preloading " + employeeRepositoryitory.save(new Employee("Bilbo Baggins", "burglar")));
      log.info("Preloading " + employeeRepositoryitory.save(new Employee("Frodo Baggins", "thief")));
      employeeRepositoryitory.findAll().forEach(employee -> log.info("Preloaded " + employee));
      orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
      orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));
      orderRepository.findAll().forEach(order -> {
          log.info("Preloaded " + order);
        });
    };
  }
}