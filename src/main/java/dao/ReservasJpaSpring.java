package dao;

import model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservasJpaSpring extends JpaRepository<Reserva,Integer> {
}
