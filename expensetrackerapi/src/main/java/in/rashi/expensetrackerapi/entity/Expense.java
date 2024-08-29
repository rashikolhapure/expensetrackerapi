package in.rashi.expensetrackerapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.*;
import java.sql.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_expenses")

public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "expense_name")
    private String name;

    private String description;

    @Column(name = "expense_amount")
    private BigDecimal amount;
    
    private String category;

    private Date date;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;
    
}