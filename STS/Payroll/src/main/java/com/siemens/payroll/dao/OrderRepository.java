package com.siemens.payroll.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.siemens.payroll.model.*;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
