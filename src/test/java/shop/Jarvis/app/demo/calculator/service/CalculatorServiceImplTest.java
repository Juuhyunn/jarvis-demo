package shop.Jarvis.app.demo.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import shop.Jarvis.app.demo.calculator.entity.Calculator;
import shop.Jarvis.app.demo.calculator.repository.CalculatorRepository;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CalculatorServiceImplTest {
    @MockBean
    CalculatorServiceImpl calculatorService;
    @Test
    public void CalculatorServiceImpl() {
        given(calculatorService.createRandomNumbers()).willReturn(30);
        assertThat(calculatorService.createRandomNumbers()).isEqualTo(30);
    }
}