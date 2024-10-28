package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.ProductDetail;

public interface ProducerRepository extends JpaRepository<Producer, Long> {

}
