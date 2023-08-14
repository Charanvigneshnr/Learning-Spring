package com.charan.learnspringframework.businesscalculation;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
