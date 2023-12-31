package com.example.billtracking.repository;

import com.example.billtracking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.billtracking.model.Expense;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Integer> {
    List<Expense> findByUserUsername(String username);

    void delete(Expense expense);
}
