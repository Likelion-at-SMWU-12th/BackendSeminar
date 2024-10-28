package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.ProductDetail;

public interface ProviderRepository extends JpaRepository<Provider, Long> {

}
