package in.rashi.expensetrackerapi.service;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.*;
import in.rashi.expensetrackerapi.entity.Expense;;

public interface ExpenseService {

    Page<Expense> getAllExpenses(Pageable page);

    Expense getExpenseById(Long id);

    void deleteExpenseById(Long id);

    Expense saveExpenseDetails(Expense expense);

    Expense updateExpenseDetails(Long id, Expense expense);

    List<Expense> readByName(String name, Pageable page);

    List<Expense> readByCategory(String category, Pageable page);

    List<Expense> readByDate(Date startDate, Date endDate, Pageable page);
}
