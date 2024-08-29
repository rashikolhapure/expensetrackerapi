package in.rashi.expensetrackerapi.service;

import java.util.*;

import in.rashi.expensetrackerapi.entity.Expense;;

public interface ExpenseService {

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    void deleteExpenseById(Long id);

    Expense saveExpenseDetails(Expense expense);

    Expense updateExpenseDetails(Long id, Expense expense);
}
