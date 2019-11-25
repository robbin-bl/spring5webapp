package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by robbin-bl on 25-11-2019
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
