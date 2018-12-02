package ru.itpark.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    @DisplayName(("should calculate cashback for under limit amount"))
    void cashbackUnderLimit() {
        CashBackService service = new CashBackService();
        int result = service.cashback(1000);
        assertEquals(50,result);
    }
}