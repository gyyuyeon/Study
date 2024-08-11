package com.example.periodicTable.domain.periodicTable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface periodicTableRepository extends JpaRepository<periodicTable, Integer> {

    @Query("SELECT DISTINCT p.periodicSt FROM periodicTable p")
    List<String> findDistinctPeriodicSt();
}
