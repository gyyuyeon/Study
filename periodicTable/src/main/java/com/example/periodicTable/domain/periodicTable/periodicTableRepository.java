package com.example.periodicTable.domain.periodicTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface periodicTableRepository extends JpaRepository<periodicTable, Integer> {

}
