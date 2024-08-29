package in.rashi.expensetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import in.rashi.expensetrackerapi.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    
}
