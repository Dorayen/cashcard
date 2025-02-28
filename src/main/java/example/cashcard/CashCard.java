package example.cashcard;

// Adicionar  anotación @Id
import org.springframework.data.annotation.Id;

record CashCard(@Id Long id, Double amount) {
}