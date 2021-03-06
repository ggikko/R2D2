package me.r2d2.restaurant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by Park Ji Hong, ggikko.
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, String> {

    Restaurant findBySubwayNumber(String subwayNumber);

}
