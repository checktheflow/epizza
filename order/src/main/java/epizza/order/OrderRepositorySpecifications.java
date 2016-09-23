package epizza.order;

import org.springframework.data.jpa.domain.Specification;

class OrderRepositorySpecifications {
    static Specification<Order> deliveryBoyIsNull() {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.isNull(root.get("deliveryBoy"));
    }
}