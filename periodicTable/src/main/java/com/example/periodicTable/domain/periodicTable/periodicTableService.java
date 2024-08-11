package com.example.periodicTable.domain.periodicTable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class periodicTableService {

    @Autowired
    private periodicTableRepository periodicTableRepository;

    public List<periodicTable> gets() {
        return periodicTableRepository.findAll();
    }
    
 // 상태 값의 고유 리스트를 반환하는 메서드
    public List<String> getDistinctPeriodicSt() {
        return periodicTableRepository.findDistinctPeriodicSt();
    }
}

