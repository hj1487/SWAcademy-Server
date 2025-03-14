package carbonneutral.academy.domain.point.repository;

import carbonneutral.academy.domain.point.Point;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PointJpaRepository extends JpaRepository<Point, Integer> {
    Optional<Point> findByUserId(int userId);
}
