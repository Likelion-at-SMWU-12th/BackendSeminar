package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.ProductDetail;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
